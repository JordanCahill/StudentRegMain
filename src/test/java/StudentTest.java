/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.jordan.studentregmain.Student;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jorda
 */
public class StudentTest {
    
    public StudentTest() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testUsername() {
        
    Student s1 = new Student("Mike","22/03/1996",21,34949);
    
    String a = "Mike21";
    String b = s1.getUsername();
    
    assertEquals(a,b);
    
    }
}

