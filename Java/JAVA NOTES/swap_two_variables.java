public class swap_two_variables {

    public static void main(String[] args) {

        String x = "Water";
        String y = "Kool-Aid";
        String temp; //temporary

        temp = x;
        x=y;
        y=temp;

        System.out.println("x: "+x);
        System.out.println("y: "+y);
    }
}