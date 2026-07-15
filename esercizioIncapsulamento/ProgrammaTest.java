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

		boolean dataFisicamenteValida = false;
		while (!dataFisicamenteValida) {

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
				System.out.print("Inserisci il giorno d'inizio (1-31): ");
				int giorno = scanner.nextInt();
				inputValido = reg.setGiorno(giorno);
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

			dataFisicamenteValida = reg.validaDataCompleta();

			if (!dataFisicamenteValida) {
				System.out.println("[ATTENZIONE] La data inserita non è valida o è nel passato. Reinserisci la data d'inizio.");
			}
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