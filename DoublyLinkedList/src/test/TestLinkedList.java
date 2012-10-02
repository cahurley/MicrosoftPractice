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
	}
	
	@Test
	public void testConstructor()
	{
		assertEquals(5, stringLinkedList.size());		
		assertEquals("Item 1", stringLinkedList.getFirst());
		assertEquals("Item 2", stringLinkedList.get(1));
		assertEquals("Item 3", stringLinkedList.get(2));
		assertEquals("Item 4", stringLinkedList.get(3));
		assertEquals("Item 5", stringLinkedList.get(4));
	}
	
	@Test
	public void testAddElementAtIndex()
	{
		integerLinkedList.add(5);
		integerLinkedList.add(2);
		integerLinkedList.add(8);
		
		integerLinkedList.add(0, 7);
		assertEquals(7, integerLinkedList.getFirst(), 0);
		assertEquals(5, integerLinkedList.get(1), 0);
		
		integerLinkedList.add(3, 10);
		assertEquals(10, integerLinkedList.get(3), 0);
		
	}
	
	@Test
	public void testAddElement()
	{
		integerLinkedList.add(5);
		assertEquals(1, integerLinkedList.size());
		assertEquals(5, integerLinkedList.getFirst(), 0);
		
		integerLinkedList.add(2);
		assertEquals(2, integerLinkedList.size());
		assertEquals(2, integerLinkedList.get(1), 0);
	}
	
	@Test
	public void testAddAllElements()
	{
		ArrayList<Boolean> booleanList = new ArrayList<Boolean>(3);
		booleanList.add(true);
		booleanList.add(true);
		booleanList.add(false);
		
		LinkedList<Boolean> booleanLinkedList = new LinkedList<Boolean>();
		assertEquals(0, booleanLinkedList.size());
		
		booleanLinkedList.addAll(booleanList);
		assertEquals(3, booleanLinkedList.size());
	}
	
	@Test
	public void testAddAllElementsAtIndex()
	{
		ArrayList<String> stringList = new ArrayList<String>(2);
		stringList.add("Random Item 1");
		stringList.add("Random Item 2");
		
		assertEquals(5, stringLinkedList.size());
		
		stringLinkedList.addAll(1, stringList);
		assertEquals(7, stringLinkedList.size());
		assertEquals("Random Item 1", stringLinkedList.get(1));
		assertEquals("Random Item 2", stringLinkedList.get(2));
	}
	
	@Test
	public void testAddFirst()
	{
		integerLinkedList.add(5);
		integerLinkedList.add(10);
		integerLinkedList.add(15);
		assertEquals(3, integerLinkedList.size());
		
		integerLinkedList.addFirst(20);
		assertEquals(4, integerLinkedList.size());
		assertEquals(20, integerLinkedList.getFirst(), 0);
		assertEquals(5, integerLinkedList.get(1), 0);
	}
	
	@Test
	public void testAddLast()
	{
		integerLinkedList.add(5);
		integerLinkedList.add(10);
		assertEquals(2, integerLinkedList.size());
		
		integerLinkedList.addLast(15);
		assertEquals(3, integerLinkedList.size());
		assertEquals(15, integerLinkedList.get(2), 0);
	}
	
	@Test
	public void testRemove()
	{
		assertEquals(5, stringLinkedList.size());
		
		stringLinkedList.remove(1);
		assertEquals(4, stringLinkedList.size());
		assertEquals("Item 3", stringLinkedList.get(1));
	}
	
	@Test
	public void testGetFirst()
	{
		assertEquals("Item 1", stringLinkedList.getFirst());
	}
	
	@Test
	public void testSize()
	{
		assertEquals(0, integerLinkedList.size());
	}
}
