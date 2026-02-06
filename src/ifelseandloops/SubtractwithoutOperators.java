package ifelseandloops;

import java.util.Scanner;

public class SubtractwithoutOperators {

        static int add(int x, int y)
        {
            while (y != 0) {
                int carry = x & y;
                x = x ^ y;
                y = carry << 1;
            }
            return x;
        }
        public static void main(String[] args)
        {
            Scanner sc = new Scanner(System.in);
//        System.out.print("Enter first number: ");
            int a = sc.nextInt();
//        System.out.print("Enter second number: ");
            int b = sc.nextInt();
            int negB = add(~b, 1);
            int result = add(a, negB);
            System.out.println("Result = "+ result);
            sc.close();
        }
    }


