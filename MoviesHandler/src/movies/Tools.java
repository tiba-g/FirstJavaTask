package movies;

import java.util.HashMap;
import java.util.List;

public abstract class Tools {
	
	public static String toXMLString(String tagName, String value)
	{
		return "<" + tagName + ">" + value + "</" + tagName + ">";
	}
	
	public static HashMap<Person, Integer> countMoviesPerPerson(List<Movie> movies)
	{
		HashMap<Person, Integer> moviesPerPerson = new HashMap<>();
		
		for (Movie movie : movies)
		{
			for (Person person : movie.getCast())
			{
				if(moviesPerPerson.containsKey(person))
				{
					 moviesPerPerson.put(person, moviesPerPerson.get(person) + 1);
				}
				else
				{
					moviesPerPerson.put(person, 1);
				}
			}
		}
		
		return moviesPerPerson;
	}
	
	public static String[] getMovieTitles(List<Movie> movies)
	{
		int numberOfMovies = movies.size();
		String[] movieTitles = new String[numberOfMovies];
		
		for (int i = 0; i < numberOfMovies; i++)
		{
			movieTitles[i] = movies.get(i).getTitle();
		}
		
		return movieTitles;
	}
}
