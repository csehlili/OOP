package teglalap;

public class Futtathato {

	public static void main(String[] args) {
		Teglalap a = new Teglalap(2, 3);
		Teglalap b = new Teglalap(3, 2);
		Teglalap c = a;
		
		System.out.println("a:" + a.toString());
		System.out.println("b:" + b.toString());
		System.out.println("c:" + c.toString());
		
		a.setA_oldal(4);
		a.setB_oldal(6);
		System.out.println("új a objektum:" + a.toString());
		
		System.out.println(a.egyezikE(b));
	}
	
	
}
