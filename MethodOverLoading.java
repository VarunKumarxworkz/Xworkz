public class  MethodOverLoading{

     public static void main(String[] args){
	   overload();
	   overload(50);
	   overload(30,40);
	   overload(13,45,78);
	   overload(55,89,43,65);
	   overload(10,15,30,35,87);
	   
	   overload(4.4f);
       overload(false);
       overload(5.76d);
	   overload(300000000l);
	   overload(12000);
	   
	   overload(34.4d,45,67,56,34.5d);
	   overload(56,36.2d,45,76,67);
	   overload(45,78,98,38.3d,76);
	   overload(67,87,98,65,40.5d);
	   overload(23,34,45,42.4d,56);
	   
	 
	 }
      public static void overload(){
	    
		System.out.println("No Parameters");
	  }
	  public static void overload(int icecream ){
	  
	  System.out.println(icecream);
	  }
	  public static void overload(int eggs,int breads){
	  
	  System.out.println(eggs);
	  System.out.println(breads);
     }
      
	  public static void overload(int biscuits,int chocolates,int chips){
      
	  System.out.println(biscuits);
	  System.out.println(chocolates);
	  System.out.println(chips);
	  }
	  public static void overload(int chickens,int mutton,int beef,int pork){
		System.out.println(chickens);
        System.out.println(mutton);
        System.out.println(beef);
        System.out.println(pork);		
	  }
	  public static void overload(int dumbbel,int barbell,int isolation,int compound,int pectrol){
		  System.out.println(dumbbel);
	  }
	  
	  
	  
	  //#Different Data Types#//
	  
	  public static void overload(float temp){
	   System.out.println(temp);
	  }
      public static void overload(boolean isHeGangster){
	     System.out.println(isHeGangster);
	  }
	   public static void overload(double BMI){
	    System.out.println(BMI);
	   }
       //# order of parameters#//
	   
	   public static void overload(double Bmi,int sweet,int salty,int food,double weight){
	     System.out.println(Bmi);
         System.out.println(sweet);
		 System.out.println(salty);
		 System.out.println(food);
		 System.out.println(weight);
		  
	   }
	   public static void overload(int bikes,double Degree,int cars,int jets,int flights){
	      System.out.println(bikes);
		  System.out.println(Degree);
		  System.out.println(cars);
		  System.out.println(jets);
		  System.out.println(flights);
       }
       public static void overload(int oranges,int apple, int bannana,double celcious,int pineapple){
	     System.out.println(oranges);
		 System.out.println(apple);
		 System.out.println(bannana);
		 System.out.println(celcious);
		 System.out.println(pineapple);
	   }












}