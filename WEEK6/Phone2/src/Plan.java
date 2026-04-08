public class Plan {
    private String planName;
    protected final int NETWORK;
    protected final int BASIC;

    public Plan(String planName) {
        this.planName = planName;
        this.NETWORK = 3200;
        this.BASIC = 1000;
    }

    public String getPlanName() {
        return planName;
    }

    protected int calculateFee(Customer customer) {
        return 0;
    }

    protected int tax(Customer customer) {
        int tax = 0;
        if (customer.getAge() > 19) {
            tax = (int) (calculateFee(customer) * (6.5 / 100));
        }
        return tax;
    }
}