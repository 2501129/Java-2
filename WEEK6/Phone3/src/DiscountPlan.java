public class DiscountPlan implements Plan {
    @Override
    public String getPlanName() {
        return "할인 요금제";
    }

    @Override
    public int calculateFee(Customer customer) {
        // 通话费：2초 5원,向上取整
        int callFee = (customer.getUsageTime() / UNIT + (customer.getUsageTime() % UNIT != 0 ? 1 : 0)) * FEE[1];
        int msgFee;
        // 80세 이상 무제한 무료
        if (isOld(customer)) {
            msgFee = 0;
        } else {
            // 40건까지 무료, 초과시 2원/건
            msgFee = customer.getMessage() <= FREE_MESSAGE[1] ? 0 : (customer.getMessage() - FREE_MESSAGE[1]) * MESSAGE_FEE;
        }
        return NETWORK + BASIC_FEE + callFee + msgFee;
    }
}