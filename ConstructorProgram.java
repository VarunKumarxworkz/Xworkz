public class ConstructorProgram{
 
    public ConstructorProgram(){
		
		System.out.println("Constructor Method Is Created");
	}
    public ConstructorProgram(int creatine){
		System.out.println(creatine);
		
	}
    public ConstructorProgram(String creatine,String Protien){
		System.out.println(Protien);
	}
    public ConstructorProgram(String GymName){
		System.out.println(GymName);
	}
    public ConstructorProgram(int MonthlyFees,int YearlyFees){
		System.out.println(MonthlyFees);
		System.out.println(YearlyFees);
	}

    public static void main (String[] args){
		 
		 ConstructorProgram cons = new ConstructorProgram(1200);
		 ConstructorProgram creatine = new ConstructorProgram();
		 ConstructorProgram Protien = new ConstructorProgram("WheyProtien");
		 ConstructorProgram GymName = new ConstructorProgram("MuscleBeast");
		 ConstructorProgram MonthlyFees = new ConstructorProgram(1500);
	}



























}