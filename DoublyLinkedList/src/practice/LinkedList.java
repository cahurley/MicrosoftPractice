package practice;

public class LinkedList<E> 
{	
	private Node<E> headNode;
	private Node<E> tailNode;
	private int currentSize;
	
	public LinkedList()
	{
		this.headNode = null;
		this.tailNode = null;
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
			Node<E> node = new Node<E>(element, null, null);
			Node<E> currentNode = headNode;
			
			int i = 0;
			while (i != index && currentNode.getNextNode() != null)
			{
				currentNode = currentNode.getNextNode();
				i++;
			}
			
			node.setPreviousNode(currentNode.getPreviousNode());
			node.getPreviousNode().setNextNode(node);
			
			node.setNextNode(currentNode);
			node.getNextNode().setPreviousNode(node);
			
			currentSize++;
		}
	}
	
	public void add(E element)
	{
		if (headNode == null && currentSize == 0)
		{
			addFirst(element);
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
		Node<E> node = new Node<E>(element, null, null);
		
		if (headNode != null)
		{
			node.setNextNode(headNode);
			node.getNextNode().setPreviousNode(node);
			headNode = node;
		}
		else
		{
			headNode = node;
			tailNode = node;
		}
		
		currentSize++;
	}
	
	public void addLast(E element)
	{
		Node<E> node = new Node<E>(element, null, null);
		
		if (tailNode != null)
		{
			tailNode.setNextNode(node);
			node.setPreviousNode(tailNode);
			tailNode = node;
		}
		else
		{
			headNode = node;
			tailNode = node;
		}
		
		currentSize++;
	}
	
	public E get(int index)
	{
		if (index < 0 || index >= size())
		{
			throw new IllegalArgumentException("Cannot retrieve item at that index");
		}
		
		Node<E> node;
		if (index > currentSize/2)
		{
			node = tailNode;
			
			int i = currentSize - 1;
			while (i != index)
			{
				node = node.getPreviousNode();
				i--;
			}
		}
		else
		{
			node = headNode;
			
			int i = 0;
			while (i != index)
			{
				node = node.getNextNode();
				i++;
			}
		}
		
		return node.getData();
	}
	
	public E getFirst()
	{
		return this.headNode.getData();
	}
	
	public E getLast()
	{
		return this.tailNode.getData();
	}
	
	public void remove(int index)
	{
		if(index < 0 || index >= size())
		{
			throw new IllegalArgumentException("Cannot remove item at that index");
		}
		
		Node<E> node = headNode;
		Node<E> previousNode = null;
		int i = 0;
		while (i != index)
		{
			previousNode = node;
			node = node.getNextNode();
			i++;
		}
		
		previousNode.setNextNode(node.getNextNode());
		node = null;
		currentSize--;
	}
	
	public int size()
	{
		return this.currentSize;
	}
	
	private Node<E> getFirstNode()
	{
		return this.headNode;
	}
	
	private Node<E> getLastNode()
	{
		return this.tailNode;
	}
	
	private class Node<E>
	{
		E data;
		Node<E> previousNode;
		Node<E> nextNode;
		
		@SuppressWarnings("unchecked")
		public Node(E data, Node<? extends E> previousNode, Node<? extends E> nextNode)
		{
			this.data = data;
			this.previousNode = (Node<E>)previousNode;
			this.nextNode = (Node<E>)nextNode;
		}

		public E getData()
		{
			return this.data;
		}
		
		public void setData(E data)
		{
			this.data = data;
		}
		
		public Node<E> getPreviousNode()
		{
			return this.previousNode;
		}
		
		public Node<E> getNextNode()
		{
			return this.nextNode;
		}
		
		@SuppressWarnings("unchecked")
		public void setPreviousNode(Node<? extends E> previousNode)
		{
			this.previousNode = (Node<E>)previousNode;
		}
		
		@SuppressWarnings("unchecked")
		public void setNextNode(Node<? extends E> nextNode)
		{
			this.nextNode = (Node<E>)nextNode;
		}
		
	}
	
}
