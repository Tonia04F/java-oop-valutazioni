package jana60.valutazioni;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*Classe Main con metodo main in cui create un array di studenti (i dati degli studenti possono essere chiesti all’utente oppure 
		 * inseriti nel codice con dei valori di test). L’id di ogni studente deve essere univoco nell’array (possiamo usare un numero progressivo).
		 *  Il programma deve poi stampare a video per ogni studente se è stato promosso o bocciato e quanti studenti sono stati promossi in tutto.*/ 
	
		
		Scanner sc = new Scanner(System.in);
		//creo array di studenti da controllare
		Studente[] studenti = new Studente[4];
		
		
		int promossi = 0;
		
		for (int i = 0; i < studenti.length; i++) {
			System.out.println("inserisci dati studente: ");
			//chiedo all utente di inserire i dati di ogni studente 
			int percAssenze = sc.nextInt();
			double mediaVoti = sc.nextDouble();
			//i sta per id faccio +1 per partire da indice 1 
			studenti[i]= new Studente(i+1, percAssenze, mediaVoti);
			
		//controllo per ogni studente giorni di assenza e voti tramite il metodo pagella da classe studente
			if(studenti[i].pagella()) {
				promossi++;
				System.out.println("promosso");
			}
			else {
				System.out.println("bocciato");
			}
			
			
		}
		System.out.println("il numero degli alunni promossi è: " + promossi);
		
	
		
	}

}
