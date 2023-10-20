package DKConstructionPrivateLimited;

public class SectorB {

    private double length;
    private double breadth = 50;
    private String type = "B";
    private String name;
    private String gender;

    public double getLength() {
        return length;
    }

    public void SetLength(double length) {
        if (length > 50 && length < 100) {
            this.length = length;
        }
    }

    public String getname() {
        return name;
    }

    public double getbreadth() {
        return breadth;
    }

    public void setname(String name) {
        this.name = name;
    }

    public String getgender() {
        return gender;
    }

    public void setgender(String gender) {
        this.gender = gender;
    }

    public String gettype() {
        return type;
    }

    public double getArea() {
        return length * breadth;
    }

    public SectorB(double length, String name, String gender, String type) {
        if (length > 50 && length < 100) {
            this.length = length;
        }
        this.gender = gender;
        this.type = type;
        this.name = name;
    }
}
