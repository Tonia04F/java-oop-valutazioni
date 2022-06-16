package jana60.valutazioni;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*Classe Main con metodo main in cui create un array di studenti (i dati degli studenti possono essere chiesti all’utente oppure 
		 * inseriti nel codice con dei valori di test). L’id di ogni studente deve essere univoco nell’array (possiamo usare un numero progressivo).
		 *  Il programma deve poi stampare a video per ogni studente se è stato promosso o bocciato e quanti studenti sono stati promossi in tutto.*/ 
		Scanner sc = new Scanner(System.in);
	
		Studente[] studenti = new Studente[10];
	
		for (int i = 0; i < studenti.length; i++) {
			int percAssenze = sc.nextInt();
			double mediaVoti = sc.nextInt();
			studenti[i]= new Studente(i+1, percAssenze, mediaVoti);
			
		
			if(studenti[i].pagella()) {
				System.out.println("promosso");
			}
			else {
				System.out.println("bocciato");
			}
			
		}
	
		
	}

}
