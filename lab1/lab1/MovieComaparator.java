import java.util.Comparator;

public class MovieComaparator implements Comparator<Movie>{

	public int compare( Movie m1, Movie m2 )
	{
	if( m1.ReleaseDate == m2.ReleaseDate && (m1.name).compareTo(m2.name) == 0 )
		return 0;
	else if(  (m1.name).compareTo( m2.name ) != 0  )
		return (m1.name).compareTo( m2.name );
	else if ( (m1.GetDate()).after(m2.GetDate() ) )
		return 1;
	else
		return -1;
	}

}

