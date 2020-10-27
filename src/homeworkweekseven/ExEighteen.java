package homeworkweekseven;

public class ExEighteen {
    /* Write a Java program to print the following grid
with 10 line using for loop.
Expected Output :
- - - - - - - - - - - - - -
- - - - - - - - - - - - - -
- - - - - - - - - - - - - -
- - - - - - - - - - - - - -
- - - - - - - - - - - - - - */
    public static void main(String[] args) {  //main method
        printUsingForLoop();  //Static method called to static area directly
    }

    public static void printUsingForLoop() {
        System.out.println("Expected output is : ");
        for (int i = 1; i <= 10; i++) {  //for loop to print 10 lines
            for (int j = 1; j <= 14; j++) { //for loop to print "-" 14 times
                System.out.print("-");
            }
            System.out.println();
        }
    }
}
