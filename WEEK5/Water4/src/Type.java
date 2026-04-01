import java.io.IOException;

public class Type {
    
    private String typeName;
    private int unitPrice;
    private float taxRate;

   
    public Type(String typeName, int unitPrice, float taxRate) {
        this.typeName = typeName;
        this.unitPrice = unitPrice;
        this.taxRate = taxRate;
    }

   
    public String getTypeName() {
        return typeName;
    }

    public int getUnitPrice() {
        return unitPrice;
    }

    public float getTaxRate() {
        return taxRate;
    }
}
