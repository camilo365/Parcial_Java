package SectionThree;
import java.util.Scanner;
import java.util.HashMap;

public class NumberDaysMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap <Integer, Integer> monthDays = new HashMap<>();

         // Assign the days of each month
        monthDays.put(1, 31);  // January
        monthDays.put(2, 28);  // February (non-leap year)
        monthDays.put(3, 31);  // March
        monthDays.put(4, 30);  // April
        monthDays.put(5, 31);  // May
        monthDays.put(6, 30);  // June
        monthDays.put(7, 31);  // July
        monthDays.put(8, 31);  // August
        monthDays.put(9, 30);  // September
        monthDays.put(10, 31); // October
        monthDays.put(11, 30); // November
        monthDays.put(12, 31); // December

        int month;
        int year;

        System.out.print("Enter the month (1-12): ");
        month = scanner.nextInt();
        System.out.print("Enter the year: ");
        year = scanner.nextInt();

        if(month >= 1 && month <= 12){

            if(year % 4 == 0 && month == 2){
            // Check if the year is a leap year

                System.out.println("Numbers of Days - leap : "+ (monthDays.get(month) +1 )); // February has 29 days in a leap year
            }else{
            // If not a leap year, February has 28 days
                System.out.println("Numbers of Days : "+monthDays.get(month));
            }
        }else{
            System.out.println("Invalided year. 1 - 12");
        }

        scanner.close();
    }

}
