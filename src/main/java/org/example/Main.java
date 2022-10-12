package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //SumNaturalNumbers();
        //TableOfNumber();
        //StudentMark();
        //PrimeNumber();
        //PrimeNumbers();
        fibonacci();
    }

    public static void SumNaturalNumbers(){
        System.out.println("Please enter a number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;

        for(int i =1; i<=n; i++ ){
            sum = sum +i;
        }
        System.out.println("Sum of natural number is:"+sum);
        SumNaturalNumbers();

    }
    public static void TableOfNumber(){
        System.out.println("Please enter a number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i =1; i<11; i++ ){
            System.out.println(n+"*"+i+"="+n*i);
        }
        TableOfNumber();
    }
    public static void StudentMark(){
        Scanner sc = new Scanner(System.in);
        int input;

        do{
            int mark = sc.nextInt();
            if(mark >= 90){
                System.out.println("This is Good");
            }else if(89 >= mark  && mark  >= 60){
                System.out.println("This is also Good");
            }else if(59 >= mark  && mark  >= 0){
                System.out.println("This is Good as well");
            }
            System.out.println("Do you want to continue? (Yes(1) or No(0)");
            input = sc.nextInt();

        }while(input == 1);

    }

    public static void PrimeNumber(){
        System.out.println("Please enter a number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        boolean flag = false;

        for(int i = 2; i<n ; i++) {
            if (n % i == 0) {
                flag = true;
            }
        }
        if(flag == true){
            System.out.println("Not a prime number");
        }else{
            System.out.println("Prime number");
        }
        PrimeNumber();
    }

    public static void PrimeNumbers(){
        System.out.println("Please enter a number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Prime numbers between 1 to "+n+" are ");
        int count;

        for(int i=2; i<=n ; i++){
            count =0;
            for(int j=1; j<=i ; j++){
                if(i%j ==0){
                    count++;
                }
            }
            if(count==2){
                System.out.print(i+" ");
            }

        }
        System.out.println();
        PrimeNumbers();
    }

    public static void fibonacci(){
        int a = 0;
        int b =1;
        int c=0;

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=0; i<=n; i++){
            System.out.print(a+" ");
            c = a+b;
            a = b;
            b = c;
        }
    }
}