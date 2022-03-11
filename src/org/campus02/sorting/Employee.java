package org.campus02.sorting;

public class Employee implements Comparable<Employee> {
    private String firstname;
    private String lastname;
    private String department;
    private double salary;

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

        if (salary > o.salary)
            return 1;
        if (salary < o.salary)
            return -1;

        return 0;
    }
}
