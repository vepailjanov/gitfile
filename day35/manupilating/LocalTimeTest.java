package day35.manupilating;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalTime;

public class LocalTimeTest {
  @Test
    public void timecheckminus(){
      LocalTime localTime = LocalTime.of(12,30);
      LocalTime actual = localTime.minusHours(2).minusMinutes(20);
      LocalTime expected = actual;
      Assert.assertEquals(expected,actual);
  }
    @Test
    public void timecheckplus(){
        LocalTime localTime = LocalTime.of(12,30);
        LocalTime actual = localTime.plusHours(2).plusMinutes(20);
        LocalTime expected = actual;
        Assert.assertEquals(expected,actual);
    }
}
