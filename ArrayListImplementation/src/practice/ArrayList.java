package practice;

public class ArrayList<E> 
{
	private int MAX_CAPACITY;
	private int currentSize;
	private Object[] itemsInArray;
	
	public ArrayList()
	{
		this(10);
	}
	
	public ArrayList(int initialSize) throws IllegalArgumentException
	{
		if(initialSize < 0)
		{
			throw new IllegalArgumentException("That size is not acceptable");
		}
		
		MAX_CAPACITY = initialSize;
		this.currentSize = 0;
		this.itemsInArray = new Object[MAX_CAPACITY];
	}
	
	public void add(E element)
	{
		if (size() >= MAX_CAPACITY)
		{
			resizeArray();
		}
		
		itemsInArray[size()] = element;
		currentSize++;
	}
	
	public void clear()
	{
		for(int i = 0; i < size(); i++)
		{
			itemsInArray[i] = null;
		}
		
		currentSize = 0;
	}
	
	@SuppressWarnings("unchecked")
	public E get(int index)
	{
		if (index < 0 || index > size())
		{
			throw new IllegalArgumentException("Cannot retrieve item at that index");
		}
		
		return (E)itemsInArray[index];
	}
	
	public boolean isEmpty()
	{
		return (currentSize == 0);
	}
	
	public void remove(int index)
	{
		if (index < 0 || index >= size())
		{
			throw new IllegalArgumentException("Cannot retrieve item at that index");
		}
		
		for(int i = index; i < size() - 1; i++)
		{
			itemsInArray[i] = itemsInArray[i + 1];
		}
		
		itemsInArray[size() - 1] = null;
		currentSize--;
	}
	
	public int size()
	{
		return currentSize;
	}
	
	private void resizeArray()
	{
		MAX_CAPACITY = (MAX_CAPACITY * 2);
		Object[] newArray = new Object[MAX_CAPACITY];
		
		for(int i = 0; i < size(); i++)
		{
			newArray[i] = itemsInArray[i];
		}
		
		this.itemsInArray = newArray;
	}
	
	public int getCapacity()
	{
		return this.MAX_CAPACITY;
	}
	
}
