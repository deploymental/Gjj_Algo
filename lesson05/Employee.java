package com.getjavajob.training.algo1702.gultiaeve.lesson05;


public class Employee {
    private int age;
    private int salary;
    private String name;
    private String lastname;

    public Employee(String name, String lastname, int age, int salary) {
        this.age = age;
        this.salary = salary;
        this.name = name;
        this.lastname = lastname;
    }

    public String getLastName() {
        return lastname;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Employee employees = (Employee) o;

        if (age != employees.age) {
            return false;
        }
        if (salary != employees.salary) {
            return false;
        }
        if (name != null ? !name.equals(employees.name) : employees.name != null) {
            return false;
        }
        return lastname != null ? lastname.equals(employees.lastname) : employees.lastname == null;
    }

    @Override
    public int hashCode() {
        int result = age;
        result = 31 * result + salary;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (lastname != null ? lastname.hashCode() : 0);
        return result;
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