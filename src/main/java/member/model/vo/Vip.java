package member.model.vo;

public class Vip extends Member implements Buyable{

    public Vip(String name, String grade, int point) {
        super(name, grade, point);
    }

    @Override
    public int buy(int price) {
        return price;
    }

    @Override
    public double calculateInterest() {
        return super.getPoint() * 0.1;
    }
}
