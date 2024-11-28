package pkg.blc;

public class Address
{
    private String cityName;
    private String districtName;
    private String stateName;

    public Address(String cityName, String districtName, String stateName)
    {
        this.cityName = cityName;
        this.districtName = districtName;
        this.stateName = stateName;
    }

    @Override
    public String toString(){
        return "City : "+cityName+", District : "+districtName+", State : "+stateName;
    }
}