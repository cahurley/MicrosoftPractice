package practice;

public class Queue<E>
{
	private ArrayList<E> queue;
	
	public Queue()
	{
		queue = new ArrayList<E>();
	}
	
	public E back()
	{
		if (empty())
		{
			return null;
		}
		else
		{
			return queue.get(size() - 1);
		}
	}
	
	public E dequeue()
	{
		if (empty())
		{
			throw new NullPointerException("There are no more items in the queue");
		}
		else
		{
			E item = queue.get(0);
			queue.remove(0);
			return item;
		}
	}
	
	public boolean empty()
	{
		return queue.isEmpty();
	}
	
	public void enqueue(E item)
	{
		queue.add(item);
	}
	
	public E front()
	{
		if (empty())
		{
			return null;
		}
		else
		{
			return queue.get(0);
		}
	}
	
	public int size()
	{
		return queue.size();
	}
}
