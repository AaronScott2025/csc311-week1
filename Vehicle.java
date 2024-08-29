public class Vehicle {

    private int numberOfWheels;
    private String color;
    private float engineSize;
    private String fuelType;

    public Vehicle(int numberOfWheels, String color, float engineSize, String fuelType) {
        this.numberOfWheels = numberOfWheels;
        this.color = color;
        this.engineSize = engineSize;
        this.fuelType = fuelType;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getEngineSize() {
        return engineSize;
    }

    public void setEngineSize(float engineSize) {
        this.engineSize = engineSize;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public static void main(String[] args) {
        Vehicle v = new Vehicle(4,"red",5,"diesel");
        Car c = new Car(5, "blue", 2, "gas","Volvo");

        c.honk();
        c.displayInfo();

        c.setColor("green");
        c.setBrand("Lexus");
        c.setEngineSize(21);
        c.setNumberOfWheels(6);
        c.setFuelType("Orange Juice");
        c.honk();
        c.displayInfo();



    }
}
