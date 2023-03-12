package Test_Classes;

import Data_Classes.Car2;
import Data_Classes.Human;

public class TestHuman {
    public static void main(String[] args) {
        Human human = new Human("Oleksandr");

        human.car = new Car2("Black", "V16");
        human.showInfo();
    }
}
