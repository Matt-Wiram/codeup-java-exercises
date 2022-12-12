package Grocery;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class GroceryCat {
HashMap <String, ArrayList<GroceryItem>> mapped;

    public GroceryCat(HashMap<String, ArrayList<GroceryItem>> mapped) {
        this.mapped = mapped;
    }

    public HashMap<String, ArrayList<GroceryItem>> getMapped() {
        return mapped;
    }

    public void setMapped(HashMap<String, ArrayList<GroceryItem>> mapped) {
        this.mapped = mapped;
    }



    public static void main(String[] args) {

        HashMap <String, ArrayList<GroceryItem>> fish = new HashMap<>();
        fish.put("Meat and fish", new ArrayList<GroceryItem>());
        fish.get("Meat and fish").add(new GroceryItem(3, "steak"));
        System.out.println(fish.get("Meat and fish").get(0).getAmount());

//        "Dairy"
//        "Vegetables and fruit"
//        "Freezer"
    }

}
