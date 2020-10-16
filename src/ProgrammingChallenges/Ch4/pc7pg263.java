package ProgrammingChallenges.Ch4;
import javax.swing.JOptionPane;

/* 
- A hotel’s occupancy rate = Number of rooms occupied / Total number of rooms

- Write a program that calculates the occupancy rate for each floor of a hotel 

- The program should start by asking for the number of floors in the hotel 

- A loop should then iterate once for each floor 

- During each iteration, the loop should ask the user for the number of rooms on the floor & the number of them that are occupied 

- After all the iterations, the program should display the number of rooms the hotel has, the number of them that are occupied, the number that are vacant & the occupancy rate for the hotel

- Input Validation: 

	+ Do not accept a value less than 1 for the number of floors 

	+ Do not accept a number less than 10 for the number of rooms on a floor
*/

public class pc7pg263 {
	public static void main(String[] args) {
		int floors, roomsPerFloor, occupiedRoomsPerFloor, vacantRoomsPerFloor, 
			totalRooms = 0, totalOccupiedRooms = 0, totalVacantRooms = 0; // accumulators, all initialized to 0
		double occupancyRate;
		
		floors = Integer.parseInt(JOptionPane.showInputDialog("the number of floors: "));
		
		while(floors < 1) {
			JOptionPane.showMessageDialog(null, "invalid input! please enter the number of floors again");
			floors = Integer.parseInt(JOptionPane.showInputDialog("the number of floors: "));
		}
		
		for(int floor = 1; floor <= floors; floor++) {
			JOptionPane.showMessageDialog(null, "floor number " + floor + ": ");
			roomsPerFloor = Integer.parseInt(JOptionPane.showInputDialog("the number of rooms on floor number " + floor + ": "));
			
			while(roomsPerFloor < 10) {
				JOptionPane.showMessageDialog(null, "invalid value! the number of rooms per floor must be over 10");
				roomsPerFloor = Integer.parseInt(JOptionPane.showInputDialog("the number of rooms on floor number " + floor + ": "));
			}
			
			occupiedRoomsPerFloor = Integer.parseInt(JOptionPane.showInputDialog("how many rooms that have been occupied on floor number " + floor + "? - "));
			
			vacantRoomsPerFloor = roomsPerFloor - occupiedRoomsPerFloor;
			
			JOptionPane.showMessageDialog(null, "the vacant rooms on floor number " + floor + ": " + vacantRoomsPerFloor);
			
			totalRooms += roomsPerFloor;
			totalOccupiedRooms += occupiedRoomsPerFloor;
			totalVacantRooms += vacantRoomsPerFloor;
		}
		
		occupancyRate = (double)totalOccupiedRooms / totalRooms;
		
		JOptionPane.showMessageDialog(null, "the hotel has " + totalRooms + " rooms in total");
		JOptionPane.showMessageDialog(null, "the hotel has " + totalOccupiedRooms + " occupied rooms in total");
		JOptionPane.showMessageDialog(null, "the hotel has " + totalVacantRooms + " vacant rooms in total");
		JOptionPane.showMessageDialog(null, "the occupancy rate: " +  occupancyRate);
		
		System.exit(0);
	}
}
