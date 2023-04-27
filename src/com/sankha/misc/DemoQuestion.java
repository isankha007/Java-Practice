package com.sankha.misc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

class Employee {
    public String name;
    public String department;

    public int id;
    public String status;

    public Employee( int id,String name, String department, String status) {
        this.name = name;
        this.department = department;
        this.id = id;
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
public class DemoQuestion {
    public static void main(String[] args) {
//        //Find highest number from list - 
//        List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
//        Optional<Integer> max = numbers.stream().max((e1, e2) -> e1 - e2);
//        System.out.println(max.get());

        List<Employee> employee=new ArrayList<>();
        employee.add(new Employee(1,"Ahsanali","HR","A"));
        employee.add(new Employee(2,"Ramesh","BR","A"));
        employee.add(new Employee(3,"Salman","HR","I"));
        employee.add(new Employee(4,"Shadik","Maths","I"));
        employee.add(new Employee(5,"Adil","HR","A"));

        //Find the employee belongs to "HR" department and having active status "A" and make their name as upper case.
        List<String> collect = employee.stream().filter(e1 -> e1.getDepartment().equals("HR")
                        && e1.getStatus().equals("A"))
                .map( e1->e1.getName().toUpperCase())/*e1 -> {
                    e1.setName(e1.getName().toUpperCase());
                    return e1;
                }*/
                .collect(Collectors.toList());

    }
}
