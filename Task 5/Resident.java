public class Resident {
    private String name;

    public Resident() {
        this.name = null;
    }

    public Resident(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void printInfo() {
        System.out.println(this.name);
    }
}