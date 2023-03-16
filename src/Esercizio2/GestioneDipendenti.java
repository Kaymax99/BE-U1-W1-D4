package Esercizio2;

import Esercizio1.Dipartimento;
import Esercizio1.Dipendente;
import Esercizio1.Livello;

public class GestioneDipendenti {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dipendente operaio1 = new Dipendente("AB-01", Dipartimento.PRODUZIONE);
		Dipendente operaio2 = new Dipendente("BC-02", Dipartimento.PRODUZIONE);
		Dipendente impiegato = new Dipendente("CD-03", Dipartimento.AMMINISTRAZIONE, 1200, 0, Livello.IMPIEGATO);
		Dipendente dirigente = new Dipendente("DE-04", Dipartimento.VENDITE, 2000, 0, Livello.DIRIGENTE);
		
		operaio1.promuovi(operaio1);
		operaio1.promuovi(operaio1);
		Dipendente.stampaDatiDipendente(operaio1);
		Dipendente.stampaDatiDipendente(operaio2);
		Dipendente.stampaDatiDipendente(impiegato);
		Dipendente.stampaDatiDipendente(dirigente);

		System.out.println("Il totale dovuto ai dipendenti attuali, dove ciascuno ha fatto 5 ore di straordinari è: " + 
				(Dipendente.calcolaPaga(operaio1, 5) + 		
				Dipendente.calcolaPaga(operaio2, 5) + 
				Dipendente.calcolaPaga(impiegato, 5) + 
				Dipendente.calcolaPaga(dirigente, 5))
				);
	}
	
}
