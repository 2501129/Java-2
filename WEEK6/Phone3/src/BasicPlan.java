public class BasicPlan implements Plan {
    @Override
    public String getPlanName() {
        return "기본 요금제";
    }

    @Override
    public int calculateFee(Customer customer) {
        // 通话费：2秒10원，向上取整
        int callFee = (customer.getUsageTime() / UNIT + (customer.getUsageTime() % UNIT != 0 ? 1 : 0)) * FEE[0];
        // 短信费：20건까지 무료, 초과시 2원/건
        int msgFee = customer.getMessage() <= FREE_MESSAGE[0] ? 0 : (customer.getMessage() - FREE_MESSAGE[0]) * MESSAGE_FEE;
        return NETWORK + callFee + msgFee;
    }
}