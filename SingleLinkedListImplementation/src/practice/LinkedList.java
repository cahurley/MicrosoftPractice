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
		for (E item : linkedListObjects)
		{
			add(item);
		}
	}
	
	public void add(int index, E element)
	{
		if (index < 0 || index > currentSize - 1)
		{
			throw new IllegalArgumentException("Cannot add element at that index");
		}
		
		Node<E> node = new Node<E>(element, null);
		
		Node<E> currentNode = headNode;
		Node<E> previousNode = null;
		if (index == 0)
		{
			node.setNextNode(currentNode);
			headNode = node;
		}
		else
		{
			int i = 0;
			while (i != index && currentNode.getNextNode() != null)
			{
				previousNode = currentNode;
				currentNode = currentNode.getNextNode();
				i++;
			}
			
			node.setNextNode(currentNode.getNextNode());
			previousNode.setNextNode(node);
		}
		
		currentSize++;
	}
	
	public void add(E element)
	{		
		Node<E> node = new Node<E>(element, null);
		if (headNode == null && currentSize == 0)
		{
			headNode = node;
		}
		else
		{
			Node<E> tempNode = headNode;
			while (tempNode.getNextNode() != null)
			{
				tempNode = tempNode.getNextNode();
			}
			
			tempNode.setNextNode(node);
		}
		
		currentSize++;
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
