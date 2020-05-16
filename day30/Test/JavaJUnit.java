package day30.Test;
import org.junit.Assert;
import org.junit.Test;
public class JavaJUnit {
    @Test
    public void testSum() {
        int sum = 15 + 5;
        Assert.assertEquals(20, sum);
    }
    @Test
    public void testTrue() {
        boolean actual = "hello".contains("e"); //(true && true) || (false && true);
        Assert.assertTrue(actual);
    }
    @Test
    public void testTrue1(){
        boolean result = 20/2==10;
        Assert.assertTrue(result);
    }
}
