/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopconcepts;

/**
 *
 * @author user
 */
public class Student {
    
    //Data
    public int snumber;
    public int sgrade;
    public String sname;
    
    
    public Student(int number,int grade, String name)
    {
        number = snumber;
        grade = sgrade;
        name = sname;
    }
    
    
    //getter/accessor methods
    public String getname()
    {
        return sname;  
    }
    
    public int getnumber()
    {
        return +snumber;  
    }
    
    public int getgrade()
    {
        return +sgrade;  
    }
    
    public void getdetails(int  number)
    {
      System.out.println("Name: "+sname+"\n"+"Number: "+snumber+"\n"+"Grade: "+sgrade+"\n");
    }
    
    
}
