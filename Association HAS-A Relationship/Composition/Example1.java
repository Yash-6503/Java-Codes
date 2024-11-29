//Program on Composition

// Engine class
class Engine {
    private String type;

    public Engine(String type) {
        this.type = type;
    }

    public String getType() {
        return "Engine Type: " + type;
    }
}

// Car class
class Car {
    private String brand;
    private Engine engine; // Composition: Car owns Engine

    public Car(String brand, String engineType) {
        this.brand = brand;
        this.engine = new Engine(engineType); // Engine created within Car
        //this.engine = new Engine("Electric"); // Engine created within Car (Hardcoded Optional)
    }

    public void showCarDetails() {
        System.out.println("Car Brand: " + brand + ", " + engine.getType());
    }
}

// Main class to test
public class Example1 {
    public static void main(String[] args) {
        Car car = new Car("Tesla", "Electric");
        car.showCarDetails();
    }
}
