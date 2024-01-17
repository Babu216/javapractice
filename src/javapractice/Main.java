package javapractice;


//if you declare int as final, you can't reassign the value

public class Main {
	//final int x=5;
	int x=5;
	int y=10;
	String fname = "Hari";
	String lname = "babu";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Main obj = new Main();
		Main obj1 = new Main();
		obj.x=20;
		obj1.y=50;
		
		System.out.println(obj.x);
		System.out.println(obj1.y);
		System.out.println(obj.fname+" "+obj.lname);

	}

}
