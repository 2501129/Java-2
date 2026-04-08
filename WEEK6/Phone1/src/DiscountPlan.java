
public class DiscountPlan extends Plan {
    public DiscountPlan() {
        super("할인 요금제");
    }

    @Override
    protected int calculateFee(Customer customer) {
        int callFee = (customer.getUsageTime() / 2 + (customer.getUsageTime() % 2 != 0 ? 1 : 0)) * 5;
        int msgFee;

        if (customer.getBirthDay().getAge() >= 80) {
            msgFee = 0;
        } else {
            msgFee = customer.getMessage() <= 40 ? 0 : (customer.getMessage() - 40) * 2;
        }

        return NETWORK + BASIC + callFee + msgFee;
    }

    @Override
    protected int tax(Customer customer) {
        if (customer.getBirthDay().getAge() > 19) {
            return (int) (calculateFee(customer) * 0.065);
        }
        return 0;
    }
}