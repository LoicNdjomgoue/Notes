import java.util.Scanner;

public class logical_operators {

    public static void main(String[] args) {
        
        //logical operators = use to connect two or more expressions
        /*
         
        && = (AND) both conditions must be true
        || = (OR) either condition must be true
        ! = (NOT) reverses boolean value of a condition

         */
    
         int temp = 25;

         if (temp>30) {
            System.out.println("it is hot outside");
         }
         else if (temp>=20 && temp<=30) {
            System.out.println("it is warm outside");
         }
         else {
            System.out.println("it is cold outside");
         }


         Scanner scanner = new Scanner(System.in);

         System.out.println("You are playing a game! press q or Q to quit");
         String response = scanner.next();

         if (response.equals("q") || response.equals("Q")) {
            System.out.println("You quit the game");
         }
         else{
            System.out.println("You are still playing the game");

         }

        System.out.println("press f or F for the chat");
        String respect = scanner.next();

        if (!respect.equals("f") && !respect.equals("F")) {
            System.out.println("that is not f or F");
        }
        else{
            System.out.println("Thank you for the F in the chat");
        }


        scanner.close();
        
    }
}