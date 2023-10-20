package DKConstructionPrivateLimited;

public class DKConstructionPrivateLimitedCompany {

    public static void main(String[] args) {
        System.out.println("------Sector A------");
        SectorA sec = new SectorA("Daksh", "Male","A");
        Estimation.SectorAEstimation(sec);

        System.out.println("----Sector B-----");
        SectorB sect = new SectorB(54, "Nora", "Female", "B");
        Estimation.SectorBEstimation(sect);
    }
}
