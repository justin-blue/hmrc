package reallyhandyapps.com.hmrc;

public class Orange extends Item {

    public Orange(String name,int price){
        super(name,price);
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
