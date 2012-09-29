
public class Throttle 
{
	private static final int MAX_THROTTLE_POSITION = 6;
	private static final int MIN_THROTTLE_POSITION = 0;
	
	private int position;
	
	public Throttle()
	{
		this.position = 0;
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
		if(position == 0)
		{
			return false;
		}
		else
		{
			return true;
		}
	}
	
}
