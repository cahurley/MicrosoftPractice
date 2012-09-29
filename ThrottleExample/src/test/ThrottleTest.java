package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import example.Throttle;

public class ThrottleTest 
{
	private Throttle throttle;
	
	@Before
	public void createThrottleObject()
	{
		throttle = new Throttle();
	}
	
	@Test
	public void testConstructor() 
	{
		assertFalse(throttle.isOn());
		assertEquals(0, throttle.flow(), 0);
	}
	
	@Test
	public void testShutOff()
	{
		throttle.shift(2);
		assertTrue(throttle.isOn());
		
		throttle.shutOff();
		assertFalse(throttle.isOn());
	}
	
	@Test
	public void testShift()
	{
		assertEquals(0, throttle.flow(), 0);
		
		throttle.shift(2);
		assertEquals((2/6.0), throttle.flow(), 0);
		
		throttle.shift(4);
		assertEquals((6/6.0), throttle.flow(), 0);
		
		throttle.shift(1);
		assertEquals((6/6.0), throttle.flow(), 0);
		
		throttle.shift(-3);
		assertEquals((3/6.0), throttle.flow(), 0);
		
		throttle.shift(-4);
		assertEquals(0, throttle.flow(), 0);
	}
	
	@Test
	public void testFlow()
	{
		assertEquals(0, throttle.flow(), 0);
		
		throttle.shift(1);
		assertEquals((1/6.0), throttle.flow(), 0);
		
		throttle.shift(1);
		assertEquals((2/6.0), throttle.flow(), 0);
		
		throttle.shift(1);
		assertEquals((3/6.0), throttle.flow(), 0);
		
		throttle.shift(1);
		assertEquals((4/6.0), throttle.flow(), 0);
		
		throttle.shift(1);
		assertEquals((5/6.0), throttle.flow(), 0);
		
		throttle.shift(1);
		assertEquals((6/6.0), throttle.flow(), 0);
	}
	
	@Test
	public void testIsOn()
	{
		assertTrue(throttle.flow() == 0);
		assertFalse(throttle.isOn());
		
		throttle.shift(3);
		assertTrue(throttle.flow() != 0);
		assertTrue(throttle.isOn());
	}
	
	@Test
	public void testIsFlowMoreThanHalf()
	{
		assertFalse(throttle.isFlowMoreThanHalf());
		
		throttle.shift(2);
		assertFalse(throttle.isFlowMoreThanHalf());
		
		throttle.shift(2);
		assertTrue(throttle.isFlowMoreThanHalf());
		
		throttle.shift(2);
		assertTrue(throttle.isFlowMoreThanHalf());
	}

}
