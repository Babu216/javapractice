package javapractice;

public class Methods {
	
	public static void fruit() {
		
		System.out.println("I'm the static method and not required an object");
		
	}
	
	public void car() {
		
		System.out.println("I'm the public method and required object to access");	
	}
	
	public void speed(int maxSpeed) {
		
		System.out.println("Max speed is "+maxSpeed);	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		fruit();
		Methods method = new Methods();
		method.car();
		method.speed(100);

	}

}
