package ProgrammingChallenges.Ch10;

public class SavingsAccountTester {

	public static void main(String[] args) {
		for(int i = 0; i < 5; i++) {
			SavingsAccount sa = new SavingsAccount(Math.random() * 5000 + 1000, 12);
			
			sa.deposit(Math.random() * 100 + 1);
			
			sa.withdraw(Math.random() * 100 + 1);
			
			sa.display();
			
			System.out.println("-------------------------------");
		}
	}

}
