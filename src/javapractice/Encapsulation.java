package javapractice;

public class Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person per = new Person();
		//this will throw error because it's private variable and trying to access from different clss
		//name can be access through getters and setters
		//per.name = "john";
		//System.out.println(per.name);
		
		per.setName("John");
		System.out.println(per.getName());

	}

}
