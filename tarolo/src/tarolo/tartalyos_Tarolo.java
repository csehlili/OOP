package tarolo;

public abstract class tartalyos_Tarolo {
	private int terfogat;

	public tartalyos_Tarolo(int terfogat) {
		super();
		this.terfogat = terfogat;
	}
	
	public abstract boolean veszelyesE();

	public int getTerfogat() {
		return terfogat;
	}
	
	
}

