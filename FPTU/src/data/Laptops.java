package data;

public class Laptops {
    private String laptopId;
    private String laptopName;
    private String laptopMacAddress;

    public Laptops(String laptopId, String laptopName, String laptopMacAddress) {
        this.laptopId = laptopId;
        this.laptopName = laptopName;
        this.laptopMacAddress = laptopMacAddress;
    }

    public String getLaptopId() {
        return laptopId;
    }

    public void setLaptopId(String laptopId) {
        this.laptopId = laptopId;
    }

    public String getLaptopName() {
        return laptopName;
    }

    public void setLaptopName(String laptopName) {
        this.laptopName = laptopName;
    }

    public String getLaptopMacAddress() {
        return laptopMacAddress;
    }

    public void setLaptopMacAddress(String laptopMacAddress) {
        this.laptopMacAddress = laptopMacAddress;
    }
}
