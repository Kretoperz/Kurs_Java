package funkcje;

import java.util.Scanner;

public class Odleglosc {
	
	static Double stopyNaMetry (Double stopy) {
		Double metry = stopy * 0.3;
		return metry;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Double wartosc = 0.0;
		
		Scanner wej = new Scanner(System.in); 
		System.out.println("Podaj ilość stóp do przeliczenia na metry");
		wartosc = wej.nextDouble();
		
		Double wynik = Odleglosc.stopyNaMetry(wartosc);
		System.out.println("To będzie " + wynik + " metrów.");
	}

}
