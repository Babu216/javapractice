package javabasics;

public class variables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Variables are used to store values
		
		int myNum = 20;
		System.out.println(myNum);
		
		//assign a new value to an existing variable, will overwrite the existing value
		myNum = 30;
		System.out.println(myNum);
		
		//use final keyword if you don't want to overwrite the values
		final int newNum = 50;
		System.out.println(newNum);
		
//		newNum = 60;
//		System.out.println(newNum);
		
		String myName = "Automation testing";
		System.out.println(myName);
		
		//Float values
		float myValue = 2.89f;
		System.out.println(myValue);
		
		//Boolean
		
		boolean status = true;
		System.out.println(status);
		
		//char
		
		char myChar = 'A';
		System.out.println(myChar);
		
		System.out.println("Git/github integration");
		System.out.println("Git/SeleniumWebdriver integration");
		System.out.println("Committing from local branch to master");
	}

}
