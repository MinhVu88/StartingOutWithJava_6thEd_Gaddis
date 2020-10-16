package CodeListings.Chapter6AFirstLookAtClasses;
import java.util.Scanner;
import java.util.Random;
import java.io.*;


public class ObjectDemo {
	public static void main(String[] args) throws IOException {
		Scanner kbi = new Scanner(System.in); // an instance of the Scanner class, kbi, is created to read keyboard input
		Random randomNumber = new Random(); // an instance of the Random class, randomNumber, is created to generate a random number
		
		int randomNo, numberOfRandNo;
		String fileName;
		
		System.out.print("\nenter the file name: ");
		fileName = kbi.nextLine();
		
		File file = new File(fileName);
		
		if(!file.exists()) {
			System.out.println("\n" + fileName + " hasn't been created yet");
		}
		
		PrintWriter outputFile = new PrintWriter(file); // an instance of the PrintWriter class, outputFile, is created to write data to a file
		
		System.out.print("\nthe number of random values: ");
		numberOfRandNo = kbi.nextInt();
		
		for(int counter = 0; counter < numberOfRandNo; counter++) {
			randomNo = randomNumber.nextInt(); // generate a specified set of random numbers
			outputFile.println("\t" + randomNo); // write those random numbers to the file
		}
		
		System.out.println("\nDone");
		
		outputFile.close();
		
		kbi.close();
	}
}
