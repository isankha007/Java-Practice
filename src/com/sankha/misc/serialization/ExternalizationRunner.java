package com.sankha.misc.serialization;

import java.io.*;

public class ExternalizationRunner {
    public static void main(String[] args) {
        EmployeeExtt emp = new EmployeeExtt("Arpit","Indian",101,"CS");
        System.out.println("Before serializing");
        System.out.println("Emp id: " + emp.getEmployeeId());
        System.out.println("Name: " + emp.getName());
        System.out.println("Department: " + emp.getDepartment());
        System.out.println("Nationality: " + emp.getNationality());
        System.out.println("************");
        System.out.println("Serializing");
        try
        {
            FileOutputStream fileOut = new FileOutputStream("employee.ser");
            ObjectOutputStream outStream = new ObjectOutputStream(fileOut);
            outStream.writeObject(emp);
            outStream.close();
            fileOut.close();
        }catch(IOException i)
        {
            i.printStackTrace();
        }

        //Deserialize
        System.out.println("************");
        System.out.println("Deserializing");
        emp = null;
        try
        {
            FileInputStream fileIn =new FileInputStream("employee.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            emp = (EmployeeExtt) in.readObject();
            in.close();
            fileIn.close();
        }catch(IOException i)
        {
            i.printStackTrace();
            return;
        }catch(ClassNotFoundException c)
        {
            System.out.println("Employee class not found");
            c.printStackTrace();
            return;
        }
        System.out.println("After serializing");
        System.out.println("Emp id: " + emp.getEmployeeId());
        System.out.println("Name: " + emp.getName());
        System.out.println("Department: " + emp.getDepartment());
        System.out.println("Nationality: " + emp.getNationality());

    }
}
