import java.util.ArrayList;

public class InsInfoContainer {
    private ArrayList<InsuranceInfo> list;

    public InsInfoContainer() {
        this.list = new ArrayList<>();

    }

    public void addInfo(InsuranceInfo info) {
        this.list.add(info);
    }

    public void printevery() {
        for (InsuranceInfo info : this.list) {
            System.out.println("Type of the Property: " + info.getProperty().getType());
            System.out.println("Location of the Property: " + info.getProperty().getloc());
            System.out.println("Insurance Value: " + info.getvalue() + " Euro");
            System.out.println();
        }
    }

    public void printBigger(double lim) {
        for (InsuranceInfo info : this.list) {
            if (lim < info.getvalue()) {
                System.out.println("Type of the Property: " + info.getProperty().getType());
                System.out.println("Location of the Property: " + info.getProperty().getloc());
                System.out.println("Insurance Value: " + info.getvalue() + " Euro");
                System.out.println("Value insured greater than: " + lim + "Euro");
                System.out.println();
            }
        }
    }

    public void printSmaller(double lim) {
        for (InsuranceInfo info : this.list) {
            if (lim > info.getvalue()) {
                System.out.println("Type of the Property: " + info.getProperty().getType());
                System.out.println("Location of the Property: " + info.getProperty().getloc());
                System.out.println("Insurance Value: " + info.getvalue() + " Euro");
                System.out.println("Value insured less than: " + lim + " Euro");
                System.out.println();
            }
        }
    }

}