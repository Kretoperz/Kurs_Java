package funkcje;

import java.util.Scanner;

public class DniMiesiaca {
	
	static int policzDni(int miesiac) {

		int wynik = 0;
		if (miesiac > 12) {
			return wynik;
		}
		else if (miesiac == 2)	{
			wynik = 28;
			 return wynik;
		}
		else if (miesiac % 2 == 0) {
				wynik = 31;	
		   		 return wynik;
	}
		   		 else {
		   			 wynik = 30;
		   			 return wynik;
		   		 }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int wartosc = 0;
		Scanner wej = new Scanner(System.in); 
		System.out.println("Podaj numer miesiąca");
		wartosc = wej.nextInt();
		
		int wynik = DniMiesiaca.policzDni(wartosc);
		if (wynik == 0) {
			System.out.println("Nie ma takiego miesiąca!");
		}
		else {
		System.out.println("Ten miesiąc ma " + wynik + " dni.");
		}
		
	}

}
