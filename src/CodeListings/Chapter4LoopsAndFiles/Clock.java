package CodeListings.Chapter4LoopsAndFiles;
//import javax.swing.JOptionPane;

public class Clock {
	public static void main(String[] args) {
		/*
		for(int hours = 1; hours <= 12; hours++) {
			for(int mins = 0; mins <= 59; mins++) {
				for(int secs = 0; secs <= 59; secs++) {
					JOptionPane.showMessageDialog(null, hours + " hours: " + mins + " mins: " + secs + " secs");
				}
			}
		}
		System.exit(0);
		*/
		
		for(int hours = 1; hours <= 12; hours++) {
			for(int mins = 0; mins <= 59; mins++) {
				for(int secs = 0; secs <= 59; secs++) {
					System.out.printf("%02d:%02d:%02d\n", hours, mins, secs);
				}
			}
		}
	}
}
