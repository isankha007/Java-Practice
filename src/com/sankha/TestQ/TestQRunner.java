package com.sankha.TestQ;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

public class TestQRunner {
    public static void main(String[] args) {

//        empList.stream().filter(e->e.getDept().equals("IT"))
//                .map(e-> {
//                    e.setSalary(e.getSalary()+(.5*(e.getSalary)) ; return e}).collect(Collectors.toList());


    Set<Employee> hs=new HashSet<>();
    Employee emp1=new Employee();
    emp1.name="Sankha";

        Employee emp2=new Employee();
        emp2.name="Sankha";

        hs.add(emp1);
        hs.add(emp2);

        System.out.println("Size "+hs.size());
       // if(hs.contains())



    }

}

class Employee{
    public String name;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee employee = (Employee) o;
        return Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
