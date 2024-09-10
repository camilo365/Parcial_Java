package SectionThree;

public class SumEvenNumberOddNumber {
    public static void main(String[] args) {
        int numbersList[] = new int[10];
        int evenNumber = 0;
        int oddNumber = 0;

        for(int i = 0; i < numbersList.length; i++) {

            if ((int) (Math.random() * 10) + 1 >= 5){
                numbersList[i] = (int) (Math.random() * -100);
            }
            else{
                numbersList[i] = (int) (Math.random() * 100);
            }
        }

        for(int number : numbersList){
            if(number % 2 == 0) {evenNumber += number;} else{oddNumber += number;}
        }

        System.out.println("Sum of even numbers: " + evenNumber + " | Sum of odd numbers: "+ oddNumber);
    }
}
