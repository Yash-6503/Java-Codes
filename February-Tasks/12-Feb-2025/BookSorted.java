/*
Create a class Book with two fields name and author. 
Create a class BookSorted which will store the books in sorted order.
*/

record Book(String name, String author) implements Comparable<Book>
{
	@Override
	public int compareTo(Book b) {
		return this.name().compareTo(b.name());
	}
	
}

public class BookSorted 
{
	public static void main(String[] args) 
	{
		TreeSet<Book> t1 = new TreeSet<>();
		t1.add(new Book("Java","James Gosling"));
		t1.add(new Book("HTML","Tim Burnlee"));
		t1.add(new Book("Advance-Java","Green"));
		t1.add(new Book("Python","Smith"));
		t1.add(new Book("Angular.js","John"));
		System.out.println("Books in sorted alphabetical order");
		t1.forEach(System.out::println);
	}

}

/* output
Books in sorted alphabetical order
Book[name=Advance-Java, author=Green]
Book[name=Angular.js, author=John]
Book[name=HTML, author=Tim Burnlee]
Book[name=Java, author=James Gosling]
Book[name=Python, author=Smith]
*/


