package start_base.Data_Classes;

public class Employee {

    private final int id;
    private final int age;
    private final String surname;
    private final int department;
    private int salary;

    public Employee(
            int id,
            int age,
            String surname,
            int department,
            int salary
    ) {
        this.id = id;
        this.age = age;
        this.surname = surname;
        this.department = department;
        this.salary = salary;
    }

    public void doubleSalary() {
        salary *= 2;
    }

    public String getSurname() {
        return surname;
    }

    public int getDepartment() {
        return department;
    }

    public int getAge() {
        return age;
    }

    public int getId() {
        return id;
    }

    public int getSalary() {
        return salary;
    }

    public String getInfoAboutSalary() {
        return surname + ": " + salary;
    }
}
