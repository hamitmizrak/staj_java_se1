package atm;

import java.io.Serializable;

public class Kasa implements Serializable {
	private static final long serialVersionUID = 777853542642998183L;

	public static double miktar = 1000;

	public Kasa() {

	}

	public Kasa(double miktar) {
		Kasa.miktar = miktar;
	}

	public double getMiktar() {
		return miktar;
	}

	public void setMiktar(double miktar) {
		if (miktar <= 0) {
			System.out.println("öncelikle para eklemelisiniz.");
		} else {
			Kasa.miktar = miktar;
		}

	}

}
