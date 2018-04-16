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

    @Test
    public void testCheckoutWithOfferForSingleApple(){
        Shop shop = new Shop();
        ArrayList<Item> items = new ArrayList<>();
        items.add(new Apple("Apple",60));
        Assert.assertEquals(60,shop.checkoutWithOffer(items));
    }

    @Test
    public void testCheckoutWithOfferForSingleOrange(){
        Shop shop = new Shop();
        ArrayList<Item> items = new ArrayList<>();
        items.add(new Orange("Orange",25));
        Assert.assertEquals(25,shop.checkoutWithOffer(items));
    }
    @Test
    public void testCheckoutWithOfferForTwoApples(){
        Shop shop = new Shop();
        ArrayList<Item> items = new ArrayList<>();
        items.add(new Apple("Apple",60));
        items.add(new Apple("Apple",60));
        Assert.assertEquals(60,shop.checkoutWithOffer(items));
    }

    @Test
    public void testCheckoutWithOfferForThreeApples(){
        Shop shop = new Shop();
        ArrayList<Item> items = new ArrayList<>();
        items.add(new Apple("Apple",60));
        items.add(new Apple("Apple",60));
        items.add(new Apple("Apple",60));
        Assert.assertEquals(120,shop.checkoutWithOffer(items));
    }

    @Test
    public  void testCheckoutWithOfferForThreeOranges(){
        Shop shop = new Shop();
        ArrayList<Item> items = new ArrayList<>();
        items.add(new Orange("Orange",25));
        items.add(new Orange("Orange",25));
        items.add(new Orange("Orange",25));
        Assert.assertEquals(50,shop.checkoutWithOffer(items));
    }

    @Test
    public void testCheckoutWithOfferForFourOranges(){
        Shop shop = new Shop();
        ArrayList<Item> items = new ArrayList<>();
        items.add(new Orange("Orange",25));
        items.add(new Orange("Orange",25));
        items.add(new Orange("Orange",25));
        items.add(new Orange("Orange",25));
        Assert.assertEquals(75,shop.checkoutWithOffer(items));
    }
}
