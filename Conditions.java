public class Conditions{
	
	static int[] CarPrices = {200000,300000,400000,500000,600000,200000,300000};
	static String[] Physique = {"Ronnie","Cbum","RajaAjith","HrithikRoshan","Varun","Ronnie","Cbum"};
	
	public static void main(String[] args){
		Olympia();
		for(int j=0;j<Physique.length;j++){
			System.out.println(Physique[j]);
		}
		
	}
	public static void Olympia(){
		
		if (Physique[2]==Physique[3]){
			
			System.out.println("He is An Physiquer");
		}
		else {
			System.out.println("He is Not An Physiquer");
		}
		if (Physique[1]==Physique[6]){
			
			System.out.println("He is An Physiquer");
		}
		else {
			System.out.println("He is Not An Physiquer");
		}
		if (CarPrices[1]==CarPrices[2]){
			System.out.println("He is An Physiquer");
		}
		else{
			System.out.println("He is Not An Physiquer");
		}
		if (CarPrices[0]==CarPrices[5]){
			System.out.println("He is An Physiquer");
		}
		else{
			System.out.println("He is Not An Physiquer");
		}
		if (Physique[1]!=Physique[6]){
			System.out.println("He is An Physiquer");
		}
		else{
			System.out.println("He is Not An Physiquer");
		}
		if (CarPrices[1]!=CarPrices[6]){
			System.out.println("He is An Physiquer");
		}
		else{
			System.out.println("He is Not An Physiquer");
		}
		
	}
}