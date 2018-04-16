package sajat;

public class Teglatest extends Hasab {
	private double a_oldal;
	private double b_oldal;
	
	public Teglatest(double magassag, double a, double b) {
		super(magassag);
		this.a_oldal = a_oldal;
		this.b_oldal = b_oldal;
	}

	@Override
	public double getAlapterulet() {
		return a_oldal * b_oldal;
	}

	@Override
	public String toString() {
		return "Teglatest [a oldal=" + a_oldal + ", b oldal=" + b_oldal + ", getMagassag()=" + getMagassag() + "]";
	}
}
