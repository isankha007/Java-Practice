package com.sankha.streamdemo;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class StreamDemo {
    public static void main(String[] args) {

        List<Employee> employeeList = new ArrayList<Employee>();
//https://javaconceptoftheday.com/solving-real-time-queries-using-java-8-features-employee-management-system/
        employeeList.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
        employeeList.add(new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
        employeeList.add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
        employeeList.add(new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
        employeeList.add(new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
        employeeList.add(new Employee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
        employeeList.add(new Employee(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
        employeeList.add(new Employee(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
        employeeList.add(new Employee(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
        employeeList.add(new Employee(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
        employeeList.add(new Employee(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
        employeeList.add(new Employee(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
        employeeList.add(new Employee(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
        employeeList.add(new Employee(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
        employeeList.add(new Employee(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
        employeeList.add(new Employee(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
        employeeList.add(new Employee(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0));

         Map<String,Long> noOfMaleFemale= employeeList.stream().
                 collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));
        System.out.println(noOfMaleFemale);

        List<String> departmentList = employeeList.stream().map(Employee::getDepartment).distinct().collect(Collectors.toList());
        System.out.println(departmentList);
        employeeList.stream().map(Employee::getDepartment).distinct().forEach(System.out::println);

        Map<String,Double> noAvgAgeMaleFemale = employeeList.stream().
                collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingInt(Employee::getAge)));

        System.out.println(noAvgAgeMaleFemale);

        Optional<Employee> employee
                = employeeList.stream().max(Comparator.comparingDouble(Employee::getSalary));
        Employee highestSalEmp= employee.get();
        System.out.println(highestSalEmp);

        List<String> empAfter2015 = employeeList.stream().filter(e->e.yearOfJoining>2015).map(Employee::getName)
                .collect(Collectors.toList());
        System.out.println(empAfter2015);

        Map<String,Long> deptMap= employeeList.stream().collect(Collectors.
                groupingBy(Employee::getDepartment,Collectors.counting()));
        System.out.println(deptMap);


        Map<String,Double> deptAvgMap= employeeList.stream().collect(Collectors.
                groupingBy(Employee::getDepartment,Collectors.averagingDouble(Employee::getSalary)));
        System.out.println(deptAvgMap);

        Optional<Employee> empYoungFiltered= employeeList.stream().filter(e->e.getGender().equals("Male")
                && e.getDepartment().equals("Product Development")).min(Comparator.comparingInt(Employee::getAge));

//        Optional<Employee> youngestMaleEmployeeInProductDevelopmentWrapper=
//                employeeList.stream()
//                        .filter(e -> e.getGender()=="Male" && e.getDepartment()=="Product Development")
//                        .min(Comparator.comparingInt(Employee::getAge));


        Employee empTemp=empYoungFiltered.orElse(null);

        System.out.println("============="+empTemp);

        //Query 3.9 : Who has the most working experience in the organization?

        Optional<Employee> mostExp = employeeList.stream().min(Comparator.comparingInt(Employee::getYearOfJoining));
        System.out.println(mostExp.orElse(null));
        //Query 3.10 : How many male and female employees are there in the sales and marketing team?

        Map<String,Long> salesEmpMaleFemale= employeeList.stream()
                .filter(e->e.getDepartment().equals("Sales And Marketing"))
                .collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));
        System.out.println("/// "+salesEmpMaleFemale);
        //Query 3.11 : What is the average salary of male and female employees?

        Map<String,Double> avgSalaryMaleFemale= employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingDouble(Employee::getSalary)));
        System.out.println("/// "+avgSalaryMaleFemale);

//        Query 3.12 : List down the names of all employees in each department?

       Map<String,List<Employee>>  empNames = employeeList.stream().
                collect(Collectors.groupingBy(Employee::getDepartment));
        System.out.println(empNames);

        //Query 3.13 : What is the average salary and total salary of the whole organization?
        DoubleSummaryStatistics empStats = employeeList.stream()
                .collect(Collectors.summarizingDouble(Employee::getSalary));
        System.out.println(empStats.getMax()+" "+empStats.getAverage());

        //Query 3.14 : Separate the employees who are younger or equal
        // to 25 years from those employees who are older than 25 years.
         Map<Boolean,List<Employee>> agePartition=employeeList.stream()
                 .collect(Collectors.partitioningBy(e->e.getAge() >25));
        System.out.println(agePartition);

        //Query 3.15 : Who is the oldest employee in the organization? What is his age and which department he belongs to?
        Optional<Employee> maxAge = employeeList.stream().max(Comparator.comparingInt(Employee::getAge));

        System.out.println(maxAge.orElse(null));
        List<Integer> nums = Arrays.asList(4,11,8,9);
        //Stream<Integer> stream = nums.stream();
        //Stream<Integer> stream1 = stream.map(n -> n * 2);
        List<Integer> listNew = nums.stream().sorted().filter(n->n%2==1).map(n -> n + 2)
                .collect(Collectors.toList());
        System.out.println(listNew);

          employeeList.stream().map(e->e.getDepartment()).distinct().forEach(System.out::println);
        //long count=stream.count();
        //System.out.println(count);
       // stream.forEach(System.out::println);

        //sort map wih key as id ,value as emp
        Map<Integer, Employee> empMap = employeeList.stream().collect(Collectors.toMap(employee1 -> employee1.getId(), employee1 -> employee1));
        //System.out.println("...."+empMap+" ....");
        empMap.forEach((k,v)-> System.out.println(k+"---"+v));

        LinkedHashMap<Integer, Employee> sortedEmpMap = empMap.entrySet().stream().sorted((e1, e2) -> Integer.valueOf((int) (e1.getValue().getSalary() - e2.getValue().getSalary())))
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1, e2) -> e1, LinkedHashMap::new)
                );
        System.out.println("++++++++++++++++=============================+++++++++++++++++++++++++");
        sortedEmpMap.forEach((k,v)-> System.out.println(k+"---"+v));
    }
}

