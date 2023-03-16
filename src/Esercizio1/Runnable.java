package Esercizio1;

public class Runnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dipendente d1 = new Dipendente("SB-99", Dipartimento.AMMINISTRAZIONE);
//		d1.stampaDatiDipendente(d1);
//		System.out.println(d1.getLivello());
		System.out.println("Promosso a:" + d1.promuovi(d1));
		Dipendente.stampaDatiDipendente(d1);
//		System.out.println("Promosso a:" + d1.promuovi(d1));
//		d1.stampaDatiDipendente(d1);
//		System.out.println("Promosso a:" + d1.promuovi(d1));
//		d1.stampaDatiDipendente(d1);
//		System.out.println(Dipendente.calcolaPaga(d1, 10));

	}

}
