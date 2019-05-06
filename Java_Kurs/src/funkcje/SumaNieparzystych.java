package funkcje;

import java.util.Scanner;

public class SumaNieparzystych {

	static int sumaNieparzystych(int n)
	{
		if (n > 0) {
			int wynik = 1;
			int suma = 1;
			for(int i = 1; i < n; i++) {
			wynik += 2;
			suma = suma + wynik;
			}
			return suma;
		}
		
		else {
			int suma = 0;
			return suma;
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int wartosc = 0;
		Scanner wej = new Scanner(System.in); 
		System.out.println("Podaj ilość kolejnych liczb nieparzystych");
		wartosc = wej.nextInt();
		
		int wynik = SumaNieparzystych.sumaNieparzystych(wartosc);
		if (wynik == 0) {
			System.out.println("Musisz podać ilość większą niz zero");
		}
		else {
		System.out.println("Suma kolejych liczb to " + wynik);
		}
		

	}

}
