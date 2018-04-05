
public class Szemely {
	private String nev;
	private int suly;
	private double magassag;
	
	
	public Szemely(String nev, int suly, double magassag) {
		super();
		this.nev = nev;
		this.suly = suly;
		this.magassag = magassag;
	}

	public double testtomegindex() {
		return suly/(magassag*magassag);
	}
	
	public void alkat() {
		if (testtomegindex() < 18.5) {
			System.out.println("sovány");
		} else if (testtomegindex() > 25){
			System.out.println("kövér");
		} else 
			System.out.println("normál");
	}

	@Override
	public String toString() {
		return "Szemely [nev=" + nev + ", suly=" + suly + ", magassag=" + magassag + ", tti: " + testtomegindex() + "]";
	}

	public String getNev() {
		return nev;
	}

	public void setNev(String nev) {
		this.nev = nev;
	}

	public int getSuly() {
		return suly;
	}

	public void setSuly(int suly) {
		this.suly = suly;
	}

	public double getMagassag() {
		return magassag;
	}

	public void setMagassag(double magassag) {
		this.magassag = magassag;
	}
	
	
}
