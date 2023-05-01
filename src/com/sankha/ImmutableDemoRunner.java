package com.sankha;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

final class CustomImmutable{
    private final String name;
    private List<String> phoneNumbers;

    CustomImmutable(String name, List<String> phoneNumbers) {
        this.name = name;
        this.phoneNumbers = new ArrayList<>(phoneNumbers);
    }

    public String getName() {
        return name;
    }

    public List<String> getPhoneNumbers() {
        return new ArrayList<>(phoneNumbers);
    }

    @Override
    public String toString() {
        return "CustomImmutable{" +
                "name='" + name + '\'' +
                ", phoneNumbers=" + phoneNumbers +
                '}';
    }
}
public class ImmutableDemoRunner {
    public static void main(String[] args) {
        List<String> phones=new ArrayList<>(Arrays.asList("123","234"));
        CustomImmutable customImmutable=new CustomImmutable("Sankha",phones);
        System.out.println("+++"+customImmutable);

         phones=customImmutable.getPhoneNumbers();
        phones.add("33334");
        phones.add("45454");

        System.out.println("+++"+customImmutable);
    }
}
