import java.util.*;

public class twod_array_list {
    
    public static void main(String[] args) {

        ArrayList<ArrayList<String>> groceryList = new ArrayList<>(); 
        
        ArrayList<String> bakeryList = new ArrayList<>();
        bakeryList.add("pasta");
        bakeryList.add("garlic bread");
        bakeryList.add("donuts");

        ArrayList<String> produceList = new ArrayList<>();
        produceList.add("tomatoes");
        produceList.add("zucchini");
        produceList.add("peppers");

        ArrayList<String> drinksList = new ArrayList<>();
        drinksList.add("coke");
        drinksList.add("sprite");

        
        groceryList.add(bakeryList);
        groceryList.add(produceList);
        groceryList.add(drinksList);
        
        System.out.println(bakeryList.get(0));
        System.out.println(drinksList);
        System.out.println(groceryList);
        System.out.println(groceryList.get(0).get(1));  // get (0,1) bakery list is 0, produce is 1, drink is 2, from there you can choose witch exact item with the index
        


    }
}
