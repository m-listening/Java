package Data_Classes;

public class Car2 {

    private String color;
    private String engine;
    private int speed;

    public Car2(String color, String engine) {
        this.color = color;
        this.engine = engine;
    }

    public Car2() {}

    public int speedUp(int speedUp) {
        return speed += speedUp;
    }

    public int speedDown(int speedDown) {
        return speed -= speedDown;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }
}

