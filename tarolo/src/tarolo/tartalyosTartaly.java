package tarolo;

public class tartalyosTartaly extends tartalyos_Tarolo {
	private double nyomas;
	
	public tartalyosTartaly(int terfogat, double nyomas) {
		super(terfogat);
		this.nyomas = nyomas;
	}

	@Override
	public boolean veszelyesE() {
		if (getTerfogat()*nyomas > 100) {
			return true;
		}else {
			return false;
		}
	}

	@Override
	public String toString() {
		return "tartalyosTartaly [nyomas=" + nyomas + ", veszelyesE()=" + veszelyesE() + ", getTerfogat()="
				+ getTerfogat() + ", toString()=" + super.toString() + "]";
	}
	
	public boolean nagyobbNyomasu(tartalyosTartaly tartaly2) {
		if (tartaly2.nyomas > nyomas) {
			return false;
		} else {
			return true;
		}
	}
	public static tartalyosTartaly nagyobbTerfogatu(tartalyosTartaly egyiktartaly, tartalyosTartaly masiktartaly) {
		if (egyiktartaly.getTerfogat() > masiktartaly.getTerfogat()) {
			return egyiktartaly;
		} else {
			return masiktartaly;
		}
	}
}
