public class methods {
    
    public static void main(String[] args) {
        
        //method = a block of code that is executed whenever it is called upon

        String name = "bro";
        int age = 22;

        hello(name,age);
        hello(name,age);
        hello(name,age);


        //return types

        int x = 3;
        int y = 4;


        System.out.println(add(x, y));


    }
    static void hello(String word, int num) {
        System.out.println("Hello "+word);
        System.out.println("You are "+num);

        
    }
    
    static int add(int x, int y){

        //int z = x + y;
        //return z;

        return x + y;
    }
}
