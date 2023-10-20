package DKConstructionPrivateLimited;
public class Estimation {
    public  static void SectorAEstimation(SectorA sectora){
        System.out.println("Length of Sector A :- " +sectora.getLength());
        System.out.println("Breadth of Sector A :- " +sectora.getBreadth());
        System.out.println("Area of Sector A :- " +sectora.getArea());
        System.out.println("Name of Sector A :- " +sectora.getName());
        System.out.println("Gender of Sector A :- " +sectora.getGender());
        
        double Totalcost = Calculation.getTotalPrice(sectora.getArea(),sectora.gettype());
        double RegistryPrice = Calculation.getRegistryprice(Totalcost,sectora.getGender());
        double RegistryPriceCGST = Calculation.getRegistryCGST(Rate.CgstRate, RegistryPrice);
        double RegistryPricSGST = Calculation.getRegistrySGST(Rate.SgstRate, RegistryPrice);
        double GreentaxPrice = Calculation.getgreentax(Totalcost);
        double Pmay = Calculation.getpmay(Totalcost);
        double TotalSectorAPrice = Totalcost+RegistryPrice+RegistryPriceCGST+RegistryPricSGST + Rate.SectorASDMtax +Rate.SectorAClub+Pmay;
        
        System.out.println("Total cost of Flat:  " +  Totalcost);
        System.out.println("PMay" + Pmay);
        System.out.println("Total sector A price:  " +  TotalSectorAPrice);
        
    }
    public  static void SectorBEstimation(SectorB sectorb){
        System.out.println("Length of Sector A :- " +sectorb.getLength());
        System.out.println("Breadth of Sector A :- " +sectorb.getbreadth());
        System.out.println("Area of Sector A :- " +sectorb.getArea());
        System.out.println("Name of Sector A :- " +sectorb.getname());
        System.out.println("Gender of Sector A :- " +sectorb.getgender());
        
        double Totalcost = Calculation.getTotalPrice(sectorb.getArea(),sectorb.gettype());
        double RegistryPrice = Calculation.getRegistryprice(Totalcost,sectorb.getgender());
        double RegistryPriceCGST = Calculation.getRegistryCGST(Rate.CgstRate, RegistryPrice);
        double RegistryPricSGST = Calculation.getRegistrySGST(Rate.SgstRate, RegistryPrice);
        double GreentaxPrice = Calculation.getgreentax(Totalcost);
        double TotalSectorAPrice = Totalcost+RegistryPrice+RegistryPriceCGST+RegistryPricSGST + Rate.SectorBSDMtax +Rate.SectorBClub;
        
        System.out.println("Total sector A price:  " +  TotalSectorAPrice);
        
    }
}
