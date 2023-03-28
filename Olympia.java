public class Olympia{

Records achievers;
static String Contest;
static String  helded ;
String venu;
String first_winner;
String type_of_bodybuilding;
short no_of_type;
boolean isfemale_olympia;
int mandatory_poses;
static{
  Contest="mr.olympia";
  helded="ZAID";
  }

public Olympia(String venu,String type_of_bodybuilding,Records achievers){
	this.venu=venu;
	this.type_of_bodybuilding=type_of_bodybuilding;
	this.achievers=achievers;
	
}
public static void main(String[] args){
	Olympia rolemodel=new Olympia( "USA","men's_physique",Records.RONNIECOLMAN);
	System.out.println(Olympia.Contest);
	System.out.println(Olympia.helded);
	System.out.println(rolemodel.venu);
	System.out.println(rolemodel.achievers.legends);	 
	
}

enum Records{
	 LEEHONEY("lee"),RONNIECOLMAN("Ronnie"),CHRISTOPHER_ADAM_BUMSTEAD("cbum");

    String legends;
   Records(String legends) {
	  this.legends=legends;
}
 }
 }