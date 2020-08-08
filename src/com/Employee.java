package com;

import java.util.Objects;

/**
 * Equal and hashcode example in java 8
 */
public class Employee {

    private Long id;

    private String name;

    private Long deptId;

    public Employee(Long id, String name, Long deptId) {
        super();
        this.id = id;
        this.name = name;
        this.deptId = deptId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getDeptId() {
        return deptId;
    }

    public void setDeptId(Long deptId) {
        this.deptId = deptId;
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", deptId=" + deptId + "]";
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(id, employee.id) &&
                Objects.equals(name, employee.name) &&
                Objects.equals(deptId, employee.deptId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, deptId);
    }


    //in java 7 implementation
//    @Override
//    public int hashCode() {
//        final int prime = 31;
//        int result = 1;
//        result = prime * result + ((deptId == null) ? 0 : deptId.hashCode());
//        result = prime * result + ((id == null) ? 0 : id.hashCode());
//        result = prime * result + ((name == null) ? 0 : name.hashCode());
//        return result;
//    }
//
//    @Override
//    public boolean equals(Object obj) {
//        if (this == obj)
//            return true;
//        if (obj == null)
//            return false;
//        if (getClass() != obj.getClass())
//            return false;
//        Employee other = (Employee) obj;
//        if (deptId == null) {
//            if (other.deptId != null)
//                return false;
//        } else if (!deptId.equals(other.deptId))
//            return false;
//        if (id == null) {
//            if (other.id != null)
//                return false;
//        } else if (!id.equals(other.id))
//            return false;
//        if (name == null) {
//            if (other.name != null)
//                return false;
//        } else if (!name.equals(other.name))
//            return false;
//        return true;
//    }

}
