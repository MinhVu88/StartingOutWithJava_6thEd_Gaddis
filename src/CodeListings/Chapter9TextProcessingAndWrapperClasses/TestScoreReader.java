package CodeListings.Chapter9TextProcessingAndWrapperClasses;
import java.util.Scanner;
import java.io.*;

/*
- Professor Harrison keeps her students’ test scores in a Microsoft Excel spreadsheet, which shows a set of 5 test scores for 5 students 

- Each column holds a test score & each row represents the scores for 1 student

- In addition to manipulating the scores in Excel, Dr. Harrison wants to write TestScoreReader.java to access them 

- Excel, like many commercial applications, has the ability to export data to a text file 

- When the data in a spreadsheet is exported, each row is written to a line & the values in the cells are separated by commas 

- For example, when the data is exported, it will be written to a text file in the following format:

student 1's test scores:	87,79,91,82,94
student 2's test scores:	72,79,81,74,88
student 3's test scores:	94,92,81,89,96
student 4's test scores:	77,56,67,81,79
student 5's test scores:	79,82,85,81,90

- This is called the comma separated value file format 

- When you save a spreadsheet in this format, Excel saves it to a file with the .csv extension 

- Dr. Harrison decides to export her spreadsheet to a .csv file & then write a Java program that reads the file 

- The program will use the String class’s split method to extract the test scores from each line & a wrapper class to convert the tokens to numeric values

- The constructor accepts the name of a file as an argument & opens the file 

- The readNextLine method reads a line from the file & stores it in the line field 

- The method returns true if a line was successfully read from the file or false if there are no more lines to read 

- The getAverage method tokenizes the last line read from the file, converts the tokens to int values & calculates the average of the values 

- The average is returned 

- TestAverages.java uses the TestScoreReader class to open the file Grades.csv & get the averages of the test scores it contains
*/

public class TestScoreReader {
	private Scanner inputFile;
	
	private String line;

	public TestScoreReader(String fileName) throws IOException {
		File file = new File(fileName);
		
		if(file.exists()) {
			System.out.println("\n\t" + fileName + " has been created");
		}else {
			System.out.println("\n\t" + fileName + " hasn't been created");
		}
		
		this.inputFile = new Scanner(file);
	}
	
	public boolean readNextLine() {
		boolean status;
		
		if(this.inputFile.hasNext()) {
			status = true;
			
			this.line = this.inputFile.nextLine();
		}else {
			status = false;
		}
		
		return status;
	}
	
	public double getAverages() {
		int total = 0; // accumulator
		
		String[] tokens = this.line.split(",");
		
		for(String token : tokens) {
			total += Integer.parseInt(token);
		}
		
		double average = (double) total / tokens.length;
		
		return average;
	}
	
	public void closeFile() throws IOException {
		this.inputFile.close();
	}
}
