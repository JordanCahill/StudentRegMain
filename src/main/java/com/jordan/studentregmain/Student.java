package com.jordan.studentregmain;

import java.util.ArrayList;

/**
 *
 * @author Jordan
 */
public class Student {
    
    // Initialise Variables
    String name;
    String dob;
    int age;
    int id;
    String username;
    
    ArrayList<Module> listOfModules = new ArrayList<Module>();
    Course courseProg;
    
    public Student(String n,String d,int a,int i){
         name=n;
         dob=d;
         age=a;
         id=i;
         this.username = getUsername();
    }
    
    // Method to concatenate the students name and age
    public String getUsername(){
        return name + age;
    }
    
    public String ToString(){
        return username;
    }

    String getCourse() {
       return courseProg.toString(); 
    }
}
