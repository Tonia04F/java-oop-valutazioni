package jana60.valutazioni;

public class Studente {
/*Classe Studente con tre attributi: 
 * id dello studente (intero), 
 * percentuale assenze (intero), 
 * media voti (numero decimale). 
 * La classe deve avere un costruttore con parametri e anche 
 * un metodo che calcola, in base a percentuale delle assenze e media dei voti, se lo studente è promosso o bocciato*/
	
	int idStudente;
	int percAssenze;
	double mediaVoti;
	
	
	public Studente(int idStudente, int percAssenze, double mediaVoti) {
		this.idStudente = idStudente;
		this.percAssenze = percAssenze;
		this.mediaVoti = mediaVoti;
	}
	
	boolean pagella() {
		boolean promosso = false;
		if(percAssenze < 20 && mediaVoti >=6.5) {
			promosso=true;
		}
		else if(percAssenze < 20 && mediaVoti <= 5.5) {
			promosso=false;
		}
		else if(percAssenze > 20 && mediaVoti >=6.5) {
			promosso = false;
		}
		return promosso;
	}
		
		
	
	
}
