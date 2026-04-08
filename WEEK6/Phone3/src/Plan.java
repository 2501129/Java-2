public interface Plan {
    // 常量定义
    int NETWORK = 3200;
    int BASIC_FEE = 1000;
    int UNIT = 2;
    int[] FEE = {10, 5};
    int[] FREE_MESSAGE = {20, 40};
    int MESSAGE_FEE = 2;

    // 抽象方法
    String getPlanName();
    int calculateFee(Customer customer);

    // 默认方法
    default boolean isYoung(Customer customer) {
        return customer.getAge() > 19;
    }

    default boolean isOld(Customer customer) {
        return customer.getAge() >= 80;
    }

    default int tax(Customer customer) {
        int tax = 0;
        if (isYoung(customer)) {
            tax = (int)(calculateFee(customer) * 6.5 / 100);
        }
        return tax;
    }
}