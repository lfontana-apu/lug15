package esercizioIncapsulamento;

import java.time.LocalDateTime;

public class ProgrammaTV {
	private int canale, anno, mese, giorno, ora, minuto, durataMinuti;
	
	// setter 
	public boolean setCanale(int canale) {
		if(canale >= 1 && canale <= 1000) {
			this.canale = canale;
			return true;
		}
		System.out.println("[ERRORE] Il canale deve essere compreso tra 1 e 1000");
		return false;
	}
	
	
	public boolean setAnno(int anno) {
		if (anno >= 2026) {
			this.anno = anno;
			return true;
		}
		System.out.println("[ERRORE] L'anno inserito non è valido o è nel passato");
		return false;
	}
	
	public boolean setMese(int mese) {
		if (mese >= 1 && mese <= 12) {
			this.mese = mese;
			return true;
	}
		System.out.println("[ERRORE] Il mese deve essere compreso tra 1 e 12");
		return false;
	}
	
	public boolean setGiorno(int giorno) {
		if (giorno >= 1 && mese <= 32) {
			this.giorno = giorno;
			return true;
	}
		System.out.println("[ERRORE] Il giorno deve essere compreso tra 1 e 31");
		return false;
	}
	
	public boolean setOra(int ora) {
		if (ora >= 0 && ora <= 23) {
			this.ora = ora;
			return true;
	}
		System.out.println("[ERRORE] L'ora deve essere compreasa tra 0 e 23");
		return false;
	}
	
	public boolean setMinuto(int minuto) {
		if (minuto >= 0 && mese <= 59) {
			this.minuto = minuto;
			return true;
	}
		System.out.println("[ERRORE] I minuti devo essere compresi tra 0 e 59");
		return false;
	}
	
	public boolean setDurataMinuti(int durataMinuti) {
		if (durataMinuti > 0) {
			this.durataMinuti = durataMinuti;
			return true;
	}
		System.out.println("[ERRORE] La durata deve essere maggiore di 0 minuti");
		return false;
	}
	
	
	// Getter
	public int getCanale() {
		return canale;
	}
	public int getAnno() {
		return anno;
	}
	public int getMese() {
		return mese;
	}
	public int getGiorno() {
		return giorno;
	}
	public int getOra() {
		return ora;
	}
	public int getMinuto() {
		return minuto;
	}
	public int getDurataMinuti() {
		return durataMinuti;
	}
	
	public boolean validaDataCompleta() {
		try {
			LocalDateTime.of(this.anno, this.mese, this.giorno, this.ora, this.minuto);
			return true;
		}catch (Exception e) {
			System.out.println("[ERRORE] La combinazione di data e ora inserita non esiste nel calendario reale!");
			return false;
		}
	}
		
		public void stampaDettagli() {
			System.out.println("---PIANIFICAZIONE REGISTRAZIONE COMPLETATA---");
			System.out.println("Canale TV: " + this.canale);
			String g = (this.giorno < 10) ? "0" + this.giorno : "" + this.giorno;
	        String m = (this.mese < 10) ? "0" + this.mese : "" + this.mese;
	        String o = (this.ora < 10) ? "0" + this.ora : "" + this.ora;
	        String min = (this.minuto < 10) ? "0" + this.minuto : "" + this.minuto;
	        System.out.println("Inizio: " + g + "/" + m + "/" + this.anno + " alle ore " + o + ":" + min);
			System.out.println("Durata: " + this.durataMinuti + " minuti");
	
	}
	
}
