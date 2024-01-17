package javapractice;

abstract class Animals {
	
	public abstract void animalSound();
	
	public void Sleep() {
		
		System.out.println("I'm sleeping");
	}
	
	class Cat extends Animals {
		
		public void animalSound() {
			System.out.println("Cat makes different sound");
		}
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Cat mycat = new Cat();
//		mycat.animalSound();
//		mycat.Sleep();
		
		  

	}

}
