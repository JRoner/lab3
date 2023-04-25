import static org.junit.Assert.*;
import org.junit.*;
import java.util.ArrayList;



public class ListTests {
	@Test 
	public void testMerge() {
    String[] input1 = {"hello", "world", "cse15l", "hello"};
    String[] check = ListExamples.filter(input1,"hello");
    assertArrayEquals(new String[]{"hello", "hello"}, input1);
	}
    
    @Test 
	public void testFilter() {
        String[] input1 = {"hello", "world", "cse15l", "hello"};
        String[] check = ListExamples.filter(input1,"hello");
        assertArrayEquals(new String[]{"hello", "hello"}, input1);
	}
}
