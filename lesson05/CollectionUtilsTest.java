package com.getjavajob.training.algo1702.gultiaeve.lesson05;


import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import static com.getjavajob.training.algo1702.gultiaeve.lesson05.CollectionUtils.*;
import static com.getjavajob.training.algo1702.gultiaeve.util.Assert.assertEquals;


public class CollectionUtilsTest {

    public static void main(String[] args) {
        filterTest();
        transformTest();
        transformInputCollectionTest();
        forAllDoTest();
    }

    public static void filterTest() {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Ivan", "Ivanov", 60, 15000));
        employees.add(new Employee("Kurt", "Kobain", 28, 25000));

        filter(employees, new Predicate<Employee>() {
            @Override
            public boolean evaluate(Employee employee) {
                String keyWordInLowerCase = "kurt";
                return employee.getName().toLowerCase().contains(keyWordInLowerCase)
                        || employee.getLastName().toLowerCase().contains(keyWordInLowerCase);
            }
        });
        Employee filteredEmployees = new Employee("Kurt", "Kobain", 28, 25000);
        assertEquals("testEmployeeFilter", filteredEmployees, employees.get(0));
    }

    public static void transformTest() {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Kurt", "Kobain", 28, 25000));
        Collection transform = transform(employees, new Transformer<Employee, String>() {
            @Override
            public String transform(Employee employee) {
                return employee.getName();
            }
        });
        assertEquals("transformTest", employees.get(0).getName(), transform.iterator().next());
    }

    public static void transformInputCollectionTest() {
        List employees = new ArrayList<>();
        Employee employee = new Employee("Kurt", "Kobain", 28, 25000);
        employees.add(employee);
        transformInputCollection(employees, new Transformer<Employee, String>() {
            @Override
            public String transform(Employee employee) {
                return employee.getName();
            }
        });
        assertEquals("transformInputCollectionTest", employee.getName(), employees.get(0));
    }

    public static void forAllDoTest() {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Kurt", "Kobain", 28, 25000));
        forAllDo(employees, new Closure<Employee>() {
            @Override
            public void execute(Employee employee) {
                employee.setSalary(30000);
            }
        });
        assertEquals("forAllDoTest", 30000, employees.get(0).getSalary());
    }
}
/*
Violation 1(redundant var) - not found
Violation 2(redundant inicialisation) - not found
Violation 3(wrong interface) - not found
Violation 4(bad naming) - not found
Violation 5(redundant this) - not found
Violation 6(bad casting) - not found
Violation 7(static import) - not found
*/