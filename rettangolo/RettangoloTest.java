package rettangolo;

public class RettangoloTest {
	    public static void main(String[] args) {
	        System.out.println("=== TEST RETTANGOLI ===\n");

	        System.out.println("--- PRIMO CASO (Dimensioni tramite metodo) ---");
	        Rettangolo r1 = new Rettangolo(); 
	        r1.impostaDimensioni(7, 3); 
	        System.out.println("Area: " + r1.calcolaArea());
	        r1.disegna();

	        System.out.println("--- SECONDO CASO (Dimensioni tramite costruttore) ---");
	        Rettangolo r2 = new Rettangolo(4, 5); 
	        System.out.println("Area: " + r2.calcolaArea());
	        r2.disegna();
	    }
	}

