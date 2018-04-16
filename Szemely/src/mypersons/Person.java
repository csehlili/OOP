package mypersons;

public class Person {
	private String nev;
	private int kor;
	
	public Person(String nev, int kor) {
		this.nev = nev;
		this.kor = kor;
	}

	public String getNev() {
		return nev;
	}

	public int getKor() {
		return kor;
	}
	
	@Override
	public String toString() {
		return "Person [nev=" + nev + ", kor=" + kor + "]";
	}

	public boolean koraNagyobbMint(Person masikSzemely) {
		return kor > masikSzemely.kor;
	}
	

}
