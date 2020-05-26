
import java.util.ArrayList;

public class room {
	

	ArrayList<student> members = new ArrayList<>();
	
	private String roomnumber;
	private String roomcapacity;
	private String rent;
	private String stairNumber;
	private String name,number;
public  room( String RN ,String RC,String Rr,String floor){
	
  this.roomnumber= RN;
   this.roomcapacity = RC;
   this.rent = Rr;
   this.stairNumber = floor;
  
}
public void setroomnumber(String RN) {
	 this.roomnumber = RN;
}
public String getroomnumber() {
	return this.roomnumber;
}
public void addTomembers(student he) {
	
	
	int i=Integer.parseInt(roomcapacity); 
	
		this.members.add(he);


	
}
public void delMember(String name) {
	for(int i=0; i<members.size(); i++) {
		if(members.get(i).getName().equals(name))
			members.remove(i);
	}
	
}
public void Show() {
	for(int i=0; i<members.size(); i++) {
		System.out.println(members.get(i));
		
	}
}


}
