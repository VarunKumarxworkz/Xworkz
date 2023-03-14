public class MehtodOverloadingTest{
   
public static void main(String[] args){   
	overload(6000,20000);
	overload(500,800,1000);
	
	
	overload(12.2f,30000,15000);
	overload(true,5000,5998);
	
	overload(45.56d,67,87,98.7d);
	overload(55,56,76,67.98d);

}
public static void overload(int Calories,int Protien){
	System.out.println(Calories);
	System.out.println(Protien);
}	
public static void overload(int Creatine,int Omega3,int Multivitamin){
	System.out.println(Creatine);
	System.out.println(Omega3);
	System.out.println(Multivitamin);
}	
	//DataTypes//
public static void overload(float temp,int Advance,int Rent){
	System.out.println(temp);
	System.out.println(Advance);
	System.out.println(Rent);
	
}
public static void overload(boolean isHeTrainer,int MonthlyFees,int TrainerFees){
	System.out.println(isHeTrainer);
	System.out.println(MonthlyFees);
	System.out.println(TrainerFees);
}
public static void overload(double Degree,int Dumbells,int Barbells,double Celcious){
	System.out.println(Degree);
	System.out.println(Dumbells);
	System.out.println(Barbells);
	System.out.println(Celcious);
}
public static void overload(int Cars,int Bikes,int Trucks,double Ratio){
	System.out.println(Cars);
	System.out.println(Bikes);
	System.out.println(Trucks);
	System.out.println(Ratio);
}



}