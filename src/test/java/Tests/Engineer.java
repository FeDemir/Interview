package Tests;

public class Engineer extends Employee{
    private int salary;
    private String grade;
    @Override
    void setSalary(int salary) {
        this.salary=salary;
    }

    @Override
    int getSalary() {
        return salary;
    }

    @Override
    void setGrade(String grade) {
        this.grade=grade;
    }

    @Override
    String getGrade() {
        return grade;
    }
}
