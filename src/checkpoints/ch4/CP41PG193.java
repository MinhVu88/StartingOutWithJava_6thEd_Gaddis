package checkpoints.ch4;

public class CP41PG193 {
	public static void main(String[] args) {
		int a = 2, b = a++;
		System.out.println("\nb or a++ -> " + b);
		
		int c = 2;
		System.out.println("\nc++ -> " + c++);
		
		int d = 2;
		System.out.println("\n--d -> " + --d);
		
		int e = 8, f = e--;
		System.out.println("\nf or e-- -> " + f);
	}
}
