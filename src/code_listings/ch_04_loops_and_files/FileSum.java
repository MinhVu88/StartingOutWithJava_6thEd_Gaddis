package code_listings.ch_04_loops_and_files;
import java.util.Scanner;
import java.io.*;

public class FileSum {
	public static void main(String[] args) throws IOException {
		double individualValues, total = 0.0; // total is an accumulator to store the sum of the values specified in Numbers.txt, thus it must be initialized to 0.0
		int numberOfValues;
		
		Scanner kb = new Scanner(System.in);
		
		System.out.print("enter the file name: ");
		String fileName = kb.nextLine();
		
		System.out.print("enter the number of floating-point values: ");
		numberOfValues = kb.nextInt();
		
		PrintWriter outputFile = new PrintWriter(fileName);
		
		for(int i = 1; i <= numberOfValues; i++) {
			System.out.print("the floating-point value number " + i + ": ");
			individualValues = kb.nextDouble();
			outputFile.println(individualValues);
		}
		
		outputFile.close();
		
		File file = new File(fileName);
		Scanner inputFile = new Scanner(file);
		
		while(inputFile.hasNext()) {
			individualValues = inputFile.nextDouble();
			total += individualValues;
		}
		
		inputFile.close();
		//outputFile.close();
		kb.close();
		
		System.out.println("the total values in Numbers.txt: " + total);
	}
}
