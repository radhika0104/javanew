package ifelseandloops;

import java.util.Scanner;

public class SmartBilling {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); //input
        int price = sc.nextInt();
        int quantity = sc.nextInt();
        double discount = 0;
        double bill = (price*quantity); //bill
        if (bill >=5000){
            discount = bill*0.10; //10% discount
        } else if (bill>=2000) {
            discount =bill*0.05; //5% discount
        }
        double discountedvalue= bill - discount; // after discount
        double gst = discountedvalue*0.18; //18%gst on discounted amount
        double finalAmount=  (discountedvalue + gst);

        //output
        System.out.println("total bill: " + bill);
        System.out.println("Discount :" +discount);
        System.out.println("Amount after discount: "+ discountedvalue);
        System.out.println( " GST : "+ gst);
        System.out.println("Final amount to pay :" + finalAmount);
    }
}
