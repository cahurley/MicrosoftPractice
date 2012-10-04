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
	
}