
public class BasicPlan extends Plan {
    public BasicPlan() {
        super("기본 요금제");
    }

    @Override
    protected int calculateFee(Customer customer) {
        int callFee = (customer.getUsageTime() / 2 + (customer.getUsageTime() % 2 != 0 ? 1 : 0)) * 10;
        int msgFee = customer.getMessage() <= 20 ? 0 : (customer.getMessage() - 20) * 2;
        return NETWORK + callFee + msgFee;
    }

    @Override
    protected int tax(Customer customer) {
        if (customer.getBirthDay().getAge() > 19) {
            return (int) (calculateFee(customer) * 0.065);
        }
        return 0;
    }
}