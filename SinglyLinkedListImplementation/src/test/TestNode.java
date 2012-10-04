package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import practice.Node;

public class TestNode 
{
	Node<String> nodeZero;
	Node<String> nodeOne;
	Node<String> nodeTwo;
	Node<String> nodeThree;
	
	@Before
	public void createNodes()
	{
		nodeThree = new Node<String>(null, null);
		nodeTwo = new Node<String>("Two", nodeThree);
		nodeOne = new Node<String>("One", nodeThree);
		nodeZero = new Node<String>(null, nodeOne);
	}
	
	@Test
	public void testConstructor()
	{
		assertEquals(nodeOne, nodeZero.getNextNode());
		assertEquals(null, nodeZero.getData());
		
		assertEquals(nodeThree, nodeOne.getNextNode());
		assertEquals("One", nodeOne.getData());
		
		assertEquals(nodeThree, nodeTwo.getNextNode());
		assertEquals("Two", nodeTwo.getData());
		
		assertEquals(null, nodeThree.getNextNode());
		assertEquals(null, nodeThree.getData());
	}
}
