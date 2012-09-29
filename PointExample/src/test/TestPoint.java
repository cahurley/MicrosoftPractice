package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import example.Point;

public class TestPoint
{
	private Point defaultPoint;
	private Point point;
	
	@Before
	public void createPointObjects()
	{
		defaultPoint = new Point();
		point = new Point(-1, 0.8);
	}
	
	@Test
	public void testDefaultConstructor()
	{
		assertEquals(0, defaultPoint.getXPosition(), 0);
		assertEquals(0, defaultPoint.getYPosition(), 0);
	}
	
	@Test
	public void testConstructor()
	{
		assertEquals(-1.0, point.getXPosition(), 0);
		assertEquals(0.8, point.getYPosition(), 0);
	}
	
	@Test
	public void testShift()
	{
		defaultPoint.shift(1, 2);
		assertEquals(1, defaultPoint.getXPosition(), 0);
		assertEquals(2, defaultPoint.getYPosition(), 0);
		
		defaultPoint.shift(-3, 0.5);
		assertEquals(-2, defaultPoint.getXPosition(), 0);
		assertEquals(2.5, defaultPoint.getYPosition(), 0);
		
		point.shift(1.3, -1.4);
		assertEquals(0.3, point.getXPosition(), 0.00001);
		assertEquals(-0.6, point.getYPosition(), 0.00001);
	}
	
	@Test
	public void testRotateNinetyDegrees()
	{
		defaultPoint.rotateNinetyDegrees();
		assertEquals(0, defaultPoint.getXPosition(), 0);
		assertEquals(0, defaultPoint.getYPosition(), 0);
		
		point.rotateNinetyDegrees();
		assertEquals(0.8, point.getXPosition(), 0);
		assertEquals(1, point.getYPosition(), 0);
	}
	
	@Test
	public void testDistanceFrom()
	{
		
	}
	
}
