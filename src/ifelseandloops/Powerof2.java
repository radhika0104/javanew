package ifelseandloops;

import java.util.Scanner;

public class Powerof2 {
   public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        if ( (n > 0) && (n & n - 1) == 0 ) {
            System.out.print(n+ " is power of 2");
        }
        else
            System.out.print(n+" not power of 2");
    }
}
