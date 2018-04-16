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
        int numberOfApples = 0;
        int numberOfOranges = 0;
        for(Item item:items){
            cost += item.getPrice();
            if(item instanceof Apple){
                numberOfApples++;
                if(numberOfApples % 2 == 0){cost -= item.getPrice();}
            }else{
                //must be an orange as shop sells only Apples and Oranges
                numberOfOranges++;
                if(numberOfOranges % 3 == 0){cost -= item.getPrice();}
            }
        }
        return  cost;
    }
}
