public class Seller {
    private Apple apple;
    private int myMoney;

    public Seller(Apple apple, int myMoney) {
        this.apple = apple;
        this.myMoney = myMoney;
    }

    public boolean sale(int count) {
        boolean flag = true;
        if (this.apple.getInventory() >= count) {
            this.apple.setInventory(this.apple.getInventory() - count);
            this.myMoney += count * this.apple.getPrice();
        } else {
            System.out.println("ERROR: 사과 수량 부족합니다.");
            flag = false;
        }
        return flag;
    }

    @Override
    public String toString() {
        return "과일 장수 현재 금액: " + myMoney + "원, " + apple;
    }
}