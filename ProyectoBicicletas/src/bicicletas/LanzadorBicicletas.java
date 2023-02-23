package bicicletas;

public class LanzadorBicicletas {

	public static void main(String[] args) {

		BiciMTB miBici = new BiciMTB("TREK","X CALIBER 9", Suspensiones.DELANTERA,(byte) 1,true,1350.50f,(short) 0,false);
		System.out.println(miBici.toString());
		//PRUEBA
	}

}
