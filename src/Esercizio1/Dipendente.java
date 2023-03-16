package Esercizio1;

public class Dipendente {

	public static double stipendioBase = 1000;
	
	private String matricola;
	private double stipendio;
	private double importoOrarioStraordinario;
	private Livello livello;
	private Dipartimento dipartimento;

//	public void setLivello (Livello m) {
//		this.livello = m;
//	}
	
	public Dipendente (String matricola, Dipartimento dipartimento) {
		this.matricola = matricola;
		this.dipartimento = dipartimento;
		this.stipendio = stipendioBase;
		this.importoOrarioStraordinario = 30;
		this.livello = Livello.OPERAIO;
	}
	
	public Dipendente (String matricola, Dipartimento dipartimento, double stipendio, double importoOrarioStraordinario, Livello livello) {
		this(matricola, dipartimento);
		this.stipendio = stipendio;
		this.importoOrarioStraordinario = importoOrarioStraordinario;
		this.livello = livello;
	}
	
	public String getMatricola() {
		return this.matricola;
	}
	public double getStipendio() {
		return this.stipendio;
	}
	public double getStraordinari() {
		return this.importoOrarioStraordinario;
	}
	public Livello getLivello() {
		return this.livello;
	}
	public Dipartimento getDipartimento() {
		return this.dipartimento;
	}
	
	private void setLivello(Livello nuovoLivello) {
		this.livello = nuovoLivello;
	}
	private void setStipendio(double newStipendio) {
		this.stipendio = newStipendio;
	}
	
	public String toString() {
		String res = "Dipendente:\n\n";
		res += "• Matricola: " + getMatricola() + "\n";
		res += "• Dipartimento: " + getDipartimento() + "\n";
		res += "• Livello: " + getLivello() + "\n";
		res += "• Stipendio Attuale: " + getStipendio() + "€ \n";
		res += "• Straordinari: " + getStraordinari() + "h \n";
		return res;
	}
	
	public static void stampaDatiDipendente(Dipendente dipendente) {
		System.out.println(dipendente);
	}
	public Livello promuovi(Dipendente dipendente) {
		switch (this.livello) {
		case OPERAIO: {
			setLivello(Livello.IMPIEGATO);
			break;
		}
		case IMPIEGATO: {
			setLivello(Livello.QUADRO);
			break;
		}
		case QUADRO: {
			setLivello(Livello.DIRIGENTE);
			break;
		}
		default: System.out.println("Impossibile promuovere, il dipendente è già al livello massimo di dirigente!");
		}
		aumento(dipendente);
		return livello;
	}
	
	private double aumento(Dipendente dipendente) {
		switch (this.livello) {
		case IMPIEGATO -> setStipendio((stipendioBase*1.2));
		case QUADRO -> setStipendio((stipendioBase*1.5));
		case DIRIGENTE -> setStipendio((stipendioBase*2));
		default -> setStipendio((stipendioBase));
		}
		return this.stipendio;
	}
	
	public static double calcolaPaga(Dipendente dipendente) {
		return dipendente.getStipendio();
	}
	public static double calcolaPaga(Dipendente dipendente, int straordinario) {
		double stipendio = dipendente.stipendio;
		switch (dipendente.livello) {
		case OPERAIO -> stipendio = stipendio + (straordinario*10);
		case IMPIEGATO -> stipendio = stipendio + (straordinario*12);
		case QUADRO -> stipendio = stipendio + (straordinario*15);
		case DIRIGENTE -> stipendio = stipendio + (straordinario*20);
		}
		return stipendio;
	}
}
