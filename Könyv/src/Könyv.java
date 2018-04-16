
public class Könyv {
	private String cim;
	private String szerzo;
	private int megjelenes_eve;
	private int ar;
	
	public int konyv_ar(int noveli) {
		return ar+noveli;
	}

	@Override
	public String toString() {
		return "Könyv [cim=" + cim + ", szerzo=" + szerzo + ", megjelenes_eve=" + megjelenes_eve + ", ar=" + ar + "]";
	}



	public String getCim() {
		return cim;
	}



	public void setCim(String cim) {
		this.cim = cim;
	}



	public String getSzerzo() {
		return szerzo;
	}



	public void setSzerzo(String szerzo) {
		this.szerzo = szerzo;
	}



	public int getMegjelenes_eve() {
		return megjelenes_eve;
	}



	public void setMegjelenes_eve(int megjelenes_eve) {
		this.megjelenes_eve = megjelenes_eve;
	}



	public int getAr() {
		return ar;
	}



	public void setAr(int ar) {
		this.ar = ar;
	}

	public Könyv(String cim, String szerzo, int megjelenes_eve, int ar) {
		super();
		this.cim = cim;
		this.szerzo = szerzo;
		this.megjelenes_eve = megjelenes_eve;
		this.ar = ar;
	}
	
	
	
}
