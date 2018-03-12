
public class Teglalap {

	private int a_oldal;
	private int b_oldal;
	
	//konstruktor
	public Teglalap(int a_oldal, int b_oldal) {
		setoldalak(a_oldal, b_oldal);
	}
	
	public Teglalap(int oldalhossz) {
		setoldalak(oldalhossz);
	}
	
	public int terulet() {
		return a_oldal * b_oldal;
	}

	//@Override
	public String toString() {
		return a_oldal + ", " + b_oldal + ": " + terulet();
	}
	
	public void setoldalak(int a_oldal, int b_oldal) {
		this.a_oldal = a_oldal;
		this.b_oldal = b_oldal;
	}
	
	public void setoldalak(int oldalhossz) {
		//this.a_oldal = this.b_oldal = oldalhossz;
		this.a_oldal = oldalhossz;
		this.b_oldal = oldalhossz;
	}
	
	public boolean teruletnagyobbmint(Teglalap masikteglalap) {
		return terulet() > masikteglalap.terulet();
	}
	
	public boolean egyezike(Teglalap masikTeglalap) {
		return a_oldal == masikTeglalap.a_oldal && b_oldal == masikTeglalap.b_oldal;
	}
	
	
	
	
}
