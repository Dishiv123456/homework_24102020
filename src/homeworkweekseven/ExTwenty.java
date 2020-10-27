package homeworkweekseven;

public class ExTwenty {
    //Write a Java program to test if an array contains a specific value
    public static void main(String[] args) { //main method
        arrayContains();  //static method called to static area

    }

    protected static void arrayContains() { // static method
        int[] num = {1, 2, 3, 4, 5};
        int contains = 3;
        boolean xyz = false;

        for (int n : num) {  // for each loop
            if (n == contains) {
                xyz = true;
                break;
            }
        }

        if (xyz)  //if else condition
            System.out.println(contains + " is found.");
        else
            System.out.println(contains + " is not found.");
    }

}