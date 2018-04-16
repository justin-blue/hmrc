package reallyhandyapps.com.hmrc;

public class Apple extends Item {

    Apple(String name, int price) {
        super(name, price);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getPrice() {
        return price;
    }
}
