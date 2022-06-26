package garage.models;

public class Car
{
    private String brand;
    
    private String model;
    
    private String year;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getBrand(String brand) {
        return this.brand;
    }

    public String getModel(String model) {
        return this.model;
    }

    public String getYear(String year) {
        return this.year;
    }
}
