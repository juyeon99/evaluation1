package member.model.vo;

public class Silver implements Buyable{

    @Override
    public int buy(int price) {
        return price;
    }
}
