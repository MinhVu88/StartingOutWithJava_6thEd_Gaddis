package code_listings.ch_11_exceptions_and_advanced_fileio;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

/*
- All of the programs that you have created to access files so far have performed sequential file access 

- With sequential access, when a file is opened for input, its read position is at the very beginning of the file 

- This means that the 1st time data is read from the file, the data will be read from its beginning 

- As the reading continues, the file�s read position advances sequentially through the file�s contents
*/

/*
- The problem with sequential file access is that in order to read a specific byte from the file, all the bytes that precede it must be read 1st 

- For instance, if a program needs data stored at the 100th byte of a file, it will have to read the 1st 99 bytes to reach it 

- If you�ve ever listened to a cassette tape player, you understand sequential access 

- To listen to a song at the end of the tape, you have to listen to all the songs that are before it or fast-forward over them 

- There is no way to jump immediately to that particular song
*/

/*
- Although sequential file access is useful in many circumstances, it can slow down a program tremendously 

- If the file is very large, locating data buried deep inside it can take a long time 

- Alternatively, Java allows a program to perform random file access 

- In random file access, a program may immediately jump to any location in the file without 1st reading the preceding bytes 

- The difference between sequential & random file access is like the difference between a cassette tape & a compact disc 

- When listening to a CD, there is no need to listen to or fast-forward over unwanted songs 

- You simply jump to the track that you want to listen to
*/

/*
- To create & work with random access files in Java, you use the RandomAccessFile class, which is in the java.io package 

- The general format of the class constructor is as follows:		RandomAccessFile(String filename, String mode)

- The 1st argument is the name of the file 

- The 2nd argument is a string indicating the mode in which you wish to use the file 

- The 2 modes are "r" for reading & "rw" for reading & writing 

- When a file is opened with "r" as the mode, the program can only read from the file 

- When a file is opened with "rw" as the mode, the program can read from the file & write to it 

- Here are some examples of statements that open files using the RandomAccessFile class:

// Open a file for random reading.
RandomAccessFile randomFile = new RandomAccessFile("MyData.dat", "r");

// Open a file for random reading and writing.
RandomAccessFile randomFile = new RandomAccessFile("MyData.dat", "rw");

- Here are some important points to remember about the 2 modes:

� If you open a file in "r" mode & the file does not exist, a FileNotFoundException will be thrown

� If you open a file in "r" mode & try to write to it, an IOException will be thrown

� If you open an existing file in "rw" mode, it will not be deleted. The file�s existing contents will be preserved

� If you open a file in "rw" mode & the file does not exist, it will be created
*/

/*
- A file that is opened or created with the RandomAccessFile class is treated as a binary file 

- In fact, the RandomAccessFile class has the same methods as the DataOutputStream class for writing data & 
	the same methods as the DataInputStream class for reading data 

- In fact, you can use the RandomAccessFile class to process a binary file sequentially 

- For example, WriteLetters.java opens a file named Letters.dat & writes all of the letters of the alphabet to the file

- After this program executes, the letters of the alphabet will be stored in the Letters.dat file

- Because the writeChar method was used, the letters will each be stored as 2-byte characters

- This is important to know later when we want to read the characters from the file
*/

public class WriteLetters {

	public static void main(String[] args) throws IOException {
		char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n',
							'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
		
		Scanner kbi = new Scanner(System.in);
		
		System.out.print("\nenter the file name: ");
		
		String fileName = kbi.nextLine();
		
		File file = new File(fileName);
		
		if(file.exists()) {
			System.out.println("\n" + fileName + " has been created");
		}else {
			System.out.println("\n" + fileName + " hasn't been created");
		}
		
		System.out.println("\nopen " + fileName + " for reading & writing");
		
		RandomAccessFile randomFile = new RandomAccessFile(file, "rw");
		
		System.out.println("\nwriting data to " + fileName);
		
		for(int index = 0; index < alphabet.length; index++) {
			randomFile.writeChar(alphabet[index]);
		}
		
		randomFile.close();
		kbi.close();
		
		System.out.println("\nDone");
	}

}
