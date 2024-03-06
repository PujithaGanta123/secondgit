package assignmetImp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class CalorieCalculator {
	 
	Map<String,Food> foodchart=new HashMap<>();
	int quantity;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CalorieCalculator ob=new CalorieCalculator();
		ob.foodchart.put("Banana",new Food("Banana",50,10,20));
		ob.foodchart.put("Apple",new Food("Apple",40,5,8));
		ob.foodchart.put("Rice", new Food("Rice",100,15,30));
		ob.foodchart.put("Wheat", new Food("Wheat",80,40,20));
		ob.foodchart.put("Carrot",new Food("Carrot",45,20,9));
		ob.foodchart.put("Cucumber", new Food("Cucumber",70,30,15));
		System.out.println("Items");
		System.out.println("******");
		for(Map.Entry<String, Food> m:ob.foodchart.entrySet())
		{
			System.out.println(m.getKey());
		}
		ob.totalCalories();
	}
	public float NoOfcalories(String s)
	{
		float calories = 0;
		Food ob=null;
			for(Map.Entry<String, Food> m:foodchart.entrySet())
			{
				if(s.equalsIgnoreCase(m.getKey()))
				{
				 ob=m.getValue();
				}
			}
			if(ob.carbohydrates>=1 && ob.carbohydrates<=40)
				calories=20;
			else if(ob.carbohydrates>30 && ob.carbohydrates<=80)
				calories=40;
			else if(ob.carbohydrates>80 && ob.carbohydrates<=120)
				calories=70;
			if(ob.proteins>=1 && ob.calories<=20)
				calories=20;
			else if(ob.proteins>20 && ob.proteins<=40)
				calories=40;
			else if(ob.proteins>40 && ob.proteins<=60)
				calories=60;
			if(ob.fats>=1 && ob.fats<=10)
				calories=20;
			else if(ob.fats>10 && ob.fats<=20)
				calories=40;
			else if(ob.fats>20 && ob.fats<=30)
				calories=60;
		return calories;
	}
	public void totalCalories()
	{
		Scanner sc=new Scanner(System.in);
		String n;
		Map<String,Float> cart=new HashMap<>();
		float totalCal=0;
		String f;
		do
		{
			System.out.println("Enter food item to calculate calories ");
			f=sc.next();
			for(Map.Entry<String, Food> m:foodchart.entrySet())
			{
				if(m.getKey().equalsIgnoreCase(f))
				{
					cart.put(m.getKey(),NoOfcalories(f));
					totalCal+=NoOfcalories(f);
				}
			}
			System.out.println("Do you want to add more(y/n) ");
			n=sc.next();
			sc.close();
		}while(n.equalsIgnoreCase("y"));

		cart.entrySet().stream()
		.sorted(Map.Entry.comparingByValue())
		.forEach(System.out::println);
		System.out.println("Total calories:"+totalCal);

	}
}
class Food
{
	String itemname;
	float carbohydrates;
	float proteins;
	float fats;
	float calories;
	Food(String itemname,float carbohydrates,float proteins,float fats)
	{
		this.itemname=itemname;
		this.carbohydrates=carbohydrates;
		this.proteins=proteins;
		this.fats=fats;
	}
}


