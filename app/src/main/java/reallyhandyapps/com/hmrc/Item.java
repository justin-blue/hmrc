package reallyhandyapps.com.hmrc;

public abstract class Item {

    String name;
    int price;

    Item(String name, int price){
        this.name = name;
        this.price = price;
    }

    public abstract String getName();

    public abstract int getPrice();
}
