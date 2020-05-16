package day30.Test;

import org.junit.Assert;
import org.junit.Test;

public class taskTest {
    @Test
    public void checksum(){
        int sum = 150/50;
        Assert.assertEquals(sum,3);
    }
    @Test
    public void otherClass(){
        task task1 = new task();
        boolean checking = task1.checkNumber(4);
        Assert.assertTrue(checking);
    }
    @Test
    public void checkFalse(){
        task task2 = new task();
        boolean actual = task2.checkNumber(3);
        Assert.assertFalse(actual);
    }
    @Test
    public void Sum(){
        task task3 = new task();
        int actual = task3.sum(5,5,5);
        Assert.assertEquals(actual,15);
    }
    @Test
    public void stringcheck(){
        String actual = "hello";
        Assert.assertEquals(actual,"hello");
    }
}
