
public class alkalmazottotsztaly {
	public static void main(String[] args) {
		alkalmazott alkalmazott = new alkalmazott ();
		
		//alkalmazott.nev = "Kiss Jozsef";
		alkalmazott.setNev("Kis Jozsef");
		//alkalmazott.fizetes = 10;
		alkalmazott.setFizetes(10);
		
		//System.out.println(alkalmazott.nev);
		System.out.println(alkalmazott.getNev());
		System.out.println(alkalmazott.getFizetes());
		//System.out.println(alkalmazott.toString());
		System.out.println(alkalmazott);
		alkalmazott.fizetestnovel(5);
		System.out.println(alkalmazott);
		System.out.println(alkalmazott.fizetesintervallumokkozott(10, 20));
		System.out.println(alkalmazott.fizetendoado());
		
		alkalmazott alkalmazott2 = new alkalmazott();
		alkalmazott2.setNev("Kiss Klaudia");
		alkalmazott2.setFizetes(80);
		System.out.println(alkalmazott.nagyobbfizetesumint(alkalmazott2));
		System.out.println(alkalmazott2.nagyobbfizetesumint(alkalmazott));
		
		alkalmazott[] alkalmazottak = new alkalmazott[5];
		for (int i = 0; i < alkalmazottak.length; i++) {
			alkalmazottak[i] = new alkalmazott();
			alkalmazottak[i].setNev("A");
			alkalmazottak[i].setFizetes((long)(Math.random() * 50 ));
			System.out.println(alkalmazottak[i]);
		}
	}
}
