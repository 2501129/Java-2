import java.io.IOException;

public class Type {
    // 通用属性：类型名、单价、税率
    private String typeName;
    private int unitPrice;
    private float taxRate;

    // 父类构造器，子类通过super调用
    public Type(String typeName, int unitPrice, float taxRate) {
        this.typeName = typeName;
        this.unitPrice = unitPrice;
        this.taxRate = taxRate;
    }

    // Getter方法，供Customer类调用
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