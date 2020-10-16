package ProgrammingChallenges.Ch4;
import java.io.*;
import java.util.Scanner;

/*
- Write a program that asks the user for the name of a file 
- The program should display only the 1st 5 lines of the file’s contents 
- If the file contains fewer than 5 lines, it should display the file’s entire contents
*/

public class pc13pg265 {
	public static void main(String[] args) throws IOException {
		Scanner kbi = new Scanner(System.in);
		
		System.out.print("enter the file name: ");
		String fileName = kbi.nextLine();
		
		File file = new File(fileName);
		
		System.out.println();
		
		if(file.exists()) {
			System.out.println(fileName + " already exists");
			//System.exit(0);
		}else {
			System.out.println(fileName + " doesn't exist yet");
		}
		
		System.out.println();
		
		PrintWriter outputFile = new PrintWriter(fileName);
		
		outputFile.println("Eine halbe Tasse Staubzucker");
		outputFile.println("Ein Viertel Teelöffel Salz");
		outputFile.println("Eine Messerspitze türkisches Haschisch");
		outputFile.println("Ein halbes Pfund Butter");
		outputFile.println("Ein Teelöffel Vanillenzucker");
		outputFile.println("Ein halbes Pfund Mehl");
		outputFile.println("Einhundertfünfzig Gramm gemahlene Nüsse");
		outputFile.println("Ein wenig extra Staubzucker");
		outputFile.println("... und keine Eier");
		
		outputFile.close();
		
		Scanner inputFile = new Scanner(file);
		int counter = 0;
		
		while(inputFile.hasNext()) {
			String lines = inputFile.nextLine();
			
			if(counter < 5) {
				System.out.println(lines);
				counter++;
			}
			//counter++;
		}
		
		inputFile.close();
		kbi.close();
	}
}
