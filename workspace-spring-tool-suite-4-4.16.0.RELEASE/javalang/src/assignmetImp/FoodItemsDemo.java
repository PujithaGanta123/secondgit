package assignmetImp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
 
class FoodItem {
 
	
 
       static String name;
       int carbohydrates;
       int proteins;
       int fats;
       int totalCalories;
       public FoodItem(String name, int carbohydrates, int proteins, int fats)
       {
    	  this.name = name;
    	  this.carbohydrates = carbohydrates;
    	  this.proteins = proteins;
    	  this.fats = fats;
    	  this.totalCalories = calculateTotalCalories(carbohydrates,proteins,fats);
       }
       private int calculateTotalCalories(int carbs, int proteins, int fats)
       {
    	   return(carbs * 4) +(proteins * 4)+(fats * 9);
       }
       public int getTotalCalories()
       {
    	   return totalCalories;
       }
       public String toString() {
    	   return name + ":"+ totalCalories + "calories";
       }
	}
public class FoodItemsDemo{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		FoodItem banana = new FoodItem("Banana",20,3,8);
		FoodItem Apple = new FoodItem("Apple",25,2,1);
		FoodItem Rice = new FoodItem("Rice",45,5,1);
		FoodItem Wheat = new FoodItem("Wheat",40,6,2);
		FoodItem Carrot = new FoodItem("Carrot",10,1,0);
		FoodItem Cucumber = new FoodItem("Cucumber",5,1,0);
 
             List<FoodItem> FoodItem = new ArrayList<>();
             FoodItem.add(banana);
             FoodItem.add(Apple);
             FoodItem.add(Rice);
             FoodItem.add(Wheat);
             FoodItem.add(Cucumber);

             System.out.println("Enter the food items you want to eat");
              String userInput = sc.nextLine().trim();
              String[] selectedItems = userInput.split("");

              List<FoodItem> selectedFoodItems = new ArrayList<>();
                    for (String item : selectedItems)
                    {
                    	for(FoodItem foodItem : FoodItem )
                    	{
                    		
                    			if (FoodItem.name.equalsIgnoreCase(item.trim()))
                        		{
                        			selectedFoodItems.add(foodItem);
                        			break;
                        		}
                    		
                    			
                    			
                    		}
                    		
                    	}
                    
              //sorting the selected food items based on total calories
                    Collections.sort(Comparator.comparingInt(FoodItem::getCalories));
             //printing the sorted list
                    System.out.println("Sorted Food Items based on Total Calories (Highest to lowest):");
	}
	private static <T extends Object> int getcalories(T t1) {
		return 0;
	}
}

