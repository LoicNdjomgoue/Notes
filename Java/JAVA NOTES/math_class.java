import java.util.Scanner;

public class math_class {

    public static void main(String[] args) {
        
        double x = 3.14;
        double y = -10;

        double z = Math.max(x, y);

       /* max (largest number between a pair)
          min (smallest number between a pair)
          round 
          sqrt (square root)
          abs (absolute value)
          ceil (round up)
          floor (round down)
        */

        double a;
        double b;
        double c;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter side a: ");
        a = scanner.nextDouble();

        System.out.println("Enter side b: ");
        b = scanner.nextDouble();

       c = Math.sqrt((a*a)+(b*b));

        System.out.println(z);
        System.out.println("The hypotenuse is: "+c);

        scanner.close();

    }
}