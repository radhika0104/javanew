package ifelseandloops;
import java.util.Scanner;
public class Maxmwithoutcompare {

        public static void main(String[] args)
        {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter first number: ");
            int a = sc.nextInt();
            System.out.print("Enter second number: ");
            int b = sc.nextInt();
            int c = (a >> 31) & 1;
            int d = (b >> 31) & 1;
            int e = ((a - b) >> 31) & 1;
            int signA = c ^ d;
            int signDiff = signA ^ 1;
            int k = signA * c + signDiff * e;
            int max = a * (1 - k) + b * k;
            System.out.println(max);
            sc.close();
        }
    }

