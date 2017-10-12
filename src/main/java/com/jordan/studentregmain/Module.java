package com.jordan.studentregmain;

import java.util.ArrayList;

/**
 *
 * @author Jordan
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
