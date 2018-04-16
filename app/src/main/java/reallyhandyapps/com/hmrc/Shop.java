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
}
