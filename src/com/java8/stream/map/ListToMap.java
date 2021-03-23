package com.java8.stream.map;

import com.Employee;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ListToMap {


    public static void main(String[] args) {

//        List<Employee> employeeList = new ArrayList<>();
//        employeeList.add(new Employee(1, "A"));
//        employeeList.add(new Employee(2, "A"));
//        employeeList.add(new Employee(3, "B"));
//        employeeList.add(new Employee(4, "B"));
//        employeeList.add(new Employee(5, "C"));
//        employeeList.add(new Employee(6, "D"));

//        Map<String, List<Employee>> listToMap = employeeList.stream().collect(Collectors.groupingBy(Employee::getName));
//        listToMap.entrySet().forEach(System.out::println);
//
//        Map<Integer, Employee> map = employeeList.stream().collect(Collectors.toMap(Employee::getId, Function.identity()));
//        map.entrySet().forEach(System.out::println);



    }

    static class Employee {
        private int id;
        private String name;
        Employee(int id, String name) {
            this.name = name;
            this.id = id;
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        @Override
        public String toString() {
            return "Employee{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Employee employee = (Employee) o;
            return id == employee.id &&
                    Objects.equals(name, employee.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(id, name);
        }
    }


}

