package org.campus02.sorting;

public class Employee implements Comparable<Employee> { // Defaultsortierung
    private String firstname;
    private String lastname;
    private String department;
    private double salary;

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public Employee(String firstname, String lastname, String department, double salary) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.department = department;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Employee o) {
        // -1 => kleiner
        // 0 => ident
        // +1 => größer


        if (lastname.compareTo(o.lastname) == 0) {
            return firstname.compareTo(o.firstname);
        }
        else
            return lastname.compareTo(o.lastname);

        /*if (salary > o.salary) // größer
            return +3;
        if (salary < o.salary) // kleiner
            return -4;

        return 0;*/
    }
}
