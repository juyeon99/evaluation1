package member.model.vo;

public class Vip implements Buyable{

    @Override
    public int buy(int price) {
        return price;
    }
}
