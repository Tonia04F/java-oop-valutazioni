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
		if(percAssenze < 25 && mediaVoti >=2) {
			promosso=true;
		}
		else if(percAssenze < 50 && mediaVoti > 2) {
			promosso=true;
		}
		else {
			promosso=false;
		}
		
		return promosso;
	}
	
		
		
	
	
}
