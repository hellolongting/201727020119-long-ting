package cn.edu.scau.cmi.longting.simpleFactoryMethod.domain;

public class Chicken extends Meat{

	private String name;
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	@Override
	public String cook() {
//		System.out.println("chicken is marvelous!!!");
		return "chicken is marvelous!!!";
	}
	
}
