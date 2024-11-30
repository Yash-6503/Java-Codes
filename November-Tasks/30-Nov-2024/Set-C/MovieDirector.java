//ELC class of movie, director -> MovieDirector.java

package pkg.blc2;

public class MovieDirector {

	public static void main(String[] args) {
		
		Director director1 = new Director("Rohit Shetty",1980);
		
		Movie movie1 = new Movie("Singham","Ajay Devgan",2010,director1);
		
		System.out.println("Movie Details");
		movie1.displayDetails();
		
		Director director2 = new Director("S.S.Rajmouli",1970);
		
		Movie movie2 = new Movie("Bahubali","Prabhas",2015,director2);
		
		System.out.println("\nMovie Details");
		movie2.displayDetails();
	}
}

/*
Movie Details
Title : Singham
Genre : Ajay Devgan
Release Year : 2010
Director Name : Rohit Shetty
Director BirthYear : 1980

Movie Details
Title : Bahubali
Genre : Prabhas
Release Year : 2015
Director Name : S.S.Rajmouli
Director BirthYear : 1970
*/
