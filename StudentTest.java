import Data_Classes.Student;

public class StudentTest {
    public static void main(String[] args) {
        Student student1 = new Student("Oleksandr", "Polianskyi");
        Student student2 = new Student("Anastasia", "Slobodianiuk");
        Student student3 = new Student("Ruslan", "Vlasuk");

        student1.setStudentNumber(1);
        student1.setAverageScoreMath(4.6);
        student1.setAverageScoreEconomy(4.4);
        student1.setYearOfStudy(2022);
        student1.setAverageScoreForeignLang(4.3);

        student2.setStudentNumber(2);
        student2.setAverageScoreMath(4.3);
        student2.setAverageScoreEconomy(4.2);
        student2.setYearOfStudy(2022);
        student2.setAverageScoreForeignLang(4.9);

        student3.setStudentNumber(3);
        student3.setAverageScoreMath(4.8);
        student3.setAverageScoreEconomy(4.5);
        student3.setYearOfStudy(2022);
        student3.setAverageScoreForeignLang(4.2);

        System.out.println("Середній біл студентів:");
        System.out.println(student1.getFirstName() + " " + student1.getLastName() + ": " + student1.getAverageScoreFromAll());
        System.out.println(student2.getFirstName() + " " + student2.getLastName() + ": " + student2.getAverageScoreFromAll());
        System.out.println(student3.getFirstName() + " " + student3.getLastName() + ": " + student3.getAverageScoreFromAll());
    }
}
