package homeworkweekseven;

import java.util.Scanner;

public class ExEight {
    /* Input anybe  alphabet from a to f and print their city name accordingly (use if else) any other
      Alphabet should invalid entry
     */
    public static void main(String[] args) {  //main method
        ExEight a = new ExEight();   //object created to call instance method
        a.cityName();   //instance method call to static area
    }

    public void cityName() {
        Scanner s = new Scanner(System.in);  // used Scanner to take input from user
        System.out.println("Enter alphabet from a to f : ");
        char name = s.next().toLowerCase().charAt(0);

        System.out.println(name + " start with city name is : ");
        if (name == 'a') {   //used nested if else loop to fine city name
            System.out.println("Ahmedabad");
        } else if (name == 'b') {
            System.out.println("Baroda");
        } else if (name == 'c') {
            System.out.println("Chandigarh");
        } else if (name == 'd') {
            System.out.println("Delhi");
        } else if (name == 'e') {
            System.out.println("Ellora");
        } else if (name == 'f') {
            System.out.println("Firozpur");
        } else {
            System.out.println("Alphabet is not valid");
        }
    }
}



