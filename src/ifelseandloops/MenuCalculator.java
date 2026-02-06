package ifelseandloops;

import java.util.Scanner;

public class MenuCalculator {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in)  ;
       int a = sc.nextInt(); //inputs
       int b = sc.nextInt();
       //menu
       System.out.println("1.Addition");
       System.out.println("2. Subtraction");
       System.out.println("3. Multiplication");
       System.out.println("4. Division");
       System.out.println("5. Modulus");

       System.out.println("Enter your choice");

       int choice = sc.nextInt(); // what operation u need
       switch (choice){
           case 1:
               System.out.println("Result: "+ (a+b));
               break;
           case 2:
               System.out.println("Result: "+ (a-b));
               break;
           case 3:
               System.out.println("Result: "+ (a*b));
               break;
           case 4:
               System.out.println("Result: "+ (a/b));
               break;
           case 5:
               System.out.println("Result: "+ (a%b));
               break;
           default:
               System.out.println("Invalid choice");
       }
   }
}
