package CodeListings.Chapter4LoopsAndFiles;
import javax.swing.JOptionPane;

/* This program calculates the number of soccer teams that a youth league may create from the number of available players. 
 * Input validation is demonstrated with while loops.
 */

/* pseudocode:

- declare constants with predefined values: MIN_PLAYERS_PER_TEAM, MAX_PLAYERS_PER_TEAM 
- declare int vars: availablePlayers, PlayersPerTeam, numberOfTeams, unavailablePlayers
- get the number of players per team
- check the validity of number of players per team
+ while it's NOT in the range b/w min & max number of players per team (invalid), the user must keep reentering the value until it's valid
- get the currently available players who can join a team
- check if the validity of the number of currently available players
+ while it's below zero, prompt the user to keep reentering the number of currently available players until it's valid
- calculate the number of teams those available players can make
- calculate the number of players who can't join a team (or unavailable players)
- display the number of teams & number of unavailable players
*/

public class SoccerTeams {
	public static void main(String[] args) {
		final int MIN_PLAYERS_PER_TEAM = 9, MAX_PLAYERS_PER_TEAM = 15;
		int availablePlayers, playersPerTeam, numberOfTeams, unavailablePlayers;
		
		playersPerTeam = Integer.parseInt(JOptionPane.showInputDialog("the number of players per team:"));
		
		// check if playersPerTeam is a valid input (9 <--> 15)
		/* (T || F => T => while(T) => the program executes the statements in the loop)
		 * (F || T => T)
		 * (T || T => T)
		 * (F || F => F => while(F) => the program skips the loop & proceeds to execute the next statement(s))
		 */
		while(playersPerTeam < MIN_PLAYERS_PER_TEAM || playersPerTeam > MAX_PLAYERS_PER_TEAM) {
			JOptionPane.showMessageDialog(null, "the number of players per team must be between 9 & 15");
			playersPerTeam = Integer.parseInt(JOptionPane.showInputDialog("enter the number of players per team again:"));
		}
		
		availablePlayers = Integer.parseInt(JOptionPane.showInputDialog("available players:"));
		
		// check validation of availablePlayers: if the number is below 0, the loop keeps running & user keeps being asked to enter a valid input which is above 0
		while(availablePlayers < 0) {
			JOptionPane.showMessageDialog(null, "the number of available players must be over 0");
			availablePlayers = Integer.parseInt(JOptionPane.showInputDialog("enter available players again:"));
		}
		
		/* 1 team = players per team
		   ? team = available players
		   => the number of teams = available players/players per team
		 * */
		numberOfTeams = availablePlayers / playersPerTeam;
		
		// the unavailable players = available players % players per team (the ratio of available players to players per team) 
		unavailablePlayers = availablePlayers % playersPerTeam;
		
		JOptionPane.showMessageDialog(null, "the number of teams: " + numberOfTeams + " - the number of leftover players: " + unavailablePlayers);
		
		System.exit(0);
	}
}
