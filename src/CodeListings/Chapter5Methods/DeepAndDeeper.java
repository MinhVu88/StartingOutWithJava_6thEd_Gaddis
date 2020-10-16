package CodeListings.Chapter5Methods;

/* description:

- Methods can also be called in a hierarchical or layered fashion 
- In other words, method A can call method B, which can then call method C 
- When method C finishes, the JVM returns to method B 
- When method B finishes, the JVM returns to method A 
- This program demonstrates this with 3 methods: main, deep & deeper 
- The main method calls the deep method, which then calls the deeper method
*/

public class DeepAndDeeper {
	public static void main(String[] args) {
		System.out.println("i'm now in the main() method, which's calling the deep() method");
		deep();
		System.out.println("i'm back to the main() method");
	}
	
	public static void deep() {
		System.out.println("\ti'm now in the deep() method, which's calling the deeper() method");
		deeper();
	}
	
	public static void deeper() {
		System.out.println("\t\ti'm now in the deeper() method");
	}
}
