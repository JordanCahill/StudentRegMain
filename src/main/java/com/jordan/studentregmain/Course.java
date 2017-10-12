/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jordan.studentregmain;

import java.util.ArrayList;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

/**
 *
 * @author Jorda
 */
public class Course {
    
    // Initialize variables
    String courseName;
    ArrayList<Module> listOfModules = new ArrayList<Module>();
    DateTime startDate = new DateTime();
    DateTime endDate = new DateTime();
    
    DateTimeFormatter fmt = DateTimeFormat.forPattern("dd/MM/yyyy"); // Formatter object to convert the passed in Strings to JodaTime
   
    
    public Course(String c,ArrayList<Module> a,String sd, String ed){
         courseName=c;
         listOfModules=a;
         startDate=fmt.parseDateTime(sd); // String passed in needs to be formatted to JodaTime
         endDate=fmt.parseDateTime(ed); // String passed in needs to be formatted to JodaTime
         
         
    }    
    
    // ToString method for printing purposes
    @Override
    public String toString(){
        return courseName;
    }

    
    public ArrayList<Module> getModuleList(){
        return listOfModules;
    }

    int size() {
        return listOfModules.size();
    }
}
