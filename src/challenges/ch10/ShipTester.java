package challenges.ch10;

public class ShipTester {

	public static void main(String[] args) {
		Ship[] ships = new Ship[2];
		
		ships[0] = new CruiseShip("RMS Titanic", "1912", 3327);
		
		ships[1] = new CargoShip("Mary Celeste", "1861", 369);
		
		for(int index = 0; index < ships.length; index++) {
			System.out.println(ships[index]);
		}
	}

}
