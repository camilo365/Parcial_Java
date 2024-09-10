package SectionThree;

public class LargestSmallestNumber {
    public static void main(String[] args) {
        int numbersList[] = new int[(int) (Math.random() * 10) + 1];

        for(int i = 0; i < numbersList.length; i++) {

            if ((int) (Math.random() * 10) >= 6){
                numbersList[i] = (int) (Math.random() * -1000);
            }
            else{
                numbersList[i] = (int) (Math.random() * 1000);
            }
        }

        int max = numbersList[0];
        int min = numbersList[0];

        for(int i = 0; i<numbersList.length; i++) {
            if(numbersList[i] > max) {max = numbersList[i];}
            if(numbersList[i] < min) {min = numbersList[i];}
        }
        for(int number : numbersList){System.out.println(number);}
        System.out.println("Min :" + min + ". Max:" + max);
    }
}
