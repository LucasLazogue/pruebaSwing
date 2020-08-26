package models;

import java.util.List;

public class Persona {
	private String name;
	private int age;
	private List<Auto> autos;
	
	public Persona() {}
	
	public Persona(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void addAuto(Auto auto) {
		this.autos.add(auto);
	}
	
	public List<Auto> getAutos() {
		return this.getAutos();
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getAge() {
		return this.age;
	}

}
