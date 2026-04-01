public class Type {
    private String typeName;
    private int unitPrice;
    private float taxRate;

    public Type(String typeName, int unitPrice, float taxRate) {
        this.typeName = typeName;
        this.unitPrice = unitPrice;
        this.taxRate = taxRate;
    }

    public int getUnitPrice() {
        return unitPrice;
    }

    public String getTypeName() {
        return typeName;
    }

    public float getTaxRate() {
        return taxRate;
    }
}