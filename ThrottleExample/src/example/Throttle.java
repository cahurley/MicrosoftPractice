package example;

public class Throttle 
{
	private static int MAX_THROTTLE_POSITION;
	private static final int MIN_THROTTLE_POSITION = 0;
	
	private int position;
	
	public Throttle(int maxThrottlePosition)
	{
		if(maxThrottlePosition > 0)
		{
			this.MAX_THROTTLE_POSITION = maxThrottlePosition;
		}
		else
		{
			this.MAX_THROTTLE_POSITION = 6;
		}
		shutOff();
	}
	
	public void shutOff()
	{
		position = 0;
	}
	
	public void shift(int amountToShiftBy)
	{
		position += amountToShiftBy;
		
		if(position > MAX_THROTTLE_POSITION)
		{
			position = MAX_THROTTLE_POSITION;
		}
		else if(position < MIN_THROTTLE_POSITION)
		{
			position = MIN_THROTTLE_POSITION;
		}
	}
	
	public final double flow()
	{
		return ((double) position / MAX_THROTTLE_POSITION);
	}
	
	public final boolean isOn()
	{
		return (flow() > 0);
	}
	
	public final boolean isFlowMoreThanHalf()
	{
		return (flow() > 0.5);
	}
	
}
