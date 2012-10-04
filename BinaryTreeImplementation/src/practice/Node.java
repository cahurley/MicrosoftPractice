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
	
	public void treeClear(Node<E> rootNode)
	{
		if (rootNode != null)
		{
			treeClear(rootNode.getLeftChild());
			treeClear(rootNode.getRightChild());
			rootNode = null;
		}
	}
	
	public Node<E> treeCopy(Node<E> rootNode)
	{
		if (rootNode == null)
		{
			return null;
		}
		else
		{
			Node<E> leftNode = treeCopy(rootNode.getLeftChild());
			Node<E> rightNode = treeCopy(rootNode.getRightChild());
			
			return new Node<E>(rootNode.getData(), leftNode, rightNode);
		}
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
