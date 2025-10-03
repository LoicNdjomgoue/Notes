
public class objects_OOP {
    
    public static void main(String[] args) {
        
        // object = an instance of a class that may contain attributes and methods
        // example: (phone, desk, computer, coffee cup)

        car myCar = new car();
        car newCar = new car();

        System.out.println(myCar.model);
        System.out.println(myCar.make);

        System.out.println(newCar.model);
        System.out.println(newCar.make);



        myCar.drive();
        myCar.brake();
    

    }
}
