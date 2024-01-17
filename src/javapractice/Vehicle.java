package javapractice;

public class Vehicle {
	
	protected String brand = "Ford";
	
	public void honk() {
		System.out.println("tutuututuuttu");
	}
}
	class Car extends Vehicle{
		
		protected String model = "mustang";
		
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car mycar = new Car();
		
		System.out.println(mycar.brand+mycar.model);
		mycar.honk();

	}

}
