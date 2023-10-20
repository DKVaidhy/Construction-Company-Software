package DKConstructionPrivateLimited;

public class Calculation {

    public static double getTotalPrice(double area, String type) {
        if (type.equalsIgnoreCase("A")) {
            return area * Rate.SectorAPlotRate;
        } else if (type.equalsIgnoreCase("B")) {
            return area * Rate.SectorBPlotRate;
        } else if (type.equalsIgnoreCase("C")) {
            return area * Rate.SectorCPlotRate;
        } else {
            return -1;
        }
    }
    
    public static double getRegistryprice(double Totalcost, String gender) {
        if (gender.equalsIgnoreCase("male")) {
            return (Totalcost * Rate.MaleRegistryRate)/100;
        } else if (gender.equalsIgnoreCase("female")) {
            return (Totalcost * Rate.FemaleRegistryRate)/100;
        } else {
            return -1;
        }
    }

    public static double getRegistryCGST(double CgstRate, double RegistryPrice) {
        return (RegistryPrice * Rate.CgstRate) / 100;
    }

    public static double getRegistrySGST(double SgstRate, double RegistryPrice) {
        return (RegistryPrice * Rate.SgstRate) / 100;
    }
     public static double getgreentax(double Totalcost) {
        return ((Totalcost * Rate.Greentax) / 100);
    }
     public static double getpmay(double Totalcost){
         if(Totalcost<3000000){
         return Totalcost-Rate.Subsidy;
         }
         return -1;
     }
}
