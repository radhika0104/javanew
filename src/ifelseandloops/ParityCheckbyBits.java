package ifelseandloops;
import java.util.Scanner;
public class ParityCheckbyBits
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the number: ");
        int a = sc.nextInt();
        if ((a & 1) == 0)
        {
            System.out.println(a + " is even");
        }
        else
        {
            System.out.println(a + " is odd");
        }
        sc.close();
    }
}

