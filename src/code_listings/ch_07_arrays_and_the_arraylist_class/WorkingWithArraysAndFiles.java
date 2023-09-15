package code_listings.ch_07_arrays_and_the_arraylist_class;
import java.io.*;
import java.util.Scanner;
import java.util.Random;

public class WorkingWithArraysAndFiles {
	public static void main(String[] args) throws IOException {
		Scanner kbi = new Scanner(System.in);
		
		String fileName; // Values.txt
		
		Random randomNo = new Random();
		
		System.out.print("\nthe number of indices in the array: ");
		
		int indices = kbi.nextInt();
		
		int[] array = new int[indices];
		
		for(int index = 0; index < array.length; index++) {
			array[index] = randomNo.nextInt(indices);
		}
		
		kbi.nextLine();
		
		System.out.print("\nenter the file name: ");
		
		fileName = kbi.nextLine();
		
		File file = new File(fileName);
		
		if(file.exists()) {
			System.out.println("\n" + fileName + " has been created. Plz try another file name");
			
			System.exit(0);
		}
		
		// write the array elements to the file
		PrintWriter outputFile = new PrintWriter(file);
		
		for(int i = 0; i < array.length; i++) {
			outputFile.println(array[i]);
		}
		
		outputFile.close();
		
		// open the file & read its contents back into the array
		int index = 0;
		
		Scanner inputFile = new Scanner(file);
		
		while(inputFile.hasNext() && index < array.length) {
			array[index] = inputFile.nextInt();
			
			index++;
		}
		
		inputFile.close();
		
		kbi.close();
	}
}
