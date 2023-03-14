public class ChainingConstructorTest{

     public ChainingConstructor(){
		 
		 System.out.println("VARUN");
		 
	}
     public ChainingConstructor(int shoes){
		 this(89.9d);
		 System.out.println(shoes);
		
	 }
     public ChainingConstructor(int Dumbell,int Barbell){
		 this(3000);
		 System.out.println(Dumbell);
		 System.out.println(Barbell);
	 }
     public  ChainingConstructor(float Physique,String Marvel,boolean isHeWinner){
		 this(5000,6000);
		 System.out.println(Physique);
		 System.out.println( Marvel);
		 System.out.println(isHeWinner);
		 
	 }
     public ChainingConstructor(int AmminoAcids,int Caffine,int BCAA,int CitrulineMalate){
		 this(86.8f,"Thor",true);
		 System.out.println(Caffine);
		 System.out.println(AmminoAcids);
		 System.out.println(BCAA);
		 System.out.println(CitrulineMalate);
	 }
     public ChainingConstructor(double Steriods){
		 System.out.println(Steriods);
	 }
     
	 public static void main(String[] args){
		 
		ChainingConstructor AmminoAcids = new ChainingConstructor(5000,50,1600,1000);  		
        		
		 
		 
		 
	 }









}
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 

}
