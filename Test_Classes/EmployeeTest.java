package Test_Classes;

import Data_Classes.Employee;

public class EmployeeTest {
    public static void main(String[] args) {

        Employee human1 = new Employee(1, 17, "Polianskyi", 4, 3100);
        Employee human2 = new Employee(2, 18, "Slobodianiuk", 6, 2900);

        System.out.println(human1.getInfoAboutSalary());
        human1.doubleSalary();
        System.out.println(human1.getInfoAboutSalary());

        System.out.println(human2.getInfoAboutSalary());
        human2.doubleSalary();
        System.out.println(human2.getInfoAboutSalary());
    }
}
