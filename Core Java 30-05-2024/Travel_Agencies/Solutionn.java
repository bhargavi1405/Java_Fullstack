// Travel Agency
import java.util.*;
public class Solutionn {
	public static void main(String[] args) {		
		TravelAgencies travelAgencies[]=new TravelAgencies[4];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<4;i++)
		{
			int regNo = Integer.parseInt(sc.nextLine());
			String agencyName = sc.nextLine();
			String packageType = sc.nextLine();
			int price = Integer.parseInt(sc.nextLine());
			boolean flightFacility = Boolean.parseBoolean(sc.nextLine());
			travelAgencies[i]=new TravelAgencies(regNo,agencyName,packageType,price,flightFacility);		
		}
		int r=Integer.parseInt(sc.nextLine());
		String p=sc.nextLine();
		int HighestPrice=findAgencyWithHighestPackagePrice(travelAgencies);
		System.out.println(HighestPrice);
		TravelAgencies x= agencyDetailsForGivenldAndType(travelAgencies,r,p);
		System.out.println(x.getPackageType()+":"+x.getPrice());
		
	}
	public static int findAgencyWithHighestPackagePrice(TravelAgencies travelAgencies[])
	{
		int m=0;
		for(TravelAgencies p:travelAgencies )
		{
			if(p.getPrice()>m)
				m=p.getPrice();
		}
		return m;
	}
	
	public static TravelAgencies agencyDetailsForGivenldAndType(TravelAgencies travelAgencies[], int regNo, String packageType)
	{
		for (TravelAgencies t:travelAgencies )
		{
			if(t.getRegNo()==regNo && t.getPackageType().equals(packageType)&& t.isFlightFacility())
			{
				return t;
			}
		}
		return null;
	}
}
