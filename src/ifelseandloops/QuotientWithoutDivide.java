package ifelseandloops;
import java.util.Scanner;
public class QuotientWithoutDivide {
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
    static int sub(int a, int b)
    {
        return add(a, add(~b, 1));
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a = sc.nextInt();
        System.out.println("Enter second number: ");
        int b = sc.nextInt();
        int q = 0;
        while (a >= b)
        {
            a = sub(a, b);
            q = add(q,1);
        }
        System.out.println("Result :"+q);
        sc.close();
    }
}

