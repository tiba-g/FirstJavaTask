package movies;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MovieManager {

	public final static String CONSTANT = "C:\\Users\\Tiba Gabor\\Desktop\\movies.xml";
	
	public static void main(String[] args) 
	{
		List<Person> personsList = new ArrayList<Person>();
		personsList.add(new Person("Ember", "Egy", Gender.COMEDY, true, true));
		personsList.add(new Person("Ember2", "Ketto", Gender.ACTION, false, false));
		
		Movie movie1 = new Movie("Cim1", Genre.FEMALE, 210, 8.9, personsList);
		//System.out.println(movie1.toXMLString());
		WriteToXMLFile(movie1.toXMLString());
	}

	public static void WriteToXMLFile(String xmlString)
	{
		try
		{
		xmlString = Tools.toXMLString("movie", xmlString);
		xmlString = Tools.toXMLString("movies", xmlString);
		File file = new File(CONSTANT);
		file.createNewFile();
		BufferedWriter writer = new BufferedWriter(new FileWriter(file));
		
		System.out.println(xmlString);
		writer.write(xmlString);
		writer.flush();
		writer.close();
		}
		 catch(FileNotFoundException e)
	    {
	        System.out.println("File Not Found");
	        System.exit( 1 );
	    }
	    catch(IOException e)
	    {
	        System.out.println("something messed up");
	        System.exit( 1 );
	    }
		catch(Exception e)
		{
			System.out.println(e);
			System.exit( 1 );
		}
		
		return;
	}
	
}
