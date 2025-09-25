package at.fhj.msd;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SubjectTest {
    private Subject s;
    @BeforeEach
    void setup(){
         s=new Subject();
    }
    @Test
    void testInvalidname(){
        assertThrows(IllegalArgumentException.class, ()->s.setName(null));
        assertThrows(IllegalArgumentException.class, ()->s.setName(""));
        assertThrows(IllegalArgumentException.class, ()->s.setName("   "));
    }
    @Test
    void testInvalidTotalGrades(){
        assertThrows(IllegalArgumentException.class, ()->s.setTotalGrades(-1));
        assertThrows(IllegalArgumentException.class, ()->s.setTotalGrades(101));
    }

    

}
