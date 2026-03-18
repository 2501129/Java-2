public class Customer {
    private int myMoney;
    private Apple apple;

    public Customer(int myMoney) {
        this.myMoney = myMoney;
    }

    public void buy(Seller seller, Apple apple, int count) {
        int totalPrice = count * apple.getPrice();
        if (this.myMoney >= totalPrice) {
            boolean success = seller.sale(count);
            if (success) {
                this.myMoney -= totalPrice;

                if (this.apple == null) {
                    this.apple = new Apple(apple.getPrice(), count);
                } else {
                    this.apple.setInventory(this.apple.getInventory() + count);
                }
                System.out.println("구매 성공!");
            } else {
                System.out.println("ERROR: 판매자가 사과를 판매할 수 없습니다.");
            }
        } else {
            System.out.println("ERROR: 고객의 금액이 부족합니다.");
        }

        System.out.println("판매자 상태: " + seller);
        System.out.println("고객 상태: " + this);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("고객 현재 잔액: ").append(myMoney).append("원");
        if (apple != null) {
            if (apple.getInventory() > 0) {
                sb.append(", 사과 ").append(apple.getInventory()).append("개");
            } else {
                sb.append(", 사과 없습니다");
            }
        } else {
            sb.append(", 사과 없습니다");
        }
        return sb.toString();
    }
}