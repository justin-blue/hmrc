package reallyhandyapps.com.hmrc;

import org.junit.Assert;
import org.junit.Test;

public class AppleUnitTest {

    private Apple apple = new Apple("Apple",60);

    @Test
    public void testAppleHasCorrectName(){
        Assert.assertEquals("Apple",apple.getName());
    }

    @Test
    public void testAppleHasCorrectPrice(){
        Assert.assertEquals(60,apple.getPrice());
    }
}
