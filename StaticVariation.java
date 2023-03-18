 public class StaticVariation {
    
      public static void main(String[] args){
		  
		  Variation Pro = new Variation();
		  
		  Pro.Protien = 2000;
		  Pro.isHePhysiquer = true;
		  Pro.BMI = 24.67f;
		  Pro.Section = 'B';
		  Pro.Inspiration = "RonnieColeman";
		  
		  System.out.println(Variation.Creatine);
		  System.out.println(Variation.isHeAthlete);
		  System.out.println(Variation.Weight);
          System.out.println(Variation.Division);
		  System.out.println(Variation.Hero );
		  
		  System.out.println(Pro.Protien);
		  System.out.println(Pro.isHePhysiquer);
		  System.out.println(Pro.BMI);
		  System.out.println(Pro.Section);
		  System.out.println(Pro.Inspiration);
	  }
 
      public static class Variation{
		  
		  public Variation(){
			  System.out.println("Variation Created");
		  }
		  
		  static int Creatine = 1200;
		  static boolean isHeAthlete = true;
		  static float Weight = 70.897f;
		  static char Division = 'A';
		  static String Hero = "HrithikRoshan";
		  
		   int Protien; 
		   boolean isHePhysiquer;
		   float BMI;
		   char Section;
		   String Inspiration;
		  
		  
	  }
 }