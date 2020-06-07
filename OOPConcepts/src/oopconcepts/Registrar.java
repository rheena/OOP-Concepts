/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopconcepts;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Registrar {
    
    Scanner s = new Scanner(System.in);
    
    //Data
    private String sname;
    private int snumber;
    private int sgrade;
    private String sgrademark;

    
    //Methods
    public Student setdetails()
    {
        System.out.println("Enter student name");
        sname = s.next();
        System.out.println("Enter student number");
        snumber = s.nextInt();
        System.out.println("Enter student grade");
        sgrade = s.nextInt();
        if (sgrade >= 60) 
        {
            sgrademark = "Pass";
        } else {
            sgrademark = "Fail";
        }
        Student student = new Student(snumber,sgrade,sname);
        return student;
    }
    
    public void getdetails()
    {
      System.out.println("Enter student number to see their details");
      snumber = s.nextInt();
      System.out.println("Name: "+sname+"\n"+"Number: "+snumber+"\n"+"Grade: "+sgrade+"\n");
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
    
    public String getgrademark()
    {
        return sgrademark;  
    }
    
}
