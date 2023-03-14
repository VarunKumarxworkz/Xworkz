public class ReturnTypeTest{

  public static void main(String[] args){
	  
	  byte ChairsInHall = ExampleByte();
      System.out.println(ChairsInHall);
      
      short GymFess = ExampleShort();
      System.out.println(GymFess);
       
      int MobilePhonesinShops = ExampleInt();
      System.out.println(MobilePhonesinShops);	  
	  
	  long GoodsInShip = ExampleLong();
	  System.out.println(GoodsInShip);
	  
	  float Weight = ExampleFloat();
	  System.out.println(Weight);
	  
	  double BMI = ExampleDouble();
	  System.out.println(BMI);
	  
	  char Division = ExampleChar();
	  System.out.println(Division);
	  
	  boolean IsHeDoctor = ExampleBoolean();
	  System.out.println(IsHeDoctor);
	  
	  String Inspiration = ExampleString();
	  System.out.println(Inspiration);
	  
	  }
	  public static byte ExampleByte(){
		  byte ChairsInHall = 90;
		  return 90;
	  }
       public static short ExampleShort(){
		   short GymFees = 12000;
		   return 12000;
	  }
       public static int ExampleInt(){
		   int MobilePhonesinShops = 100000;
		   return 100000;
	  } 
       public static long ExampleLong(){
		   long GoodsInShip = 23444990;
		   return 23444990;
	   } 
       public static float ExampleFloat(){
		   float Weight = 70.7f;
		   return Weight;
	   }
	   public static double ExampleDouble(){
		   double BMI = 25.786;
		   return BMI;
	   }
	   public static char ExampleChar(){
		   char Division = 'c';
		   return Division;
	   }
	   public static boolean ExampleBoolean(){
		   boolean IsHeDoctor = true;
		   return true;
	   }
	   public static String ExampleString(){
		   String Inspiration = "Ronnie Coleman";
		   return Inspiration;
	   }
}