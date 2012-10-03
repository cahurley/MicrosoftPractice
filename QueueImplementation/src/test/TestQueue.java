package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import practice.Queue;

public class TestQueue
{
	Queue<String> stringQueue;
	
	@Before
	public void createQueue()
	{
		stringQueue = new Queue<String>();
	}
	
	@Test
	public void testConstructor()
	{
		assertEquals(0, stringQueue.size());
	}
	
	@Test
	public void testBack()
	{
		assertEquals(null, stringQueue.back());
		
		stringQueue.enqueue("First");
		assertEquals("First", stringQueue.back());
		
		stringQueue.enqueue("Second");
		assertEquals("Second", stringQueue.back());
		
		stringQueue.dequeue();
		assertEquals("Second", stringQueue.back());
	}
	
	@Test
	public void testDequeue()
	{
		stringQueue.enqueue("First");
		stringQueue.enqueue("Second");
		stringQueue.enqueue("Third");
		stringQueue.enqueue("Fourth");
		stringQueue.enqueue("Fifth");
		assertEquals(5, stringQueue.size());
		assertEquals("First", stringQueue.front());
		assertEquals("Fifth", stringQueue.back());
		
		stringQueue.dequeue();
		assertEquals(4, stringQueue.size());
		assertEquals("Second", stringQueue.front());
		assertEquals("Fifth", stringQueue.back());
		
		stringQueue.dequeue();
		stringQueue.dequeue();
		assertEquals(2, stringQueue.size());
		assertEquals("Fourth", stringQueue.front());
		assertEquals("Fifth", stringQueue.back());
	}
	
	@Test
	public void testEmpty()
	{
		assertTrue(stringQueue.empty());
		
		stringQueue.enqueue("First");
		assertFalse(stringQueue.empty());
		
		stringQueue.dequeue();
		assertTrue(stringQueue.empty());
	}
	
	@Test
	public void testEnqueue()
	{
		assertEquals(0, stringQueue.size());
		
		stringQueue.enqueue("First");
		assertEquals(1, stringQueue.size());
		assertEquals("First", stringQueue.front());
		assertEquals("First", stringQueue.back());
		
		stringQueue.enqueue("Second");
		stringQueue.enqueue("Third");
		assertEquals(3, stringQueue.size());
		assertEquals("First", stringQueue.front());
		assertEquals("Third", stringQueue.back());
		
		stringQueue.enqueue("Fourth");
		stringQueue.enqueue("Fifth");
		assertEquals(5, stringQueue.size());
		assertEquals("First", stringQueue.front());
		assertEquals("Fifth", stringQueue.back());
	}
	
	@Test
	public void testFront()
	{
		assertEquals(null, stringQueue.front());
		
		stringQueue.enqueue("First");
		assertEquals("First", stringQueue.front());
		
		stringQueue.enqueue("Second");
		stringQueue.enqueue("Third");
		stringQueue.enqueue("Fourth");
		assertEquals("First", stringQueue.front());
		
		stringQueue.dequeue();
		stringQueue.dequeue();
		assertEquals("Third", stringQueue.front());
	}
	
	@Test
	public void testSize()
	{
		assertEquals(0, stringQueue.size());
		
		stringQueue.enqueue("First");
		assertEquals(1, stringQueue.size());
		
		stringQueue.enqueue("Second");
		assertEquals(2, stringQueue.size());
		
		stringQueue.dequeue();
		assertEquals(1, stringQueue.size());
		
		stringQueue.dequeue();
		assertEquals(0, stringQueue.size());
	}
}
