package pkg.blc;

public class Driver
{
	private String name;
 	private int age;

 	public Driver(String name, int age)
 	{
 		if(age <= 0){
 			System.out.println("Error Invalid Age");
 			return;
 		}
 		this.name = name;
 		this.age = age;
 	}

 	//copy
 	public Driver(Driver other){
 		this.name = other.name;
 		this.age = other.age;
 	}

 	public String getName(){
 		return name;
 	}

 	public int getAge(){
 		return age;
 	}

 	public void setAge(int age){
 		if(age <= 0){
 			System.out.println("Error Invalid Age");
 		}else{
 			this.age = age;
 		}
 	}
}