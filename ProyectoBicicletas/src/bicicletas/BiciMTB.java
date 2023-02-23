package bicicletas;

public class BiciMTB {
	//atributos
	
	private String marca;
	private String modelo;
	private Suspensiones suspension;
	private byte numPlatos;
	private boolean esNueva;
	private float precio;
	private short velocidad;
	private boolean averiada;
	//constructores
	public BiciMTB() {
		//constructor con valores por defecto
		this.marca = "";
		this.modelo = "";
		this.suspension = Suspensiones.RIGIDA;
		this.numPlatos = 1;
		this.esNueva = true;
		this.precio = 0f;
		this.velocidad = 0;
		this.averiada = false;
	}
	
	public BiciMTB(String marca, String modelo) {
		//constructor con 2 parámetros y el resto por defecto
		this.marca = marca;
		this.modelo = modelo;		
		this.suspension = Suspensiones.RIGIDA;
		this.numPlatos = 1;
		this.esNueva = true;
		this.precio = 0f;
		this.velocidad = 0;
		this.averiada = false;
	}
	
	public BiciMTB(String marca, String modelo, Suspensiones suspension, byte numPlatos, boolean esNueva, float precio,
			short velocidad, boolean averiada) {
		//constructor con todos los parámetros
		this.marca = marca;
		this.modelo = modelo;
		this.suspension = suspension;
		this.numPlatos = numPlatos;
		this.esNueva = esNueva;
		this.precio = precio;
		this.velocidad = velocidad;
		this.averiada = averiada;
	}

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

	public Suspensiones getSuspension() {
		return suspension;
	}

	public void setSuspension(Suspensiones suspension) {
		this.suspension = suspension;
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

	public short getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(short velocidad) {
		this.velocidad = velocidad;
	}

	@Override
	public String toString() {
		return "BiciMTB [marca=" + marca + ", modelo=" + modelo + ", suspension=" + suspension + ", numPlatos="
				+ numPlatos + ", esNueva=" + esNueva + ", precio=" + precio + ", velocidad=" + velocidad + ", averiada="
				+ averiada + "]";
	}
	
	
}
