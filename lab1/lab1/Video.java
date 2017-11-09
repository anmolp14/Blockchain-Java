import java.util.Date;

public abstract class Video
{
	int PlayDuration;
	Date ReleaseDate;

	public int GetPlayDuration()
	{
		return this.PlayDuration;
	}

	public void SetPlayDuration ( int duration  )
	{
		this.PlayDuration = duration;
	}
	public abstract void setDate( Date date );
	public abstract Date getDate();
	

	public static void main( String[] args  )
	{

	}
}
