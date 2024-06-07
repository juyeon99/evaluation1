package member.model.vo;

public class Gold implements Buyable{

    @Override
    public int buy(int price) {
        return price;
    }
}
