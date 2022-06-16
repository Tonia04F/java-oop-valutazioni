package jana60.valutazioni;

public class MainNoInput {

	public static void main(String[] args) {
		
		Studente tonia = new Studente(902,3,2.0 );
		Studente luisa = new Studente(249,51,3.4 );
		Studente  davide = new Studente(193,2,1.5 );

		Studente[] alunni = new Studente[3];
		alunni[0] = tonia;
		alunni[1] = luisa;
		alunni[2] = davide;
		
		for (int i = 0; i < alunni.length; i++) {
			System.out.print(alunni[i].idStudente);
			System.out.print(alunni[i].mediaVoti);
			System.out.println(alunni[i].percAssenze);

			if(alunni[i].pagella()) {
				System.out.println("promosso");
			}else {
				System.out.println("bocciato");
			}
		}
			

	}

}
