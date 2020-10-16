package CodeListings.Chapter9TextProcessingAndWrapperClasses;
import java.io.*;

// This program uses TestScoreReader.java to read test scores from a file & get their averages

public class TestAverages {

	public static void main(String[] args) throws IOException {
		int studentNo = 1;
		
		TestScoreReader scores = new TestScoreReader("Grades.csv");
		
		while(scores.readNextLine()) {
			System.out.print("\nthe average of student # " + studentNo + ": " + scores.getAverages());
			
			studentNo++;
		}
		
		scores.closeFile();
		
		System.out.println("\n\n\tno more scores");
	}

}
