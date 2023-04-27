package com.sankha.misc.comp;

import java.util.*;
import java.util.stream.Collectors;

public class Employee {

    private String name;
    private String location;
    private Integer age;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Employee(String name, String location, Integer age) {
        this.name = name;
        this.location = location;
        this.age = age;
    }
    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    public Integer getAge() {
        return age;
    }
    public void setAge(Integer age) {
        this.age = age;
    }
    @Override
    public String toString() {
        return "Employee [name=" + name + ", location=" + location + ", age=" + age + "]";
    }

    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(new Employee[] { new Employee("Gyan", "Bangalore", 30),
                new Employee("Ravi", "Hyderabad", 25), new Employee("Sachin", "Bangalore", 28),
                new Employee("Sunil", "Delhi", 32), new Employee("John", "Chennai", 22) });

        System.out.println(employees);

        //Print the names of First 3 Employees in Lower Case
        employees.stream().limit(3).forEach(employee -> System.out.println(employee.getName().toLowerCase()));

        //Write Logic to get the Oldest Employee
        Optional<Employee> max = employees.stream().max((e1, e2) -> (e1.getAge() - e2.getAge()));//.stream().forEach(employee -> System.out.println(employee));

        System.out.println(max.get());
        // Write logic to get the sum of all the ages
        Integer reduce = employees.stream().map(e -> e.getAge()).reduce(0, (e1, e2) -> (e1 + e2));
        System.out.println(reduce);

        // Write logic to get the list of distinct locations
        employees.stream().map(e->e.getLocation()).distinct().forEach(System.out::println);

        //Write logic to get the list of Employees at Bangalore
        List<Employee> bangalore = employees.stream().filter(e -> e.getLocation().equals("Bangalore")).collect(Collectors.toList());
        System.out.println(" "+bangalore);


        //map from emplist

        Map<String, Employee> mapEmp = employees.stream().collect(Collectors.toMap(Employee::getName, (employee -> employee)));
        System.out.println(mapEmp);

//        boolean flag1 = "Java" == "Java".replace('J', 'J'); //Line n1
//        boolean flag2 = "Java" == "Java".replace("J", "J"); //Line n2
//        System.out.println(flag1 && flag2);

          
    }


}
