package com.dsa.challenges;

import java.util.*;

public class Sorts {

    public static void main(String[] args) {
//        Employee[] employees = {new Employee(1,"c",1400000),
//                                new Employee(2,"a",30000000),
//                                new Employee(1,"b",14000)};
//
//        Arrays.sort(employees);
//
//        System.out.println(Arrays.toString(employees));

        List<Employee> list = new ArrayList<>();
        list.add(new Employee(1,"c",1400000));
        list.add(new Employee(2,"a",30000000));
        list.add(new Employee(1,"b",14000));

        list.sort(new EmpComparater());
        System.out.println(list);
    }
}

class Employee {

    private int id;
    private String employeeName;
    private int salary;

    public Employee() {
    }

    public Employee(int id, String employeeName, int salary) {
        this.id = id;
        this.employeeName = employeeName;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", employeeName='" + employeeName + '\'' +
                ", salary=" + salary +
                '}';
    }


}

class EmpComparater implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        return o2.getEmployeeName().compareTo(o1.getEmployeeName());
    }
}