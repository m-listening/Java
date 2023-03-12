package Data_Classes;

public class Person {

    private String name = "";
    private Integer age = 0;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(int age) {
        this.age = age;
    }

    public Person() {
    }

    public Integer getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class testPerson {
    public static void main(String[] args) {
        Person[] people = new Person[10];
        people[0] = new Person();
    }
}