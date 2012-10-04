package practice;

public class BinaryTree<E>
{
	private Node<E> rootNode;
	
	public BinaryTree(Node<E> rootNode)
	{
		this.rootNode = rootNode;
	}
	
	public Node<E> getRoot()
	{
		return this.rootNode;
	}
	
	public void preorderPrint(Node<E> rootNode)
	{
		if (rootNode != null)
		{
			System.out.println(rootNode.getData());
			preorderPrint(rootNode.getLeftChild());
			preorderPrint(rootNode.getRightChild());
		}
	}
	
	public void inorderPrint(Node<E> rootNode)
	{
		if (rootNode != null)
		{
			inorderPrint(rootNode.getLeftChild());
			System.out.println(rootNode.getData());
			inorderPrint(rootNode.getRightChild());
		}
	}
	
	public void postorderPrint(Node<E> rootNode)
	{
		if (rootNode != null)
		{
			postorderPrint(rootNode.getLeftChild());
			postorderPrint(rootNode.getRightChild());
			System.out.println(rootNode.getData());
		}
	}
}
