package com.sankha.misc.serialization;

import java.io.*;
class Cat implements Serializable{
    int k=50;
    int j=30;
}

public class SerializableRunner {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Dog d1=new Dog();
        Cat cat=new Cat();
        FileOutputStream fos=new FileOutputStream("abc.ser");
        ObjectOutputStream oss=new ObjectOutputStream(fos);
        oss.writeObject(d1);
        oss.writeObject(cat);


        try( FileInputStream fileInputStream=new FileInputStream("abc.ser")){
        try(ObjectInputStream ois=new ObjectInputStream(fileInputStream)) {
           /* Dog d2=(Dog)ois.readObject();
            System.out.println(d2.i+" "+d2.j);
            Cat c1=(Cat) ois.readObject();
            System.out.println(c1.k+" "+c1.j);*/
            Object o=ois.readObject();
            if(o instanceof Dog){
                Dog d2=(Dog)o;
                System.out.println(d2.i+" "+d2.j);
            }
             o=ois.readObject();
            if(o instanceof Cat){
                Cat c1=(Cat) o;
                System.out.println(c1.k+" "+c1.j) ;
            }


           	  Employee emp = new Employee();
            	  emp.setEmployeeId(101);
            	  emp.setEmployeeName("Arpit");
            	  emp.setDepartment("CS");
            	  Address address=new Address(88,"MG road","Pune");
            	  emp.setAddress(address);
           	  //Serialize
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
            	  emp = null;
            	  try
            	  {
               	   FileInputStream fileIn =new FileInputStream("employee.ser");
               	   ObjectInputStream in = new ObjectInputStream(fileIn);
                	   emp = (Employee) in.readObject();
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
            	  System.out.println("Deserialized Employee...");
           	  System.out.println("Emp id: " + emp.getEmployeeId());
            	  System.out.println("Name: " + emp.getEmployeeName());
            	  System.out.println("Department: " + emp.getDepartment());
              address=emp.getAddress();
              System.out.println("City :"+address.getCity());


        }
       }
    }
}
