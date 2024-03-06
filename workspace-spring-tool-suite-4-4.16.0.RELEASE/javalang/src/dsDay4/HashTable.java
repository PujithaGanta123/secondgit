package dsDay4;

import java.util.Hashtable;



public class HashTable {
	private int[] hashtable;
	
	public HashTable (int capacity)
	{
		hashtable=new int[capacity];
	}
	
	private int hash_function(String key)
	{
		return key.length()%hashtable.length;
		//return key.hashCode();
	}
	public void put(String key,int e1)
	{
		int hashedkey=hash_function(key);
		if(hashtable[hashedkey]!=null)
		System.out.println("Employee already exists ");
		else
		hashtable[hashedkey]=e1;
	}
	public int get(String key)
	{
		int hashedkey=hash_function(key);
		return hashtable[hashedkey];
	}
	public void print()
	{
		for(int e:hashtable)
		{
			System.out.println(e);
		}
	}

}
