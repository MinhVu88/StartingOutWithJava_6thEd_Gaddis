package code_listings.ch_04_loops_and_files;

/* pseudocode:

- declare 1 var called number & initialize it with a specific value

- while number <= 10,
	
	+ display number
	
	+ increment number by 1 until it reaches 10
 */

public class WhileLoop {
    public static void main(String[] args) {
        int no = 0;
        while (no <= 10) {
            //no++;
            System.out.print(no + " ");
            no++;
        }
        System.out.print("\nthat's all");
    }
}
