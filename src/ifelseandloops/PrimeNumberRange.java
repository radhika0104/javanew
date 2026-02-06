package ifelseandloops;

import java.util.Scanner;
public class PrimeNumberRange {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int firstNum= sc.nextInt();
       int lastNum = sc.nextInt();
       System.out.println("Prime numbers between " + firstNum+ " and " + lastNum+ " are:");
       if (firstNum > lastNum) {
           int temp = firstNum;
           firstNum = lastNum;
           lastNum = temp;
       }
       for (int num = firstNum; num <= lastNum; num++)
       {
           if (num <= 1)
           {
               continue;
           }
           boolean isPrime = true;
           for (int i = 2; i <= Math.sqrt(num); i++) {
               if (num % i == 0) {
                   isPrime = false;
                   break;
               }
           }

           if (isPrime)
           {
               System.out.println(num);
           }
       }
       sc.close();


   }
}
