package com.jordan.studentregmain;

import java.util.ArrayList;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

/**
 *
 * @author Jordan
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
