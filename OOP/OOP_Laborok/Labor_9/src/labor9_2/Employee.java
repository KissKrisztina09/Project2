package labor9_2;

import labor9_1.MyDate;

public class Employee {
    private final int ID;
    private String firstName;
    private String lastName;
    private double salary;
    private MyDate birthdate;
    static int counter;

    public Employee( String firstName, String lastName, double salary, MyDate birthdate) {
        this.ID = counter ++;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.birthdate = birthdate;
    }

    public int getID() {
        return ID;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getSalary() {
        return salary;
    }

    public MyDate getBirthdate() {
        return birthdate;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setBirthdate(MyDate birthdate) {
        this.birthdate = birthdate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "ID=" + ID +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salary=" + salary +
                ", birthdate=" + birthdate +
                '}';
    }
}
