/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jordan.studentregmain;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Jorda
 */
public class Driver {
     public static void main(String args[]){
        
        // Creating 5 Student Objects
        Student s1 = new Student("Mike","22/05/1996", 21, 34949);
        Student s2 = new Student("Jordan","23/05/1997", 20, 35449);
        Student s3 = new Student("Tomas", "22/04/1996", 21, 14242);
        Student s4 = new Student("Dara", "14/01/1997", 20, 23234);
        Student s5 = new Student("Aidan", "01/03/1998", 19, 92833);
        
        
        // Creating an ArrayList for the students in a particular module
        ArrayList<Student> mlist1 = new ArrayList<Student>();
        mlist1.add(s1); mlist1.add(s2);
        mlist1.add(s4); mlist1.add(s5);
        //
        ArrayList<Student> mlist2 = new ArrayList<Student>();
        mlist2.add(s3); mlist2.add(s4); mlist2.add(s5);
        //
        ArrayList<Student> mlist3 = new ArrayList<Student>();
        mlist3.add(s1); mlist3.add(s2);
        mlist3.add(s3); mlist3.add(s4);
        
        
        // Creating the Module objects and passing in the module ArrayLists
        Module software = new Module("Software Engineering", "EE123", mlist1);
        Module telecom = new Module("Telecommunications", "EE463", mlist2);
        Module dsp = new Module("Digital Signal Processing", "CT500", mlist3);
        Module prog = new Module("Programming III", "EC543", mlist2);
        Module soc = new Module("System On Chip Design", "EC243", mlist1);
        
        
        // Creating ArrayLists to pass into the CourseProgramme object with each Module object
        ArrayList<Module> courseList1 = new ArrayList<Module>();
        courseList1.add(software);
        courseList1.add(telecom);
        courseList1.add(dsp);
        //
        ArrayList<Module> courseList2 = new ArrayList<Module>();
        courseList2.add(telecom);
        courseList2.add(dsp);
        courseList2.add(prog);
        

        // Creating the CourseProgramme object and passing in the Module ArrayLists
        Course cProgramme1 = new Course("ECE",courseList1,"03/08/2017","14/04/2018");
        Course cProgramme2 = new Course("EEE",courseList2,"05/08/2017","17/04/2018");
        
        
        // Creating a list to hold all students and an associated hashmaps to create links to modules
        ArrayList<Student> studentList = new ArrayList<Student>();
        studentList.add(s1); studentList.add(s2); studentList.add(s3); studentList.add(s4); studentList.add(s5);
        HashMap<Student, ArrayList<Module>> hmap = new HashMap<Student, ArrayList<Module>>();
        
        
        // Adding each student(key) and an arraylist(value) to the hashmap
        hmap.put(s1,new ArrayList<Module>());
        hmap.put(s2,new ArrayList<Module>());
        hmap.put(s3,new ArrayList<Module>());
        hmap.put(s4,new ArrayList<Module>());
        hmap.put(s5,new ArrayList<Module>());
       
        
        // Adding modules to each student arraylist in the hashmap
        /*Student 1*/ hmap.get(s1).add(dsp); hmap.get(s1).add(software); hmap.get(s1).add(prog);
        /*Student 2*/ hmap.get(s2).add(dsp); hmap.get(s2).add(soc); hmap.get(s2).add(telecom);
        /*Student 3*/ hmap.get(s3).add(soc); hmap.get(s3).add(prog);
        /*Student 4*/ hmap.get(s4).add(telecom); hmap.get(s4).add(software); hmap.get(s4).add(prog);
        /*Student 5*/ hmap.get(s5).add(soc); hmap.get(s5).add(software); hmap.get(s5).add(telecom);

        
        // Printing each student, with their course code and a list of their modules
        System.out.println("Student Username: " + s1.getUsername() + "\nCourse Code: " + cProgramme1 + "\nModules: \n" + hmap.get(s1) + "\n"); 
        System.out.println("Student Username: " + s2.getUsername() + "\nCourse Code: " + cProgramme1 + "\nModules: \n" + hmap.get(s2) + "\n");
        System.out.println("Student Username: " + s3.getUsername() + "\nCourse Code: " + cProgramme2 + "\nModules: \n" + hmap.get(s3) + "\n");
        System.out.println("Student Username: " + s4.getUsername() + "\nCourse Code: " + cProgramme2 + "\nModules: \n" + hmap.get(s4) + "\n");
        System.out.println("Student Username: " + s5.getUsername() + "\nCourse Code: " + cProgramme2 + "\nModules: \n" + hmap.get(s5) + "\n");
        
        
    }
}
