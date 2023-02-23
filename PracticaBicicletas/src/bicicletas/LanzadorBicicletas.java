package bicicletas;

public class LanzadorBicicletas {

	public static void main(String[] args) {
		
		BiciMTB miBici = new BiciMTB("TREK","X CALIBER 9",Suspensiones.DELANTERA,(byte) 1,true,1350.99f );
		System.out.println(miBici.toString());
		miBici.acelerar();
		miBici.estropear();
		miBici.acelerar();
		miBici.reparar();
		miBici.acelerar();
		miBici.acelerar();
		//System.out.println(miBici.toString());

	}

}
