
public abstract class Plan {
    public static final int NETWORK = 10000;
    public static final int BASIC = 5000;
    protected String planName;

    public Plan(String planName) {
        this.planName = planName;
    }

    public String getPlanName() {
        return planName;
    }


    protected abstract int calculateFee(Customer customer);
    protected abstract int tax(Customer customer);
}