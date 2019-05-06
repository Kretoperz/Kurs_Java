package funkcje;

import java.util.Scanner;

public class LiczbaPierwsza {
	
	static boolean czyPierwsza(long liczba) {
		
		boolean wynik = true;
		
		if (liczba < 2) {
			wynik = false;
		}
		
		else {
			
			for(int i = 2; i < liczba; i++) {
			if (liczba % i == 0) {
				wynik = false;
				return wynik;
			}
			else {
				wynik = true;
				}	
			}
		}
		return wynik;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int wartosc = 0;
		Scanner wej = new Scanner(System.in); 
		System.out.println("Podaj liczbę do sprawdzenia");
		wartosc = wej.nextInt();
		
		boolean wynik = LiczbaPierwsza.czyPierwsza(wartosc);
		
		if (wynik == true) {
			System.out.println("Liczba " + wartosc + " to liczba pierwsza!");
		}
		else {
			System.out.println("Liczba " + wartosc + " to nie jest liczba pierwsza!");
		}

	}

}
