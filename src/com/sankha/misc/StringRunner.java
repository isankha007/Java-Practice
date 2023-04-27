package com.sankha.misc;

import java.util.*;
import java.util.stream.Collectors;

class Something implements Comparable<Something>{

    private Integer age;
    private String name;
    private Long id;

    public Something(Integer age, String name, Long id) {
        this.age = age;
        this.name = name;
        this.id = id;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Something)) return false;
        Something something = (Something) o;
        return Objects.equals(age, something.age) && Objects.equals(name, something.name) && Objects.equals(id, something.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name, id);
    }

    @Override
    public int compareTo(Something o) {
        return age.compareTo(o.age);
    }

    @Override
    public String toString() {
        return "Something{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
class  customCompare implements Comparator<Something>{

    @Override
    public int compare(Something o1, Something o2) {
        return o1.getAge().compareTo(o2.getAge());
    }
}

public class StringRunner {
    public static void main(String[] args) {

        Map<String, Long> m="The quick brown fox jumped over the lazy dog."
                .chars()
                .mapToObj(i -> (char) i)
                .collect(Collectors.groupingBy(Object::toString, Collectors.counting()));

        System.out.println(m);
        String s= "Sankhadeep Chatterjee";
        List<Something> arl=new ArrayList<Something>();
        Something s1=new Something(1,"abc",12L);
        Something s2=new Something(3,"xyz",3L);
        Something s3=new Something(4,"mda",14L);
        arl.add(s1);
        arl.add(s2);
        arl.add(s3);
        System.out.println(arl);
        Collections.sort(arl);
        System.out.println(arl);
        arl.sort(new customCompare());
        System.out.println(arl);



    }
}
