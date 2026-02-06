package ifelseandloops;
import java.util.Scanner;
public class MultiplyByBitsshifting {


        static int add(int a, int b)
        {
            while (b != 0)
            {
                int c = a & b;
                a = a ^ b;
                b = c << 1;
            }
            return a;
        }
        public static void main(String[] args)
        {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter first number: ");
            int a = sc.nextInt();
            System.out.print("Enter second number: ");
            int b = sc.nextInt();
            boolean neg = (a < 0) ^ (b < 0);
            if (a < 0)
            {
                a = add(~a, 1);
            }
            if (b < 0)
            {
                b = add(~b, 1);
            }
            int res = 0;
            while (b != 0)
            {
                if ((b & 1) == 1)
                {
                    res = add(res, a);
                }
                a <<= 1;
                b >>= 1;
            }
            if (neg)
            {
                res = add(~res, 1);
            }
            System.out.println(res);
            sc.close();
        }
    }

