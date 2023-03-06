public class StrMeth{

      public static void main(String[]args) {
		  
		  String Bicep="Dummble Curl";
		  String Tricep="Skull Crush";
		  String Lats="Pull up";
		  String Chest="Cable Fly";
		  String Legs="Lunges";
		  String Shoulders="Millitary Press";
		  String Arms="Dummble Curl";
		  
		  System.out.println(Bicep.equals(Arms));
		  System.out.println(Shoulders.contains("Press"));
		  System.out.println(Arms.endsWith("rl"));
		  System.out.println(Lats.isEmpty());
		  int index=Chest.indexOf("Fly");
		  System.out.println(index);
		  
		  
	  }
	  



}