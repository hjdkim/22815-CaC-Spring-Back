package ar.com.codoacodo;

public class Auto {
	
	boolean encendido;
	float velocidad;
	String marca;
	String modelo;
	int anio;
	
	public Auto() {
		encendido = false;
	}

	public Auto(boolean encendido, float velocidad, String marca, String modelo, int anio) {
		this.encendido = encendido;
		this.velocidad = velocidad;
		this.marca = marca;
		this.modelo = modelo;
		this.anio = anio;
	}
	
	public void encender() {
		encendido = true;
	}
	
	public void apagar() {
		encendido = false;
	}
	
	public void acelerar() {
		
	}
	
	public void frenar() {
		
	}
	
	public void mostrarInfo() {
		System.out.println("encendido: " + encendido);
	}
	
}
