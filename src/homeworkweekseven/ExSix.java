package homeworkweekseven;

import java.util.Scanner;

public class ExSix {

//WAP to input any number and find out if it’s odd or even
public static void main(String[] args) {  //main method
    ExSix obj =new ExSix();  //object created to call instance method to static area
    obj.evenOdd();
}
public void evenOdd(){   //instance method
    Scanner s=new Scanner(System.in);  //used scanner to take input from user
    System.out.println("Enter number to check Even or Odd : ");
    int num =s.nextInt();
    if (num/2 ==0){   //used if else condition to find out number is even or odd
        System.out.println(num + " is Even number ");

    }else {
        System.out.println(num + " is Odd number");
    }
}

}


