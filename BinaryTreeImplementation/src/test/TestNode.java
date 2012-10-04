package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import practice.Node;

public class TestNode 
{
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
	}
	
	@Test
	public void testConstructor()
	{
		assertEquals(17, nodeLeft.getData(), 0);
		assertEquals(nodeLeft2, nodeLeft.getLeftChild());
		assertEquals(nodeLeft1, nodeLeft.getRightChild());
		
		assertEquals(11, nodeRight.getData(), 0);
		assertEquals(null, nodeRight.getLeftChild());
		assertEquals(null, nodeRight.getRightChild());
		
		assertEquals(14, rootNode.getData(), 0);
		assertEquals(nodeLeft, rootNode.getLeftChild());
		assertEquals(17, rootNode.getLeftChild().getData(), 0);
		assertEquals(nodeRight, rootNode.getRightChild());
		assertEquals(11, rootNode.getRightChild().getData(), 0);
	}
	
	@Test
	public void testIsLeaf()
	{
		assertTrue(nodeLeft3.isLeaf());
		assertTrue(nodeLeft1.isLeaf());
		assertFalse(rootNode.isLeaf());
	}
}
