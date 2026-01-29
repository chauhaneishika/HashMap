//ArrayList
package dev.lpa;

import java.util.Arrays;

record GroceryItem(String name, String type, int count){
    public GroceryItem(String name ) {
        this(name, "DIARY", 1);
    }
}

public class Main{
    static void main() {
        GroceryItem[] groceryArray = new GroceryItem[3];
        groceryArray[0] = new GroceryItem("milk");
        groceryArray[1] = new GroceryItem("Apples","PRODUCE",6);
        groceryArray[2] = new GroceryItem("oranges","PRODUCE",5);
        System.out.println(Arrays.toString(groceryArray));
    }
}
