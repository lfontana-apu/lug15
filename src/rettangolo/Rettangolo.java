package rettangolo;

public class Rettangolo {
	    int base;
	    int altezza;

	    public Rettangolo() {
	    }

	    public Rettangolo(int base, int altezza) {
	        this.base = base;
	        this.altezza = altezza;
	    }

	    public void impostaDimensioni(int base, int altezza) {
	        this.base = base;
	        this.altezza = altezza;
	    }

	    public int calcolaArea() {
	        return base * altezza;
	    }

	    public void disegna() {
	        System.out.println("Disegno del rettangolo (" + base + "x" + altezza + "):");
	        
	        for (int i = 0; i < altezza; i++) {
	            for (int j = 0; j < base; j++) {
	                System.out.print("* ");
	            }
	            System.out.println();
	        }
	        System.out.println();
	    }
	}

