package reallyhandyapps.com.hmrc;

import java.util.ArrayList;

public class Shop {

    public int checkout(ArrayList<Item> items) {
        int cost = 0;
        for (Item item : items) {
            cost += item.getPrice();
        }
        return cost;
    }

    public int checkoutWithOffer(ArrayList<Item> items){
        int cost = 0;
        for(Item item:items){
            cost += item.getPrice();
            if(item instanceof Apple){
                if(items.indexOf(item) % 2 == 1){cost -= item.getPrice();}
            }else{
                //must be an orange as shop sells only Apples and Oranges
                if(items.indexOf(item) % 3 == 1){cost -= item.getPrice();}
            }
        }
        return  cost;
    }
}
