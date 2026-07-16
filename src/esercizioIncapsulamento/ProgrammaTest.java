package esercizioIncapsulamento;

import java.util.Scanner;

public class ProgrammaTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		ProgrammaTV reg = new ProgrammaTV();

		System.out.println("---PROGRAMMAZIONE REGISTRAZIONE---");

		boolean inputValido = false;

		while (!inputValido) {
			System.out.println("Inserisci il numero del canale da registrare (es. 1-1000): ");
			int canale = scanner.nextInt();
			inputValido = reg.setCanale(canale);
		}

		inputValido = false;
		while (!inputValido) {
			System.out.print("Inserisci l'anno d'inizio (es. 2026): ");
			int anno = scanner.nextInt();
			inputValido = reg.setAnno(anno);
		}

		inputValido = false;
		while (!inputValido) {
			System.out.print("Inserisci il mese d'inizio (1-12): ");
			int mese = scanner.nextInt();
			inputValido = reg.setMese(mese);
		}

		inputValido = false;
		while (!inputValido) {
			System.out.print("Inserisci il giorno d'inizio: ");
			int giorno = scanner.nextInt();

			int annoCorrente = reg.getAnno();
			int meseCorrente = reg.getMese();
			int giorniMassimiNelMese = 31;

			if (meseCorrente == 4 || meseCorrente == 6 || meseCorrente == 9 || meseCorrente == 11) {
				giorniMassimiNelMese = 30;
			} else if (meseCorrente == 2) {
				boolean bisestile = (annoCorrente % 4 == 0 && annoCorrente % 100 != 0) || (annoCorrente % 400 == 0);
				if (bisestile) {
					giorniMassimiNelMese = 29;
				} else {
					giorniMassimiNelMese = 28;
				}
			}

			if (giorno >= 1 && giorno <= giorniMassimiNelMese) {
				reg.setGiorno(giorno);
				inputValido = true;
			} else {
				System.out.println("[ERRORE] Giorno non valido! Il mese di " + meseCorrente + " nel " + annoCorrente
						+ " ha " + giorniMassimiNelMese + " giorni. Riprova.");
			}
		}

		inputValido = false;
		while (!inputValido) {
			System.out.print("Inserisci l'ora d'inizio (0-23): ");
			int ora = scanner.nextInt();
			inputValido = reg.setOra(ora);
		}

		inputValido = false;
		while (!inputValido) {
			System.out.print("Inserisci il minuto d'inizio (0-59): ");
			int minuto = scanner.nextInt();
			inputValido = reg.setMinuto(minuto);
		}

		boolean dataFisicamenteValida = reg.validaDataCompleta();
		if (!dataFisicamenteValida) {
			System.out.println("[ATTENZIONE] La data impostata non è valida. Avvia nuovamente il programma.");
			scanner.close();
			return;
		}

		inputValido = false;
		while (!inputValido) {
			System.out.println("Inserisci la durata della registrazione in minuti: ");
			int durata = scanner.nextInt();
			inputValido = reg.setDurataMinuti(durata);
		}

		reg.stampaDettagli();
		scanner.close();
		System.exit(0);
	}
}