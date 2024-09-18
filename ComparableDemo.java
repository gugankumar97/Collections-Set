package Collections;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableDemo {

	public static void main(String[] args) {
		
		// A java program to demonstrate comparable
		// compareTo method compares itself to other objects

		ArrayList<Movie> list = new ArrayList<Movie>();
		
        list.add(new Movie("Captain America",7.2,2015));
        list.add(new Movie("Spider man",7.9,2017));
        list.add(new Movie("Batman",8.9,2019));
        list.add(new Movie("Mission Impossible",6.5,2013));
        
		Collections.sort(list);

		System.out.println("Movies after sorting : ");
		for (Movie movie : list) {
			System.out.println(movie.getName() + " " + movie.getRating() + " " + movie.getYear());
		}
	}
}

//A class 'Movie' that implements Comparable
class Movie implements Comparable<Movie> {
	private double rating;
	private String name;
	private int year;

	// Used to sort movies by year
	@Override
	public int compareTo(Movie m) {
		return this.name.compareTo(m.name);
	}

	// Constructor
	public Movie(String nm, double rt, int yr) {
		this.name = nm;
		this.rating = rt;
		this.year = yr;
	}

	// Getter methods for accessing private data
	public double getRating() {
		return rating;
	}

	public String getName() {
		return name;
	}

	public int getYear() {
		return year;
	}
}
