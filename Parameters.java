public class Parameters{
   
   public static void main(String[] args){
	   
	   int x=BikePrice(300000);
	   System.out.println(x);
	   
	   String Actor = Bollywood("Hrithik Roshan","Ranveer");
       System.out.println(Actor);
	   
	   int PriceOfCar = BMW(6000000,8.9f);
	   System.out.println(PriceOfCar);
	   
	   int GymEquipmentCost = Loan(12000,20000000,1000000,true);
	   System.out.println(GymEquipmentCost);
	   
   }
   public static int BikePrice(int bike){
	   return bike;
   }
   public static String Bollywood(String Body,String Look){
       System.out.println(Body);
	   System.out.println(Look);
	   
	   return Body;
   }
public static int BMW(int Worth,float Rating){
	System.out.println(Worth);
	System.out.println(Rating);
	
	return 20;
   }
    public static int Loan(int Fees,int ValueOfGym,int Loan,boolean IsHeBodyBuilder){
		System.out.println(Fees);
		System.out.println(ValueOfGym);
		System.out.println(Loan);
		System.out.println(IsHeBodyBuilder);
		
		return 12000;
	}
}