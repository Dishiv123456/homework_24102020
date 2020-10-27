package homeworkweekseven;

import java.util.Scanner;

public class ExSeven {
    /*WAP input sales id, seller's name, sales amount, and salary basic and then fined this sales  Commission
 Sales amount >= 50,000 35%
 Sales amount >= 30,000 20%
>= 20,000 10%
>= 10,000 5%
< 10,000 2%  */

    public static void main(String[] args) {  //main method
        ExSeven e = new ExSeven();  //object created to call instance method to static area
        e.sellersCommission();
    }
    public void sellersCommission() {  //instance method
        double commission;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter sales id: ");
        int sales_Id = s.nextInt();
        System.out.print("Enter Seller's name : ");
        String name = s.next();
        System.out.print("Enter Sales Amount : ");
        double amount = s.nextDouble();
        System.out.print("Enter Basic salary : ");
        double salaryBasic = s.nextDouble();
        if (amount >= 50000) {    //used nested else if to find commission
            commission =amount * 0.35;

            System.out.println("commission is 35%   = "+commission);
            System.out.println("commission + basic salary = "+(commission+salaryBasic));

        } else if (amount >= 30000) {
            commission =amount*0.20;
            System.out.println("commission is 20%   = "+commission);
            System.out.println("commission + basic salary = "+(commission+salaryBasic));

        } else if (amount >= 20000) {
            commission =amount*0.10;
            System.out.println("commission is 10%   = "+commission);
            System.out.println("commission + basic salary = "+(commission+salaryBasic));

        } else if (amount >= 10000) {
            commission =amount*0.05;
            System.out.println("commission is 5%   = "+commission);
            System.out.println("commission + basic salary = "+(commission+salaryBasic));


        } else if (amount < 10000) {
            commission =amount*0.02;
            System.out.println("commission is 2%   = "+commission);
            System.out.println("commission + basic salary = "+(commission+salaryBasic));

        }

    }
}
