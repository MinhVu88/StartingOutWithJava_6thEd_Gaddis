package challenges.ch7;

/*
- The local Driver�s License Office has asked you to write a program that grades the written portion of the driver�s license exam 

- The exam has 20 multiple choice questions. Here are the correct answers:

1. B	6. A	11. B	16. C
2. D	7. B	12. C	17. C
3. A	8. A	13. D	18. B
4. A	9. C	14. A	19. D
5. C	10. D	15. D	20. A

- A student must correctly answer 15 of the 20 questions to pass the exam

- Write a class named DriverExam that holds the correct answers to the exam in an array field

- The class should also have an array field that holds the student�s answers 

- The class should have the following methods:

� passed: Returns true if the student passed the exam or false if the student failed

� totalCorrect: Returns the total number of correctly answered questions

� totalIncorrect: Returns the total number of incorrectly answered questions

� questionsMissed: An int array containing the question numbers of the questions that the student missed

- Demonstrate the class in a complete program that asks the user to enter a student�s answers 
	and then displays the results returned from the DriverExam class�s methods

- Input Validation: Only accept the letters A, B, C or D as answers
*/

public class DriverExam {
	private static String[] correctAnswers = {"B", "D", "A", "A", "C", "A", "B", "A", "C", "D", "B", "C", "D", "A", "D", "C", "C", "B", "D", "A"}; 
	
	private String[] studentAnswers;

	public DriverExam() {}

	/**
	 * @param correctAnswers
	 * @param studentAnswers
	 */
	public DriverExam(String[] correctAnswers, String[] studentAnswers) {
		DriverExam.correctAnswers = correctAnswers;
		this.studentAnswers = studentAnswers;
	}	
	
	/**
	 * @param studentAnswers
	 */
	public DriverExam(String[] studentAnswers) {
		this.studentAnswers = new String[studentAnswers.length];
		
		for(int index = 0; index < studentAnswers.length; index++) {
			this.studentAnswers[index] = studentAnswers[index];
		}
	}

	public boolean passed() {
		if(totalCorrect() >= (DriverExam.correctAnswers.length - 5)) {
			return true;
		}
		
		return false;
	}
	
	public int totalCorrect() {
		int total = 0;
		
		for(int index = 0; index < DriverExam.correctAnswers.length; index++) {
			if(this.studentAnswers[index].equalsIgnoreCase(DriverExam.correctAnswers[index])) {
				total++;
			}
		}
		
		return total;
	}
	
	public int totalIncorrect() {
		int total = 0;
		
		for(int index = 0; index < DriverExam.correctAnswers.length; index++) {
			if(!this.studentAnswers[index].equalsIgnoreCase(DriverExam.correctAnswers[index])) {
				total++;
			}
		}
		
		return total;
	}
	
	public int[] questionsMissed() {
		int[] unansweredQuestions = new int[DriverExam.correctAnswers.length - totalCorrect()];
		
		int questionNo = 0;
		
		for(int index = 0; index < unansweredQuestions.length; index++) {
			if(Character.isWhitespace(this.studentAnswers[index].charAt(0))) {
				unansweredQuestions[questionNo] = index + 1;
					
				questionNo++;
			}
		}
		
		return unansweredQuestions;
	}
	
	/**
	 * @return the correctAnswers
	 */
	public String[] getCorrectAnswers() {
		return correctAnswers;
	}

	/**
	 * @param correctAnswers the correctAnswers to set
	 */
	public void setCorrectAnswers(String[] correctAnswers) {
		DriverExam.correctAnswers = correctAnswers;
	}

	/**
	 * @return the studentAnswers
	 */
	public String[] getStudentAnswers() {
		return studentAnswers;
	}

	/**
	 * @param studentAnswers the studentAnswers to set
	 */
	public void setStudentAnswers(String[] studentAnswers) {
		this.studentAnswers = studentAnswers;
	}
	
	
}
