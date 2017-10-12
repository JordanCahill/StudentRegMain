/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jordan.studentregmain;

import java.util.ArrayList;

/**
 *
 * @author Jorda
 */
public class Module {
    
    // Initialize variables
    String moduleName;
    String ID;
    ArrayList<Student> listOfStudents = new ArrayList<Student>();
    
    public Module(String m,String id,ArrayList<Student> a){
         moduleName=m;
         ID=id;
         listOfStudents=a;
         

    }
    
    // ToString method for printing purposes
    @Override
    public String toString(){
        return moduleName + " \n";
    }
    

    ArrayList<Student> getStudentList() {
        return listOfStudents;
    }

    String getModuleName() {
        return moduleName;
    }

}
