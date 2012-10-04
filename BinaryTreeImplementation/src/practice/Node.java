package practice;

public class Node<E> 
{
	private E data;
	private Node<E> leftChild;
	private Node<E> rightChild;
	
	public Node(E data, Node<E> leftChild, Node<E> rightChild)
	{
		this.data = data; 
		this.leftChild = leftChild;
		this.rightChild = rightChild;
	}
	
	public boolean isLeaf()
	{
		return (leftChild == null && rightChild == null);
	}
	
	public E getData()
	{
		return this.data;
	}
	
	public void setData(E data)
	{
		this.data = data;
	}
	
	public Node<E> getLeftChild()
	{
		return this.leftChild;
	}
	
	public void setLeftChild(Node<E> leftChild)
	{
		this.leftChild = leftChild;
	}
	
	public Node<E> getRightChild()
	{
		return this.rightChild;
	}
	
	public void setRightChild(Node<E> rightChild)
	{
		this.rightChild = rightChild;
	}
}
