package com.sankha.misc.serialization;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Employee implements Serializable {

     private static final long serialVersionUID = 1L;
     int employeeId;
     String employeeName;
     String department;
    transient Address address;

    public Employee() {
    }

    public Employee(int employeeId, String employeeName, String department, Address address) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.department = department;
        this.address = address;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public String getDepartment() {
        return department;
    }

    public Address getAddress() {
        return address;
    }

    private void writeObject(ObjectOutputStream os) throws IOException,ClassNotFoundException{
           os.defaultWriteObject();
           os.writeInt(address.getHomeNo());
           os.writeObject(address.getStreet());
           os.writeObject(address.getCity());

    }
    private void readObject(ObjectInputStream is) throws IOException,ClassNotFoundException{
                is.defaultReadObject();
        	   int homeNo=is.readInt();
        	   String street=(String) is.readObject();
        	   String city=(String) is.readObject();
        	   address=new Address(homeNo,street,city);

    }
}
