package labor9_2;

import labor9_1.MyDate;

public class Manager extends Employee {

    private String department;

    public Manager(String firstName, String lastName, double salary, MyDate birthdate, String department) {
        super(firstName, lastName, salary, birthdate);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Maneger{" +
                "ID=" + this.getID() +
                ", firstName='" + this.getFirstName()+ '\'' +
                ", lastName='" + this.getLastName()+ '\'' +
                ", salary=" + this.getSalary() +
                ", birthdate=" + this.getBirthdate() +
                "department='" + department + '\'' +
                '}';
    }
}
