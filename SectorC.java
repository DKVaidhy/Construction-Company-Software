package DKConstructionPrivateLimited;

public class SectorC {

    private double length;
    private double breadth;
    private String name;
    private String gender;
    private String type = "C";

    public double getlength() {
        return length;
    }

    public void setlength(double length) {
        if (length > 100) {
            this.length = length;
        }
    }

    public double getBreadth() {
        return length;
    }

    public void setBreadth(double breadth) {
        if (breadth > 100) {
            this.breadth = breadth;
        }
    }

    public SectorC(double length, double breadth, String name, String gender, String type) {
        if (length > 100 && breadth > 100) {
            this.breadth = breadth;
            this.length = length;
        }
        this.name = name;
        this.type = type;
        this.gender = gender;
    }
}
