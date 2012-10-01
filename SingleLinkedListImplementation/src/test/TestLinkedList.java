package test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import practice.LinkedList;

public class TestLinkedList 
{
	LinkedList<Integer> integerLinkedList; 
	LinkedList<String> stringLinkedList;
	
	@Before
	public void constructLinkedList()
	{
		integerLinkedList = new LinkedList<Integer>();
		
		ArrayList<String> stringList = new ArrayList<String>(5);
		stringList.add("Item 1");
		stringList.add("Item 2");
		stringList.add("Item 3");
		stringList.add("Item 4");
		stringList.add("Item 5");
		stringLinkedList = new LinkedList<String>(stringList);
	}
	
	@Test
	public void testDefaultConstructor()
	{
		assertEquals(0, integerLinkedList.size());
		assertEquals(null, integerLinkedList.getFirst());
	}
	
	@Test
	public void testConstructor()
	{
		assertEquals(5, stringLinkedList.size());		
		assertEquals("Item 1", stringLinkedList.getFirst().getData());
		assertEquals("Item 2", stringLinkedList.getFirst().getNextNode().getData());
		assertEquals("Item 3", stringLinkedList.getFirst().getNextNode().getNextNode().getData());
		assertEquals("Item 4", stringLinkedList.getFirst().getNextNode().getNextNode().getNextNode().getData());
		assertEquals("Item 5", stringLinkedList.getFirst().getNextNode().getNextNode().getNextNode().getNextNode().getData());
	}
	
	@Test
	public void testAddElementAtIndex()
	{
		integerLinkedList.add(5);
		integerLinkedList.add(2);
		integerLinkedList.add(8);
		
		integerLinkedList.add(0, 7);
		assertEquals(7, integerLinkedList.getFirst().getData(), 0);
		assertEquals(5, integerLinkedList.getFirst().getNextNode().getData(), 0);
		
		integerLinkedList.add(3, 10);
		assertEquals(10, integerLinkedList.getFirst().getNextNode().getNextNode().getNextNode().getData(), 0);
		
	}
	
	@Test
	public void testAddElement()
	{
		integerLinkedList.add(5);
		assertEquals(1, integerLinkedList.size());
		assertEquals(5, integerLinkedList.getFirst().getData(), 0);
		
		integerLinkedList.add(2);
		assertEquals(2, integerLinkedList.size());
		assertEquals(2, integerLinkedList.getFirst().getNextNode().getData(), 0);
	}
	
	@Test
	public void testGetFirst()
	{
		assertEquals(null, integerLinkedList.getFirst());
	}
	
	@Test
	public void testSize()
	{
		assertEquals(0, integerLinkedList.size());
	}
}
