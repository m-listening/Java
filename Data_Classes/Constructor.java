package Data_Classes;

public class Constructor {
    int age;
    int ass;
    String name;
    String surname;
    String department;
    int number;

    public Constructor(int age, int ass, String name, String surname, String department, int number) {
        this.age = age;
        this.ass = ass;
        this.name = name;
        this.surname = surname;
        this.department = department;
        this.number = number;
    }

    public Constructor(int age, int ass, String name, String surname, String department) {
        this(age,ass,name,surname,department,0);
    }

    public Constructor(int age, int ass, String name, String surname) {
        this(age,ass,name,surname,null,0);

    }

    public Constructor(int age, int ass, String name) {
        this(age,ass,name,null,null,0);
    }

    public Constructor(int age, int ass) {
        this(age,ass,null,null,null,0);
    }

    public Constructor(int age) {
        this(age,0,null,null,null,0);
    }
}
