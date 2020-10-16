package ProgrammingChallenges.Ch6;
import javax.swing.JOptionPane;

public class TestScoresTester {
	public static void main(String[] args) {
		double score1, score2, score3;
		
		score1 = Double.parseDouble(JOptionPane.showInputDialog("score 1:"));
		
		score2 = Double.parseDouble(JOptionPane.showInputDialog("score 2:"));
		
		score3 = Double.parseDouble(JOptionPane.showInputDialog("score 3:"));
		
		TestScores test = new TestScores();
		
		test.setScore1(score1);
		test.setScore2(score2);
		test.setScore3(score3);
		
		JOptionPane.showMessageDialog(null, "the average of the 3 test scores: " + test.average());
		
		System.exit(0);
	}
}
