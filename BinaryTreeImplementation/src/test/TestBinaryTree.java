package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import practice.BinaryTree;
import practice.Node;

public class TestBinaryTree 
{
	BinaryTree<Integer> binaryTree;
	Node<Integer> rootNode;
	Node<Integer> nodeLeft;
	Node<Integer> nodeRight;
	Node<Integer> nodeLeft1;
	Node<Integer> nodeLeft2;
	Node<Integer> nodeLeft3;
	
	@Before
	public void createNode()
	{
		nodeLeft3 = new Node<Integer>(13, null, null);
		nodeLeft2 = new Node<Integer>(9, null, nodeLeft3);
		nodeLeft1 = new Node<Integer>(53, null, null);
		nodeLeft = new Node<Integer>(17, nodeLeft2, nodeLeft1);
		nodeRight = new Node<Integer>(11, null, null);
		rootNode = new Node<Integer>(14, nodeLeft, nodeRight);
		
		binaryTree = new BinaryTree<Integer>(rootNode);
	}
	
	@Test
	public void testContructor()
	{
		assertEquals(14, binaryTree.getRoot().getData(), 0);
	}
	
	@Test
	public void testPreorderPrint()
	{
		binaryTree.preorderPrint(binaryTree.getRoot());
	}
	
	@Test
	public void testInorderPrint()
	{
		binaryTree.inorderPrint(binaryTree.getRoot());
	}
	
	@Test
	public void testPostorderPrint()
	{
		binaryTree.postorderPrint(binaryTree.getRoot());
	}
}
