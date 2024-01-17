package javapractice;

public class Constructors {
	
	int modelYear;
	String modelName;
	
	//Constrctor class is used set the values for attributes
	public Constructors(int year,String name){
		
		modelYear=year;
		modelName=name;
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Constructors con = new Constructors(2023,"Honda");
		System.out.println("Model year "+con.modelYear+"Model Name "+con.modelName);
		

	}

}
