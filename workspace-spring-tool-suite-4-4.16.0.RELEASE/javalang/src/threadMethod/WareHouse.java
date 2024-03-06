package threadMethod;

import java.util.Stack;

public class WareHouse {
	
	private Stack<Integer> stack =new Stack<>();
	
	public void push(int i)
	{
		stack.push(i);
	}
	public int pop()
	{
		return stack.pop();
	}
	public boolean isEmpty()
	{
		return stack.isEmpty();
	}
	
 

}
