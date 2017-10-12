import com.jordan.studentregmain.Student;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jordan
 */
public class StudentTest {
    
    public StudentTest() {
    }
    
    @Test
    public void testUsername() {
        
    Student s1 = new Student("Mike","22/03/1996",21,34949);
    
    String a = "Mike21";
    String b = s1.getUsername();
    
    assertEquals(a,b);
    
    }
}

