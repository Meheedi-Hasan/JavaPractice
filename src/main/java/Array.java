import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        //findNumberInArray();
        minMaxArray();
    }
    public static void findNumberInArray(){
        Scanner sc = new Scanner(System.in);
        System.out.println("How many number do you wnat to enter: ");
        int size = sc.nextInt();
        int number[] = new int[size];
        System.out.println("Please Enter numbers: ");
        for(int i=0; i<size; i++){
            number[i] = sc.nextInt();
        }
        System.out.println("Find the index number for: ");
        int x = sc.nextInt();

        for(int i=0; i< number.length; i++){
            if(number[i]==x){
                System.out.println("For number: "+number[i]+" Index number is "+i);
            }
        }
        findNumberInArray();
    }

    public static void minMaxArray(){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int numbers[] = new int[size];

        //input
        for(int i=0; i<size; i++) {
            numbers[i] = sc.nextInt();
        }

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i=0; i<numbers.length; i++) {
            if(numbers[i] < min) {
                min = numbers[i];
            }
            if(numbers[i] > max) {
                max = numbers[i];
            }
        }

        System.out.println("Largest number is : " + max);
        System.out.println("Smallest number is : " + min);
        minMaxArray();
    }
}
