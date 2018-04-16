package reallyhandyapps.com.hmrc;

import junit.framework.Assert;

import org.junit.Test;

public class OrangeUnitTest {

    private Orange orange = new Orange("Orange",25);


    @Test
    public void testOrangeHasCorrectName(){
        Assert.assertEquals("Orange",orange.getName());

    }

    @Test
    public void testOrangeHasCorrectPrice(){
        Assert.assertEquals(25,orange.getPrice());
    }
}
