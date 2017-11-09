import java.util.Date;

public class Movie extends Video
{
	String name;

	public enum Rating {A , U , UA ;  }
	public Rating MovieRating;
	public Rating GetRating()
	{
		return this.MovieRating;
	}
	public void SetRating( Rating R )
	{
		this.MovieRating = R;
	}

	public void SetName ( String moviename  )
	{
		this.name = moviename;
	}
	public String GetName ()
	{
		return this.name;
	}

	public Date getDate()
	{
		return ReleaseDate;
	}
	public void setDate( Date date)
	{
		ReleaseDate = date;
	}

	public static void main( String[] args)
	{
		
		   Movie m1 = new Movie();
		  m1.SetName( "Fight Club" );
		Date date = new Date(900000);
		   m1.SetRating(Rating.A  );
		   m1.setDate( date) ;
		    System.out.println(m1.GetName()) ;
		   System.out.println(m1.GetRating()) ;
		    System.out.println(m1.getDate()) ;

		   Movie m2 = new Movie();
		  m2.SetName( "Fight Club2" );
		Date date = new Date(90000);
		   m2.SetRating(Rating.A  );
		   m2.setDate( date) ;
		    System.out.println(m2.GetName()) ;
		   System.out.println(m2.GetRating()) ;
		    System.out.println(m2.getDate()) ;
		

		   

	}
}
