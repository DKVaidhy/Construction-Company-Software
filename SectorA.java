package DKConstructionPrivateLimited;

public class SectorA {

    public static double length = 50;
    public static double breadth = 20;
    private String name;
    private String gender;
    private String type = "A";

    public double getLength() {
        return length;
    }

    public double getBreadth() {
        return breadth;
    }

    public double getArea() {
        return length * breadth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getGender() {
        return gender;
    }

    public String gettype() {
        return type;
    }

    public SectorA(String name, String gender, String type) {
        this.gender = gender;
        this.type = type;
        this.name = name;
    }

}
