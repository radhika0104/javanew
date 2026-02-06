package ifelseandloops;
import java.util.Scanner;
class ReverseNum {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int digit =0;
        int rev=0;
        int sum = 0;
        int count =0;
        while (n>0) {
            digit = n % 10;
            sum = sum + digit;
           rev = rev* 10 + digit;
            count++;
            n /= 10;
        }
        System.out.println("Reverse of the number:" +rev);
        System.out.println("Sum of the digits: " +sum);
        System.out.println("Digit count:" +count);

    }
}
