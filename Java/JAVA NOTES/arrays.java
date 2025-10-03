
public class arrays {

    public static void main(String[] args) {
        
        //array = used to store multiple values in a single variable

        String [] cars = {"Camaro","Corvette","Tesla","Fusion"};

        cars [0] = "Mustang";

        System.out.println(cars[3]);

        // another way to do arrays

        String [] players = new String[3];

        players[0] = "Jordan";
        players[1] = "Kyrie";
        players[2] = "Lebron";
        //players[3] = "Loic";

        System.out.println(players[2]);

        // for loop with an array

        for(int i=0; i<cars.length; i++) {
            System.out.println(cars[i]);

        }


    }
}