package homeworkweekseven;

import java.util.Scanner;

public class ExTwo {
    //WAP to input any year like (ex.2007) and find out if it is leap year or not?

    public static void main(String[] args) {  //main method
        ExTwo obj =new ExTwo();  //object created
        obj.findLeapYear();  //called instance method to static area by using obj reff ..
    }
    protected void findLeapYear(){ //instance method
        Scanner s = new Scanner(System.in);  //used Scanner to take input from user
        System.out.print("Enter year : ");
        int year = s.nextInt();
        if ((year % 400 == 0) || (year % 100 != 0) && (year % 4 == 0)) {  // 3 conditions to check Leap year using if else
            System.out.println(year + " is a Leap year");
        } else {
            System.out.println(year + " is not a Leap year");
        }
    }
}

