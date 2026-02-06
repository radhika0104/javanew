package ifelseandloops;
import java.util.Scanner;
public class ConstantMultiplyBy7 {

        public static void main(String[] args)
        {
            Scanner sc = new Scanner (System.in);
            System.out.print("Enter a number: ");
            int a = sc.nextInt();
            int prod = (a << 3) - a;
            System.out.println(prod);
            sc.close();
        }
    }

