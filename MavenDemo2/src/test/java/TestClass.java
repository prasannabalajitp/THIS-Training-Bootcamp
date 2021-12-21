import org.junit.Test;
import static org.junit.Assert.*;

public class TestClass {
    @Test
    public void test(){
        int n=5;
        int m=7;

        assertTrue(n<m);
        assertFalse(n>m);

        String s1="abc";
        String s2="abc";

        assertSame(s1,s2);

        String[] str1={"abc","bbb","ccc"};
        String[] str2={"abc","bbb","ccc"};

        assertArrayEquals(str1,str2);
        assertEquals(s1,s1);
    }

}
