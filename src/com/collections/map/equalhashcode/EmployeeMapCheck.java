package com.collections.map.equalhashcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 *
 * Employee hashCode will always return 1
 *
 */
public class EmployeeMapCheck {

    private Integer id;

    private String name;

    public EmployeeMapCheck(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmployeeMapCheck employee = (EmployeeMapCheck) o;
        return Objects.equals(id, employee.id) && Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return 1;// Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Map<EmployeeMapCheck, Integer> map = new HashMap<>();
        for(int i = 0; i < 10; i++){
            EmployeeMapCheck employee = new EmployeeMapCheck(1, "1");
            Integer value = map.put(employee, i);
            System.out.println("return value :: "+value);
        }
        System.out.println("value Map :: "+map);// Map size will be 10
    }
}
