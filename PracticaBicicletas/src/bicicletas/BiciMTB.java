package bicicletas;

public class BiciMTB {
	//Atributos
	private String marca; 
	private String modelo; 
	private Suspensiones suspension;
	private byte numPlatos;
	private boolean esNueva;
	private float precio;
	private boolean averiada;
	private short velocidad;
	//Constructores
	public BiciMTB() {
		super();
		this.marca = "";
		this.modelo = "";
		this.suspension = Suspensiones.DELANTERA;
		this.numPlatos = 0;
		this.esNueva = true;
		this.precio = 0;
		this.velocidad=0;
		this.averiada=false;
	}
	public BiciMTB(String marca, String modelo, Suspensiones suspension, byte numPlatos, boolean esNueva,
			float precio) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.suspension = suspension;
		this.numPlatos = numPlatos;
		this.esNueva = esNueva;
		this.precio = precio;
		this.velocidad=0;
		this.averiada=false;
	}
	//Set y Get
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public Suspensiones getNumSuspensiones() {
		return suspension;
	}
	public void setNumSuspensiones(Suspensiones numSuspensiones) {
		this.suspension = numSuspensiones;
	}
	public byte getNumPlatos() {
		return numPlatos;
	}
	public void setNumPlatos(byte numPlatos) {
		this.numPlatos = numPlatos;
	}
	public boolean isEsNueva() {
		return esNueva;
	}
	public void setEsNueva(boolean esNueva) {
		this.esNueva = esNueva;
	}
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	
	@Override
	public String toString() {
		return "BiciMTB [marca=" + marca + ", modelo=" + modelo + ", suspension=" + suspension
				+ ", numPlatos=" + numPlatos + ", esNueva=" + esNueva + ", precio=" + precio + ", velocidad=" + velocidad + ", averiada="+ averiada +"]";
	}
	
	//m�todos propios
	
	public void estropear() {
		System.out.println("** ZONA ACCIDENTADA CUIDADO CUIDADO **");
		System.out.println("^+^+^+^+^+^+^+^+^+^+^+^+^+^+^+^+^+^+^+");
		System.out.println("^+^+^+^+^+^+^+^+^+^+^+^+^+^+^+^+^+^+^+");
		System.out.println("^+^+^+^+^+^+^+^+^+^+^+^+^+^+^+^+^+^+^+");
		System.out.println("^+^+^+^+^+^+^+^+^+^+^+^+^+^+^+^+^+^+^+");
		System.out.println("^+^+^+^+^+^+^+^+^+^+^+^+^+^+^+^+^+^+^+");
		System.out.println("^+^+^+^+^+^+^+^+^+^+^+^+^+^+^+^+^+^+^+");
		System.out.println("^+^+^+^+^+^+^+^+^+^+^+^+^+^+^+^+^+^+^+");
		System.out.println("^+BICICLETA AVERIADA,BICILETA AVERIADA^+");
				
		this.averiada=true;
		//PRUEBA   
	}
	
	public void reparar() {
		if(this.averiada) {
			System.out.println("----------ENTRANDO EN TALLER---------");
			System.out.println("-----------Reparando Bici-----------");
			System.out.println("-----------Reparando Bici-----------");
			System.out.println("-----------Reparando Bici-----------");
			System.out.println("-----------Reparando Bici-----------");
			System.out.println("-----------Reparando Bici-----------");
			System.out.println("-----------Reparando Bici-----------");
			System.out.println("-----------Reparando Bici-----------");
			System.out.println("-----------Reparando Bici-----------");
			System.out.println("-----------Reparando Bici-----------");
			System.out.println("-----------Reparando Bici-----------");
			System.out.println("---------  BICI ARREGLADA ;-) --------");
			
			this.averiada=false;
		}
		else {
			System.out.println("-----------La bicicleta no estaba averiada-----------");
		}
	}
	
	public void acelerar() {
		if (this.averiada) {
			System.out.println("No se puede acelerar, la bicicleta est� averiada");
		}
		else {
			this.velocidad+=10;
			System.out.println("Acelerando, acelerando, la velocidad actual es: "+this.velocidad);
			
		}
	}
	
}
