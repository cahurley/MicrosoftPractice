package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import practice.Node;

public class TestNode 
{
	Node<Integer> rootNode;
	Node<Integer> nodeLeft;
	Node<Integer> nodeRight;
	
	@Before
	public void createNode()
	{
		nodeLeft = new Node<Integer>(10, null, null);
		nodeRight = new Node<Integer>(5, null, null);
		rootNode = new Node<Integer>(15, nodeLeft, nodeRight);
	}
	
	@Test
	public void testConstructor()
	{
		assertEquals(10, nodeLeft.getData(), 0);
		assertEquals(null, nodeLeft.getLeftChild());
		assertEquals(null, nodeLeft.getRightChild());
		
		assertEquals(5, nodeRight.getData(), 0);
		assertEquals(null, nodeRight.getLeftChild());
		assertEquals(null, nodeRight.getRightChild());
		
		assertEquals(15, rootNode.getData(), 0);
		assertEquals(nodeLeft, rootNode.getLeftChild());
		assertEquals(10, rootNode.getLeftChild().getData(), 0);
		assertEquals(nodeRight, rootNode.getRightChild());
		assertEquals(5, rootNode.getRightChild().getData(), 0);
	}
	
	@Test
	public void testIsLeaf()
	{
		assertTrue(nodeLeft.isLeaf());
		assertTrue(nodeRight.isLeaf());
		assertFalse(rootNode.isLeaf());
	}
}
