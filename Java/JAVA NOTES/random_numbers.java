import java.util.Random;

public class random_numbers {

    public static void main(String[] args) {
        
        Random random = new Random();

        int x = random.nextInt(6)+1; // without the +1 it will only randomize from 0-5 because computers start from 0

        double y = random.nextDouble();

        boolean z = random.nextBoolean();

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

    }
}