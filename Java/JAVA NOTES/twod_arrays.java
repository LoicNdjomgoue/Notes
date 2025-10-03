

public class twod_arrays {

    public static void main(String[] args) {
        
        // 2D array = an array of arrays

        String[][] cars = new String[3][3];

        cars[0][0] = "Camaro"; //row 0 column 0
        cars[0][1] = "Corvette";
        cars[0][2] = "Tesla";
        cars[1][0] = "Fusion";
        cars[1][1] = "Mustang";
        cars[1][2] = "Truck";
        cars[2][0] = "Ram";
        cars[2][1] = "Ford";
        cars[2][2] = "Jeep";

        for(int i= 0; i<cars.length; i++) {
            System.out.println();
            for(int j=0; j<cars[i].length; j++) {
                System.out.print(cars[i][j]+" ");
            }
        }


        // another way to write a 2D array

        String[][] players = { {"Loic","Jordan","Kryie","Ryleigh"},
                               {"Luka","Kobe","Samuel","KD","Test","Test","test"},
                               {"Lamelo","Lebron","James","Kwhai"}
                            };

        for(int a= 0; a<players.length; a++) {
            System.out.println();
            for(int b=0; b<players[a].length; b++) {
                System.out.print(players[a][b]+" ");
            }
        }                   







    }

    
}