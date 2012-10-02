package practice;

public class Node<E>
{
	E data;
	Node<E> nextNode;
	
	@SuppressWarnings("unchecked")
	public Node(E data, Node<? extends E> nextNode)
	{
		this.data = data;
		this.nextNode = (Node<E>) nextNode;
	}

	public E getData()
	{
		return this.data;
	}
	
	public void setData(E data)
	{
		this.data = data;
	}
	
	public Node<E> getNextNode()
	{
		return this.nextNode;
	}
	
	@SuppressWarnings("unchecked")
	public void setNextNode(Node<? extends E> nextNode)
	{
		this.nextNode = (Node<E>) nextNode;
	}

	@Override
	public boolean equals(Object arg0) 
	{
		if(this == arg0)
		{
			return true;
		}
		
		if(!(arg0 instanceof Node))
		{
			return false;
		}
		
		@SuppressWarnings("unchecked")
		Node<E> comparingObject = (Node<E>)arg0;
		if(this.data == comparingObject.data)
		{
			if(this.nextNode == comparingObject.nextNode)
			{
				return true;
			}
		}
		
		return false;
	}
}