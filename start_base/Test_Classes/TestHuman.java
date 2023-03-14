package start_base.Test_Classes;

import start_base.Data_Classes.Car2;
import start_base.Data_Classes.Human;

public class TestHuman {
    public static void main(String[] args) {
        Human human = new Human("Oleksandr");

        human.car = new Car2("Black", "V16");
        human.showInfo();
    }
}
