package funkcje;

import java.util.Scanner;

public class Temperatury {
	
	static Double far_celc(Double farenheit) {
		Double celsius = (farenheit - 32) / 1.8;
		return celsius;
	}
	
	static Double celc_far(Double celsius) {
		Double farenheit = 1.8 * celsius + 32;
		return farenheit;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Double wartosc = 0.0;
		int wybor = 0;
		
		Scanner wyb = new Scanner(System.in); 
		System.out.println("Co chcesz przeliczyć?");
		System.out.println("1 - Konwersja stopni Farenheit na Celsius");
		System.out.println("2 - Konwersja stopni Celsius na Farenheit");
		wybor = wyb.nextInt();
		
		if(wybor == 1) {
		Scanner wej = new Scanner(System.in); 
		System.out.println("Podaj ilość stopni Farenheita do przeliczenia");
		wartosc = wej.nextDouble();
		Double wynik = Temperatury.far_celc(wartosc);
		System.out.println("To będzie " + wynik + " stopni Celsjusza");
		}
		
		else if(wybor == 2) {
			Scanner wej = new Scanner(System.in); 
			System.out.println("Podaj ilość stopni Celsjusza do przeliczenia");
			wartosc = wej.nextDouble();
			Double wynik = Temperatury.celc_far(wartosc);
			System.out.println("To będzie " + wynik + " stopni Farenheita");
		}
		
		else {
			System.out.println("Program nie obsługuje takiej opcji");
			return;
		}
		
	}

}
