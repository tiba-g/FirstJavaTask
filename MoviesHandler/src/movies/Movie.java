package movies;

import java.util.List;

public class Movie {
	
	private String title;
	private Genre genre;
	private long duration;
	private double rate;
	private List<Person> cast;
	
	public Movie(String title, Genre genre, int duration, double rate, List<Person> cast) 
	{
		this.title = title;
		this.genre = genre;
		this.duration = duration;
		this.rate = rate;
		this.cast = cast;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Genre getGenre() {
		return genre;
	}
	public void setGenre(Genre genre) {
		this.genre = genre;
	}
	public long getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public double getRate() {
		return rate;
	}
	public void setRate(long rate) {
		this.rate = rate;
	}
	public List<Person> getCast() {
		return cast;
	}
	public void setCast(List<Person> cast) {
		this.cast = cast;
	}

	public String toXMLString()
	{
		StringBuffer xmlStrig = new StringBuffer(Tools.toXMLString("title", this.title));
		xmlStrig.append(Tools.toXMLString("genre", this.genre.toString()));
		xmlStrig.append(Tools.toXMLString("duration", Long.toString(this.duration)));
		xmlStrig.append(Tools.toXMLString("rate", Double.toString(this.rate)));
		
		StringBuffer personString = new StringBuffer();
		for (Person person : cast) {
			personString.append(person.toXMLString());
		}
		
		xmlStrig.append(Tools.toXMLString("cast", personString.toString()));
		
		return xmlStrig.toString();
	}
	
}
