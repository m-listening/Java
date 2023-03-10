package Data_Classes;

public class Student {
    private final String firstName;
    private final String lastName;

    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    private int studentNumber;
    private int yearOfStudy;
    private double averageScoreMath = 0;
    private double averageScoreEconomy = 0;
    private double averageScoreForeignLang = 0;

    public double getAverageScoreForeignLang() {
        return averageScoreForeignLang;
    }

    public double getAverageScoreEconomy() {
        return averageScoreEconomy;
    }

    public double getAverageScoreMath() {
        return averageScoreMath;
    }

    public int getYearOfStudy() {
        return yearOfStudy;
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }

    public void setYearOfStudy(int yearOfStudy) {
        this.yearOfStudy = yearOfStudy;
    }

    public void setAverageScoreMath(double averageScoreMath) {
        this.averageScoreMath = averageScoreMath;
    }

    public void setAverageScoreEconomy(double averageScoreEconomy) {
        this.averageScoreEconomy = averageScoreEconomy;
    }

    public void setAverageScoreForeignLang(double averageScoreForeignLang) {
        this.averageScoreForeignLang = averageScoreForeignLang;
    }

    public double getAverageScoreFromAll() {
        double result = (averageScoreMath + averageScoreEconomy + averageScoreForeignLang) / 3;
        return (double) Math.round(result * 1000) / 1000;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }
}
