package homeworkweekseven;

import java.util.Scanner;

public class ExNine {
    /*
     Input any alphabet from a to f and print their city name accordingly (switch) any other   Alphabet should be invalid entry
 */
    public static void main(String[] args) {  //main method
        cityName();  // callled static method to static area directly
    }
    public static void cityName(){  //static method
        Scanner s = new Scanner(System.in);  //Scanner to take input from user
        System.out.print("Enter Aplphabet from a to f :  ");
        char name = s.next().toLowerCase().charAt(0);
        switch (name) {      //by using switch to find city name
            case 'a':
                System.out.println("Allahabad");
                break;
            case 'b':
                System.out.println("Bombay");
                break;
            case 'c':
                System.out.println("Chennai");
                break;
            case 'd':
                System.out.println("Daman");
                break;
            case 'e':
                System.out.println("Ettaiyapuram");
                break;
            case 'f':
                System.out.println("Fatehpur");
                break;
            default:
                System.out.println("Enter correct alphabet a to f ");
        }
    }
}
