package day30.task2;

import org.junit.Assert;
import org.junit.Test;
import java.util.ArrayList;


public class TestNumbers {
    @Test
    public void TestEvenNumber(){
        Numbers nums = new Numbers();
        boolean actual = nums.checkNumber(10);
        Assert.assertTrue(actual);
    }
    @Test
    public void testCheckEvenNumber_with_odd() {
        Numbers nums = new Numbers();
        boolean actual = nums.checkNumber(3);
        Assert.assertFalse(actual);
    }

    @Test
    public void testCheckEvenNumber_with_negative_even() {
        Numbers nums = new Numbers();
        boolean actual = nums.checkNumber(-2);
        Assert.assertTrue(actual);
    }

    @Test
    public void testCheckEvenNumber_with_negative_odd() {
        Numbers nums = new Numbers();
        boolean actual = nums.checkNumber(-33);
        Assert.assertFalse(actual);
    }

    @Test
    public void testCheckEvenNumber_with_zero() {
        Numbers nums = new Numbers();
        boolean actual = nums.checkNumber(0);
        Assert.assertTrue(actual);
    }

    @Test
    public void testEvenNumbers() {
        Numbers nums = new Numbers();
        ArrayList<Integer> list = nums.Numbers();
        Integer[] actual = new Integer[list.size()];
        actual = list.toArray(actual);

        Integer[] expected = {0, 2, 4, 6, 8, 10, 12, 14, 16, 18, 20};

        Assert.assertArrayEquals(expected, actual);
    }

}
