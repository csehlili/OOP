
public class alkalmazott {
	private String nev;
	private long fizetes;
	
	//getter nev
	public String getNev() {
		return nev;
	}
	
	//setter nev
	public void setNev(String nevparameter) {
		nev = nevparameter;
	}
	
	//getter fizetes
	public long getFizetes() {
		return fizetes;
	}
	//setter fizetes
	public void setFizetes(long fizetes) {
		this.fizetes = fizetes;
	}

	public void fizetestnovel(long ertek) {
		fizetes += ertek;
	}

	@Override
	public String toString() {
		return "alkalmazott neve: " + nev + ", fizetese:" + fizetes + " Ft";
	}
	
	public boolean fizetesintervallumokkozott(long alsohatar, long felsohatar) {
		return fizetes >= alsohatar && fizetes <= felsohatar;
	}
	public long fizetendoado() {
		return (long)(fizetes * 0.16);
	}
	public boolean nagyobbfizetesumint(alkalmazott masik ) {
		return fizetes > masik.fizetes;
	}
}
