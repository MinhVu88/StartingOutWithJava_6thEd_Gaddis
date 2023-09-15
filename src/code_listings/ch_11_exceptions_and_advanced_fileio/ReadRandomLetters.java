package code_listings.ch_11_exceptions_and_advanced_fileio;

/*
- The RandomAccessFile class treats a file as a stream of bytes 

- The bytes are numbered, with the 1st byte being byte 0 

- The last byte�s number is 1 less than the number of bytes in the file 

- These byte numbers are similar to an array�s subscripts & are used to identify locations in the file
*/

/*
- Internally, the RandomAccessFile class keeps a long integer value known as the file pointer

- The file pointer holds the byte number of a location in the file 

- When a file is 1st opened, the file pointer is set to 0 

- This causes it to �point� to the 1st byte in the file 

- When an item is read from the file, it is read from the byte that the file pointer points to 

- Reading also causes the file pointer to advance to the byte just beyond the item that was read 

- For example, let�s say the file pointer points to byte 0 & an int is read from the file with the readInt method 

- An int is 4 bytes in size, so 4 bytes will be read from the file, starting at byte 0 

- After the value is read, the file pointer will be advanced to byte number 4, which is the 5th byte in the file 

- If another item is immediately read, the reading will begin at byte number 4 

- If the file pointer refers to a byte number that is beyond the end of the file, an EOFException is thrown when a read operation is performed
*/

/*
- Writing also takes place at the location pointed to by the file pointer 

- If the file pointer points to the end of the file when a write operation is performed, then the data will be written to the end of the file 

- However, if the file pointer holds the number of a byte within the file, at a location where data is already stored, 
	then a write operation will cause data to be written over the existing data at that location
*/

/*
- Not only does the RandomAccessFile class let you read & write data but also it allows you to move the file pointer 

- This means that you can immediately read data from any byte location in the file 

- It also means that you can write data to any location in the file, over existing data 

- To move the file pointer, you use the seek method 

- Here is the method�s general format:		void seek(long position)

- The argument is the number of the byte that you want to move the file pointer to 

- For example, look at the following code:

			RandomAccessFile file = new RandomAccessFile("MyInfo.dat", "r");

			file.seek(99);

			byte b = file.readByte();

- This code opens the file MyInfo.dat for reading 

- The seek method is called to move the file pointer to byte number 99 (which is the 100th byte in the file) 

- Then, the readByte method is called to read byte number 99 from the file 

- After that statement executes, the file pointer will be advanced by 1 byte, so it will point to byte 100 

- Suppose we continue processing the same file with the following code:

			file.seek(49);

			int i = file.readInt();

- 1st, the seek method moves the file pointer to byte number 49 (which is the 50th byte in the file) 

- Then the readInt method is called 

- This reads an int from the file 

- An int is 4 bytes in size, so this statement reads 4 bytes, beginning at byte number 49 

- After the statement executes the file pointer will be advanced by 4 bytes, so it will point to byte 53

- Although a file might contain chars, ints, doubles, strings & so forth, the RandomAccessFile class sees it only as a stream of bytes 

- The class is unaware of the data types of the data stored in the file & it cannot determine where 1 item of data ends & another begins

- When you write a program that reads data from a random access file, it is your responsibility to know how the data is structured
*/

/*
- For example, recall that WriteLetters.java wrote the letters of the alphabet to the letters.dat file 

- Let�s say the 1st letter is character 0, the 2nd letter is character 1 & so forth 

- Suppose we want to read character 5 (the 6th letter in the file) 

- At 1st, we might be tempted to try the following code:

			// Open the file for reading
			RandomAccessFile randomFile = new RandomAccessFile("letters.dat", "r");

			// Move the file pointer to byte 5, which is the 6th byte
			randomFile.seek(5);

			// Read the character
			char ch = randomFile.readChar();

			// What will this display?
			System.out.println("The 6th letter is " + ch);

- Although this code will compile & run, you might be surprised at the result 

- Recall that the writeChar method writes a character as 2 bytes 

- Because each character occupies 2 bytes in the file, the 6th character begins at byte 10, not byte 5 

- In fact, if we try to read a character starting at byte 5, we will read garbage because byte 5 is not at the beginning of a character

- To determine the position of a character in the file, we must take each character�s size into account 

- The following code will correctly read & display the 6th character 

- To determine the character�s starting byte number, it multiplies the size of a character by the number of the character we want to locate

			final int CHAR_SIZE = 2; 	// Each char uses 2 bytes

			// Move the file pointer to character 5
			randomFile.seek(CHAR_SIZE * 5);

			// Read the character
			char ch = randomFile.readChar();

			// This will display the correct character
			System.out.println("The 6th character is " + ch);

- ReadRandomLetters.java demonstrates further & randomly reads characters 5, 10 & 3 from the file
*/

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class ReadRandomLetters {

	public static void main(String[] args) throws IOException {
		final int CHAR_SIZE = 2; // Each char uses 2 bytes
		
		long byteLocationNo;
		
		char ch;
		
		Scanner kbi = new Scanner(System.in);
		
		System.out.print("\nenter the file name: ");
		
		String fileName = kbi.nextLine();
		
		File file = new File(fileName);
		
		if(file.exists()) {
			System.out.println("\n\t" + fileName + " has been created");
		}else {
			System.out.println("\n\t" + fileName + " hasn't been created");
		}
		
		System.out.println("\n\topen " + fileName + " for reading");
		
		RandomAccessFile randomFile = new RandomAccessFile(file, "r");
		
		// move the file pointer to the character 5 (the 6th character from the start of the file)
		byteLocationNo = CHAR_SIZE * 5;
		
		randomFile.seek(byteLocationNo);
		
		ch = randomFile.readChar();
		
		System.out.println("\nthe 6th character from the start of the file: " + ch);
		
		// move to char 10 (11th char), read & display it
		byteLocationNo = CHAR_SIZE * 10;
		
		randomFile.seek(byteLocationNo);
		
		System.out.println("\nthe 11th char from the start of the file: " + randomFile.readChar());
		
		// move to char 3 (4th char), read & display it
		byteLocationNo = CHAR_SIZE * 3;
		
		randomFile.seek(byteLocationNo);
		
		System.out.println("\nthe 4th char from the start of the file: " + randomFile.readChar());
		
		randomFile.close();
		kbi.close();
	}

}
