package ifelseandloops;

import java.util.Scanner;

public class NumberClassification {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //input num
        // positive or negative
        if (n >= 0) {
            System.out.println("Positive");
        }
        else if (n<0){
            System.out.println("Negative");
        }
        //even or odd
            if (n%2==0){
                System.out.println ("Even number");
            }
            else {
                System.out.println("Odd number");
            }
            // divisibility check
                if (n%5==0 && n%7==0){
                    System.out.println("num is divisible by both 5 and 7");
                }
                    else {
                    System.out.println("num is not div by both 5 and 7");
                }
    }
}
