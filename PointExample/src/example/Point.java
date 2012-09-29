package example;

public class Point 
{
	private double xPosition;
	private double yPosition;
	
	public Point()
	{
		this.xPosition = 0;
		this.yPosition = 0;
	}
	
	public Point(double x, double y)
	{
		this.xPosition = x;
		this.yPosition = y;
	}
	
	public void shift(double amountInXDirection, double amountInYDirection)
	{
		this.xPosition += amountInXDirection;
		this.yPosition += amountInYDirection;
	}
	
	public void rotateNinetyDegrees()
	{
		double tempX = xPosition;
		xPosition = yPosition;
		yPosition = -tempX;
	}
	
	public double distanceFrom(Point p2)
	{
		double a = 0, b = 0;
		double cSquared = 0;
		
		a = getXPosition() - p2.getXPosition();
		b = getYPosition() - p2.getYPosition();
		
		cSquared = Math.pow(a, 2) + Math.pow(b, 2);
		
		return Math.pow(cSquared, 0.5);
	}
	
	public double getXPosition()
	{
		return this.xPosition;
	}
	
	public double getYPosition()
	{
		return this.yPosition;
	}
}
