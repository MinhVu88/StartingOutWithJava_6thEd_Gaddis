package code_listings.ch_03_decision_structures;

public class StringCompareTo {
    public static void main(String[] args) {
        String name1 = "Mark", name2 = "Mary";

        // name1 & name2 are compared against each other character by character by using the String class's compareTo method
        // because the letter "y" in Mary is greater than "k" in Mark, so Mary is greater than Mark
        if (name1.compareTo(name2) < 0) {
            System.out.println(name1 + " is less than " + name2);
        }else if (name1.compareTo(name2) == 0) {
            System.out.println(name1 + " is equal " + name2);
        }else if (name1.compareTo(name2) > 0) {
            System.out.println(name1 + " is greater than " + name2);
        }
    }
}
