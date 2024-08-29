public class Car extends Vehicle{

    private String brand;
    public Car(int numberOfWheels, String color, float engineSize, String fuelType, String brand) {
        super(numberOfWheels, color, engineSize, fuelType);
        this.brand = brand;
    }

    public void honk() {
        System.out.println("Honk, honk!");
    }

    public void displayInfo(){
        System.out.println(getColor());
        System.out.println(getEngineSize());
        System.out.println(getFuelType());
        System.out.println(getNumberOfWheels());
        System.out.println(getBrand());
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
