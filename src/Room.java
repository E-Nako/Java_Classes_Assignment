
public class Room {
	int roomno;
	String roomtype;
	float roomarea;
	boolean ACmachine;

	void setData(int r_no, String r_type, float area, boolean ac) {
		 roomno = r_no;
		 roomtype = r_type;
		 roomarea = area;
		 ACmachine = ac;
		 
	}
		 
	void displayData() {
		System.out.println("The room number is: "+ roomno);
		 System.out.println ("The room type is: "+ roomtype);
		 System.out.println ("The room area is: " + roomarea);
		 String s = (ACmachine) ? "Yes" : "No";
		 System.out.println ("A/C installed: " + s);
	}
	
	 public static void main(String arg[]) {
		 Room room1 = new Room();
		 room1.setData (50, "Single", 74.0f, false);
		 room1.displayData(); 
	 }
}
		 
