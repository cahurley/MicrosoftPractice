package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import practice.Stack;

public class TestStack 
{
	Stack<Integer> integerStack;
	
	@Before
	public void createStack()
	{
		integerStack = new Stack<Integer>();
	}
	
	@Test
	public void testConstructor()
	{
		assertTrue(integerStack.empty());
	}
	
	@Test
	public void testEmpty()
	{
		assertTrue(integerStack.empty());
		
		integerStack.push(5);
		assertFalse(integerStack.empty());
	}
	
	@Test
	public void testPeek()
	{
		assertEquals(0, integerStack.size());
		
		integerStack.push(10);
		assertEquals(1, integerStack.size());
		assertEquals(10, integerStack.peek(), 0);
		assertEquals(1, integerStack.size());
		
		integerStack.push(20);
		assertEquals(2, integerStack.size());
		assertEquals(20, integerStack.peek(), 0);
		assertEquals(2, integerStack.size());
	}
	
	@Test
	public void testPop()
	{
		assertEquals(0, integerStack.size());
		
		integerStack.push(1);
		assertEquals(1, integerStack.size());
		assertEquals(1, integerStack.peek(), 0);
		
		integerStack.push(2);
		assertEquals(2, integerStack.size());
		assertEquals(2, integerStack.peek(), 0);
		
		integerStack.pop();
		assertEquals(1, integerStack.size());
		assertEquals(1, integerStack.peek(), 0);
		
		integerStack.pop();
		assertEquals(0, integerStack.size());
	}
	
	@Test
	public void testPush()
	{
		assertEquals(0, integerStack.size());
		
		integerStack.push(3);
		assertEquals(1, integerStack.size());
		assertEquals(3, integerStack.peek(), 0);
		
		integerStack.push(8);
		assertEquals(2, integerStack.size());
		assertEquals(8, integerStack.peek(), 0);
	}
	
	@Test
	public void testSize()
	{
		assertEquals(0, integerStack.size());
		
		integerStack.push(3);
		assertEquals(1, integerStack.size());
		
		integerStack.push(9);
		assertEquals(2, integerStack.size());
		
		integerStack.pop();
		assertEquals(1, integerStack.size());
		
		integerStack.pop();
		assertEquals(0, integerStack.size());
	}
}

