package practice;

import java.util.EmptyStackException;

public class Stack<E> 
{
	ArrayList<E> stack;
	
	public Stack()
	{
		stack = new ArrayList<E>();
	}
	
	public boolean empty()
	{
		return stack.isEmpty();
	}
	
	public E peek()
	{
		if (size() <= 0)
		{
			throw new EmptyStackException();
		}
		
		return stack.get(stack.size() - 1);
	}
	
	public E pop()
	{
		if (size() <= 0)
		{
			throw new EmptyStackException();
		}
		
		E item = stack.get(stack.size() - 1);
		stack.remove(stack.size() - 1);
		return item;
	}
	
	public void push(E item)
	{
		stack.add(item);
	}
	
	public int size()
	{
		return stack.size();
	}
}
