package ifelseandloops;

import java.util.Scanner;

public class AtmWithdrawal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int balance = sc.nextInt();
        int w = sc.nextInt();
        if ((w%100==0) && (balance - w >=1000)){
            balance = balance - w;
            System.out.println("Sucessfully withdrawed");
            System.out.println("Remaining balance :" + balance);
        }
        else {
//            balance = balance - w;
            System.out.println("Withdrawal failed ");
            System.out.println("Check the condition again");
        }

    }
}
