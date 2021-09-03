package entity;

public class Vehicle implements SuperEntity {
    private String number;
    private String maxweight;
    private String passengers;
    private String type;

    public Vehicle() {
    }

    public Vehicle(String number, String maxweight, String passengers, String type) {
        this.number = number;
        this.maxweight = maxweight;
        this.passengers = passengers;
        this.type = type;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getMaxweight() {
        return maxweight;
    }

    public void setMaxweight(String maxweight) {
        this.maxweight = maxweight;
    }

    public String getPassengers() {
        return passengers;
    }

    public void setPassengers(String passengers) {
        this.passengers = passengers;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
