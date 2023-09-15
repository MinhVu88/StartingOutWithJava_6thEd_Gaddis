package challenges.ch11;

/*
- Write an exception class named InvalidTestScore. 

- Modify TestScores.java so that it throws an InvalidTestScore exception if any of the test scores in the array are invalid 
*/

public class InvalidTestScore extends IllegalArgumentException {
	
	public InvalidTestScore() {super("\n\t-> Invalid test score: #");}
}
