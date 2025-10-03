import java.util.Scanner;

public class user_input {


     public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("what is you name? ");
        String name = scanner.nextLine();

        System.out.println("How old are you? ");
        int age = scanner.nextInt();
        scanner.nextLine(); //clears the scanner so we can allow the next input after int

        System.out.println("What is your favorite food?");
        String food = scanner.nextLine();

        System.out.println("Hello "+name);
        System.out.println("You are "+age+" years old");
        System.out.println("You like "+food);

        scanner.close();

     }
}