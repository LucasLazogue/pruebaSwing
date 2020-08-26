package models;

public class Auto {
	
	private String marca;
	private String modelo;
	private int year;
	private boolean status;
	
	public Auto() {}
	
	public Auto(String marca, String modelo, int year) {
		this.marca = marca;
		this.modelo = modelo;
		this.year = year;
		this.status = false;
	}
	
	public void comprarAuto() {
		this.status = true;
	}
	
	public String getMarca() {
		return this.marca;
	}
	
	public String getModelo() {
		return this.modelo;
	}
	
	public int getYear() {
		return this.year;
	}
	
	public boolean getStatus() {
		return this.status;
	}
}
