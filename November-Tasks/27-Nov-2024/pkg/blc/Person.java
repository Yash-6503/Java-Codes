package pkg.blc;

public class Person
{
	private String name;
	private Address address;

	public Person(String name, Address address)
	{
		this.name = name;
		this.address = address;
	}

	@Override
	public String toString()
	{
		return "Name : "+name+", "+address;
	}
}