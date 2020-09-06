import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class SampleTest {
    @Test
    public void sum(){
        Calculator calculator=new Calculator();
        assertEquals(3,calculator.sum(1,2));
    }
}
