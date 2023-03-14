package Data_Classes;

public class Human {
    private final String name;

    public Human(String name) {
        this.name = name;
    }

    public Car2 car;

    public void showInfo() {
        System.out.println("Name: " + name + ". Engine: " + car.getEngine() + ", color: " + car.getColor());
    }
}

