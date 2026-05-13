abstract public class Customer extends Person implements Constant{
    private String customID;
    private int powerUsage;

    protected int getPowerUsage(){
        return powerUsage;
    }

    public void setCustomID(String customID){
        this.customID = customID;
    }

    public void setPowerUsage(int powerUsage) {
        this.powerUsage = powerUsage;
    }

    private int fee(){
        int temp = powerUsage;
        float fee = basic;
        for(int i = 0;i < table.length;i++){
            int usage = Math.min(temp,limits[i]);
            fee += usage * table[i];
            temp -= usage;
            if (temp <= 0)
                break;
        }
        return (int) fee;
    }
    private int tax(){
        return (int) (fee() * rate);
    }

    protected int pay(){
        return fee() + tax();
    }

    @Override
    public String toString() {
        return String.format(" %5s %s %,5d Kw %,9d원 %,8d원 %,10d원",
                customID, super.toString(), powerUsage, fee(), tax(), pay());

    }
}