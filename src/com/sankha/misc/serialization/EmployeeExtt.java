package com.sankha.misc.serialization;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class EmployeeExtt extends Person implements Externalizable {
    int employeeId;
    String department;

    public EmployeeExtt() {
        super();
    }

    public EmployeeExtt(String name, String nationality, int employeeId, String department) {
        super(name, nationality);
        this.employeeId = employeeId;
        this.department = department;
    }

    public EmployeeExtt(int employeeId, String department) {
        super();
        this.employeeId = employeeId;
        this.department = department;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
             out.writeObject(name);
        	 out.writeObject(nationality);

        	 // its own fields
        	 out.writeInt(employeeId);
        	 out.writeObject(department);

    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        	 name=(String) in.readObject();
        	 nationality=(String) in.readObject();

        	 // its own fields
        	 employeeId=in.readInt();
       	 department=(String) in.readObject();


    }
}
