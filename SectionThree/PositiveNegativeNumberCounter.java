package SectionThree;

public class PositiveNegativeNumberCounter {
    public static void main(String[] args) {

        int numbersList[] = new int[20];
        int positiveNumbers = 0;
        int negativeNumbers = 0;

        for(int i = 0; i < 20; i++) {

            if ((int) (Math.random() * 10) >= 6){
                numbersList[i] = (int) (Math.random() * -1000);
            }
            else{
                numbersList[i] = (int) (Math.random() * 1000);
            }
        }

        for (int number : numbersList) {
            if(number >= 0) {positiveNumbers++;} else {negativeNumbers++;}
        }
        System.out.println(positiveNumbers + " positive numbers and " + negativeNumbers + " negative numbers.");
        }
}