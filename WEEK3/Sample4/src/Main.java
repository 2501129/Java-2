public class Main {
    public static void main(String[] args) {

        Apple apple = new Apple(1000, 20);

        Seller seller = new Seller(apple, 50000);

        Customer customer = new Customer(35000);


        System.out.println("=== 거래 전 ===");
        System.out.println(seller);

        System.out.println("\n=== 거래 중 ===");
        customer.buy(seller, apple, 5);

        System.out.println("\n=== 거래 후 ===");
        System.out.println(customer);
    }
}