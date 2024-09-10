package SectionThree;

// Inventory Consistency Check
public class AdvancedExercise {
    public static void main(String[] args) {

        int[] expectedInventory = {10, 5, 8, 2, 7};
        int[] inventory = {10, 5, 8, 2, 7};
        
        int difference = 0;

        for (int i = 0; i < expectedInventory.length; i++) {
            if(expectedInventory[i] != inventory[i]) {
                difference ++;
            }
        }

        if (difference > 0) {
            System.out.println("Inventory inconsistency detected. " + difference + " items are not matching.");
        }
        else {
            System.out.println("Inventory is consistent. No discrepancies found.");
        }
    }
}
