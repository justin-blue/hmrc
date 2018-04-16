package reallyhandyapps.com.hmrc;


import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class ShopUnitTest {

    @Test
    public void addBasketItemsCorrectly() {
        Shop shop = new Shop();
        ArrayList<Item> items = new ArrayList<>();
        items.add(new Apple("Apple", 60));
        items.add(new Orange("Orange",25));
        Assert.assertEquals(85, shop.checkout(items));
    }
}
