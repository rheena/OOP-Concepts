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
public class Faculty {

    Scanner s = new Scanner(System.in);

    //Data
    private int snumber;
    private int sgrade;
    private String sname;

    //Methods
    public void getdetails(Student student) 
    {
        System.out.println("Enter student number to view their details");
        snumber = s.nextInt();
        System.out.println(student.snumber + student.sname);
        if(snumber == student.snumber){
            student.getdetails(snumber);
        }
        
        else{
            System.out.println("Student does not exists.");
        }
    }

    public Student setgrade(Student student) 
    {
        System.out.println("Enter student's new grade");
        sgrade = s.nextInt();
        
        student.sgrade= sgrade;
        return student;
    }
}
