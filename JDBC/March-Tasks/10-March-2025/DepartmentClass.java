// BLC class of Example2 -> DepartMentClass.java

public class DepartmentClass
{
	int id;
	String name;
	String location;
	int managerId;
	
	public DepartmentClass(int id, String name, String location, int managerId) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
		this.managerId = managerId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getManagerId() {
		return managerId;
	}

	public void setManagerId(int managerId) {
		this.managerId = managerId;
	}

	@Override
	public String toString() {
		return "DepartmentClass [id=" + id + ", name=" + name + ", location=" + location + ", managerId=" + managerId
				+ "]";
	}
	
}
