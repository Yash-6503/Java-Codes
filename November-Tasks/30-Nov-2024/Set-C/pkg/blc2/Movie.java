//BLC class of EmployeeManagementSystem -> Movie.java

package pkg.blc2;

public class Movie {

	String title;
	String genre;
	int releaseYear;
	Director director;
	
	public Movie(String title, String genre, int releaseYaer, Director director)
	{
		this.title = title;
		this.genre = genre;
		this.releaseYear = releaseYaer;
		this.director = director;
	}
	
	public void displayDetails()
	{
		System.out.println("Title : "+title);
		System.out.println("Genre : "+genre);
		System.out.println("Release Year : "+releaseYear);
		System.out.println("Director Name : "+director.name);
		System.out.println("Director BirthYear : "+director.birthYear);
	}
	
}
