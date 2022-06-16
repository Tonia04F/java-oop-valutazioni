package jana60.valutazioni;

public class Main {

	public static void main(String[] args) {
		/*Classe Main con metodo main in cui create un array di studenti (i dati degli studenti possono essere chiesti all’utente oppure inseriti nel codice con dei valori di test). L’id di ogni studente deve essere univoco nell’array (possiamo usare un numero progressivo). Il programma deve poi stampare a video per ogni studente se è stato promosso o bocciato e quanti studenti sono stati promossi in tutto.*/ 

		
		Studente tonia = new Studente(209,8,7.3);
		Studente luisa = new Studente(1409,5,8.5);
		Studente davide = new Studente(1903,0,7.1);
		Studente enzo = new Studente(2409,3,5.6);
		
		Studente[] studenti = new Studente[4];
		studenti[0] = tonia;
		studenti[1] = luisa;
		studenti[2] = davide;
		studenti[3] = enzo;
		
		
		for (int i = 0; i < studenti.length; i++) {
			System.out.println(studenti[i].pagella());
		}

		
		
		
		
		
		
	}

}
