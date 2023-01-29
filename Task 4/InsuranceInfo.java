public class InsuranceInfo {
    private Property property;
    private double value;

    public InsuranceInfo(Property property, double value) {
        this.property = property;
        this.value = value;
    }

    public void setProperty(Property property) {
        this.property = property;
    }

    public void setvalue(double value) {
        this.value = value;
    }

    public Property getProperty() {
        return property;
    }

    public double getvalue() {
        return value;
    }
}