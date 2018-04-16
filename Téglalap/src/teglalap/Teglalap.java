package teglalap;

public class Teglalap {
	private int a_oldal;
	private int b_oldal;
	
	public Teglalap(int a_oldal, int b_oldal) {
		super();
		this.a_oldal = a_oldal;
		this.b_oldal = b_oldal;
	}

	public Teglalap(int a_oldal) {
		super();
		this.a_oldal = a_oldal;
		this.b_oldal = a_oldal;
	}
	
	public int terulet() {
		return a_oldal*b_oldal;
	}
	
	public String toString() {
		return a_oldal + ", " + b_oldal + ": " + terulet();
		
	}

	public void setA_oldal(int a_oldal) {
		this.a_oldal = a_oldal;
	}

	public void setB_oldal(int b_oldal) {
		this.b_oldal = b_oldal;
	}
	
	public void setOldalak(int oldalak) {
		this.a_oldal = oldalak;
		this.b_oldal = oldalak;
	}
	
	public boolean nagyobbmeretumint(Teglalap masikteglalap) {
		return terulet() > masikteglalap.terulet();
	}
	
	public boolean egyezikE(Teglalap masikteglalap) {
		return a_oldal == masikteglalap.a_oldal && 
				b_oldal == masikteglalap.b_oldal;
	}
	
}
