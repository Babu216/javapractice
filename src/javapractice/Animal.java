package javapractice;

public class Animal {
	
	public void animalSound() {
		System.out.println("Animal makes sound!!!");
	}
}

class Pig extends Animal {
	
	public void animalSound() {
		System.out.println("pig makes different sound!!!");
	}
	
}

class Dog extends Animal {
	
	public void animalSound() {
		System.out.println("Dog makes different sound!!!");
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal myanimal = new Animal();
		Animal mypig = new Pig();
		Animal mydog = new Dog();
		
		myanimal.animalSound();
		mypig.animalSound();
		mydog.animalSound();

	
	}
}
