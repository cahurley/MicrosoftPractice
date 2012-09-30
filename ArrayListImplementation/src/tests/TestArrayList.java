package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import practice.ArrayList;


public class TestArrayList
{
	ArrayList<String> stringArrayList;
	ArrayList<Integer> integerArrayList;
	
	@Before
	public void createArrayListObjects()
	{
		this.stringArrayList = new ArrayList<String>();
		this.integerArrayList = new ArrayList<Integer>(5);
	}
	
	@Test
	public void testConstructors()
	{
		assertEquals(0, stringArrayList.size());
		assertEquals(10, stringArrayList.getCapacity());
		
		assertEquals(0, integerArrayList.size());
		assertEquals(5, integerArrayList.getCapacity());
	}
	
	@Test
	public void testAdd()
	{
		stringArrayList.add("Item 1");
		assertEquals(1, stringArrayList.size());
		//assertEquals("Item 1", stringArrayList.get(0));
		
		
		integerArrayList.add(1);
		assertEquals(1,  integerArrayList.size());
		integerArrayList.add(2);
		assertEquals(2,  integerArrayList.size());
		integerArrayList.add(3);
		assertEquals(3,  integerArrayList.size());
		integerArrayList.add(4);
		assertEquals(4,  integerArrayList.size());
		integerArrayList.add(5);
		assertEquals(5,  integerArrayList.size());
		integerArrayList.add(6);
		assertEquals(6,  integerArrayList.size());
		
		assertEquals(10, integerArrayList.getCapacity());
	}
	
	@Test
	public void testClear()
	{
		integerArrayList.add(1);
		integerArrayList.add(2);
		integerArrayList.add(3);
		integerArrayList.add(4);
		integerArrayList.add(5);
		
		integerArrayList.clear();
		assertEquals(0, integerArrayList.size());
		assertEquals(null, integerArrayList.get(0));
	}
	
	@Test
	public void testGet()
	{
		stringArrayList.add("Item 1");
		stringArrayList.add("Item 2");
		assertEquals("Item 1", stringArrayList.get(0));
		assertEquals("Item 2", stringArrayList.get(1));
		
		integerArrayList.add(1);
		integerArrayList.add(2);
		assertEquals((Integer)1, integerArrayList.get(0));
		assertEquals((Integer)2, integerArrayList.get(1));
	}
	
	@Test
	public void testRemove()
	{
		stringArrayList.add("Item 1");
		stringArrayList.add("Item 2");
		stringArrayList.add("Item 3");
		stringArrayList.add("Item 4");
		assertEquals("Item 1", stringArrayList.get(0));
		assertEquals("Item 2", stringArrayList.get(1));
		assertEquals("Item 3", stringArrayList.get(2));
		assertEquals("Item 4", stringArrayList.get(3));
		
		stringArrayList.remove(2);
		assertEquals("Item 4", stringArrayList.get(2));
		assertEquals(null, stringArrayList.get(3));
		
		stringArrayList.remove(0);
		assertEquals("Item 2", stringArrayList.get(0));
		assertEquals(null, stringArrayList.get(2));
		
		stringArrayList.remove(0);
		assertEquals("Item 4", stringArrayList.get(0));
		assertEquals(null, stringArrayList.get(1));
		
		stringArrayList.remove(0);
		assertEquals(null, stringArrayList.get(0));
		
		assertTrue(stringArrayList.isEmpty());
	}
	
	@Test
	public void testSize()
	{
		assertEquals(0, stringArrayList.size());
		assertEquals(0, integerArrayList.size());
	}
	
}
