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
public class OOPConcepts {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner (System.in);
        
        System.out.println("Welcome Registrar, add a new student");
        
        Registrar reg1 = new Registrar();
        
        Student student = reg1.setdetails();
        System.out.print(student.snumber+student.sname);
        reg1.getdetails();  
        
//        System.out.println("Welcome Faculty, enter number of the student you want to view");
//        
//        Faculty fac1 = new Faculty();
//       
//        fac1.getdetails(student);
//        fac1.setgrade(student);
        
    }
    
}
