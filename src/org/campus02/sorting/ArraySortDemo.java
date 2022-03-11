package org.campus02.sorting;

import sun.print.PSPrinterJob;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class ArraySortDemo {
    public static void main(String[] args) {
        
        int[] intArray = {72, 15, 19, 61, 43, 98, 9, 0};

        System.out.println("intArray = " + intArray);
        System.out.println("Arrays.toString(intArray) = " + Arrays.toString(intArray));
        
        Arrays.sort(intArray);

        System.out.println("Arrays.toString(intArray) = " + Arrays.toString(intArray));
        
        Employee e1 = new Employee("John", "Doe", "Sales", 7000);
        Employee e2 = new Employee("Max", "Mustermann", "Development", 3000);
        Employee e3 = new Employee("Susi", "Sorglos", "Development", 3500);
        Employee e4 = new Employee("Hubert", "Boss", "CEO", 8000);
        Employee e5 = new Employee("Daniel", "Düsentrieb", "R&D", 2900);
        Employee e6 = new Employee("Anna", "Boss", "Co-CEO", 7900);

        Employee eArray[] = {e1, e2, e3, e4, e5};
        System.out.println("Arrays.toString(eArray) = " + Arrays.toString(eArray));
        Arrays.sort(eArray);
        System.out.println("Arrays.toString(eArray) = " + Arrays.toString(eArray));


        ArrayList<Employee> ee = new ArrayList<>();
        ee.add(e1);
        ee.add(e2);
        ee.add(e3);
        ee.add(e4);
        ee.add(e5);
        ee.add(e6); // STRG+D

        System.out.println("ee = " + ee);
        Collections.sort(ee);
        System.out.println("ee = " + ee);
        
        Collections.sort(ee, new EmployeeFirstnameSort());
        System.out.println("ee = " + ee);
    }
}
