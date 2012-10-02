package practice;

public class LinkedList<E> 
{	
	private Node<E> headNode;
	private int currentSize;
	
	public LinkedList()
	{
		this.headNode = null;
		this.currentSize = 0;
	}
	
	public LinkedList(Iterable<E> linkedListObjects)
	{
		addAll(linkedListObjects);
	}
	
	public void add(int index, E element)
	{
		if (index < 0 || index > currentSize - 1)
		{
			throw new IllegalArgumentException("Cannot add element at that index");
		}
		
		if (index == 0)
		{
			addFirst(element);
		}
		else
		{
			Node<E> node = new Node<E>(element, null);
			Node<E> currentNode = headNode;
			Node<E> previousNode = null;
			
			int i = 0;
			while (i != index && currentNode.getNextNode() != null)
			{
				previousNode = currentNode;
				currentNode = currentNode.getNextNode();
				i++;
			}
			
			node.setNextNode(currentNode.getNextNode());
			previousNode.setNextNode(node);
			currentSize++;
		}
	}
	
	public void add(E element)
	{		
		Node<E> node = new Node<E>(element, null);
		if (headNode == null && currentSize == 0)
		{
			headNode = node;
			currentSize++;
		}
		else
		{
			addLast(element);
		}
	}
	
	public void addAll(Iterable<E> itemsToAdd)
	{
		for (E item : itemsToAdd)
		{
			add(item);
		}
	}
	
	public void addAll(int index, Iterable<E> itemsToAdd)
	{
		for (E item : itemsToAdd)
		{
			add(index++, item);
		}
	}
	
	public void addFirst(E element)
	{
		Node<E> node = new Node<E>(element, null);
		
		node.setNextNode(headNode);
		headNode = node;
		currentSize++;
	}
	
	public void addLast(E element)
	{
		Node<E> node = new Node<E>(element, null);
		
		Node<E> tempNode = headNode;
		while (tempNode.getNextNode() != null)
		{
			tempNode = tempNode.getNextNode();
		}
		
		tempNode.setNextNode(node);
		currentSize++;
	}
	
	public void clear()
	{
		
	}
	
	public Node<E> getFirst()
	{
		return this.headNode;
	}
	
	public int size()
	{
		return this.currentSize;
	}
	
}
