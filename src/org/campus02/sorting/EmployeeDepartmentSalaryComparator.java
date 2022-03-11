package org.campus02.sorting;

import java.util.Comparator;

public class EmployeeDepartmentSalaryComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {

        int result = o1.getDepartment().compareTo(o2.getDepartment());
        if (result == 0) {
            return Double.compare(o2.getSalary(), o1.getSalary());
        }
        return result;
    }
}
