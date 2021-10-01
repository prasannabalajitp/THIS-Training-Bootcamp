import org.junit.Test;
import static org.junit.Assert.*;

public class EvenTest {
    @Test
    public void test1(){
        EvenOddClass ob=new EvenOddClass();
        assertEquals(true,ob.isEven(12));
    }

    @Test
    public void test2(){
        EvenOddClass ob=new EvenOddClass();
        assertEquals(false,ob.isEven(13));
    }

}
