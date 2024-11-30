//BLC class of MobileManagementSystem -> Mobile.java

package pkg.blc3;

public class Mobile {

	private String brand;
    private String model;
    private int releaseYear;
    private SIMCard simCard;

    public Mobile(String brand, String model, int releaseYear, SIMCard simCard)
    {
    	this.brand = brand;
    	this.model = model;
    	this.releaseYear = releaseYear;
    	this.simCard = simCard;
    }
    
    //copy of mobile
    public Mobile(Mobile other)
    {
    	this.brand = other.brand;
    	this.model = other.model;
    	this.releaseYear = other.releaseYear;
    	this.simCard = other.simCard;
    }
    
    public void changeSim(SIMCard simCard)
    {
    	this.simCard = simCard;
    }
    
    public String displayDetails()
    {	
    	return "Sim Name : "+simCard.getSimName()+", Sim Number : "+simCard.getSimNumber()+", Mobile Brand : "+brand+", Model : "+model+", Release Year : "+releaseYear;
	
    }

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getReleaseYear() {
		return releaseYear;
	}

	public void setReleaseYear(int releaseYear) {
		this.releaseYear = releaseYear;
	}

	public SIMCard getSimCard() {
		return simCard;
	}

	public void setSimCard(SIMCard simCard) {
		this.simCard = simCard;
	}
    
    
}
