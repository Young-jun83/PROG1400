package FinalGrade;
import java.util.Scanner;

public class FinalGrade {
    public static void main(String[] args) {

        // grade variables

        float assignment1;
        float assignment2;
        float assignment3;
        float assignment4;
        float assignment5;
        float assignment6;

        System.out.println("Welcome to Final Grade System :)");

        Scanner s = new Scanner(System.in);

        System.out.println("Enter your score of assignment 1: ");
        assignment1 =  s.nextFloat();

        System.out.println("Enter your score of assignment 2: ");
        assignment2 =  s.nextFloat();

        System.out.println("Enter your score of assignment 3: ");
        assignment3 =  s.nextFloat();

        System.out.println("Enter your score of assignment 4: ");
        assignment4 =  s.nextFloat();

        System.out.println("Enter your score of assignment 5: ");
        assignment5 =  s.nextFloat();

        System.out.println("Enter your score of assignment 6: ");
        assignment6 =  s.nextFloat();

        /*  test if user choose the optional assignment */

        // and (&&)
        // example : if (a => b && b == c)
        //
        // or (||)
        // example : if (a => b || b == c)
        float finalGrade;

        if (assignment6 >= 0) {
            // executed if true
            // if yes, determine lowest previous assignment
            // and replace it
            float lowest = 100.0f;

            if (assignment1 < lowest){
                lowest = assignment1;
            }
            if (assignment2 < lowest){
                lowest = assignment2;
            }
            if (assignment3 < lowest){
                lowest = assignment3;
            }
            if (assignment4 < lowest){
                lowest = assignment4;
            }
            if (assignment5 < lowest){
                lowest = assignment5;
            }

            finalGrade = assignment6;
            if (assignment1 != lowest){
                finalGrade += assignment1;
            }
            if (assignment2 != lowest){
                finalGrade += assignment2;
            }
            if (assignment3 != lowest){
                finalGrade += assignment3;
            }
            if (assignment4 != lowest){
                finalGrade += assignment4;
            }
            if (assignment5 != lowest){
                finalGrade += assignment5;
            }

            finalGrade /= 5.0f; //finalGrade = finalGrade /5.0f

        }
        else {


            finalGrade = (assignment1 + assignment2 + assignment3 + assignment4 + assignment5
                    ) / 5;

            // "/* */" <-- comment symbol.


        }
        System.out.println("Your Final Grade is " + finalGrade);
    }
}
