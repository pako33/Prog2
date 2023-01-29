public class Property {
    private String loc;
    private String type;

    public Property(String loc, String type) {
        this.loc = loc;
        this.type = type;
    }

    public void setloc(String loc) {
        this.loc = loc;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getloc() {
        return loc;
    }

    public String getType() {
        return type;
    }
}