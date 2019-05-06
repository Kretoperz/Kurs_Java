package funkcje;

import java.util.Scanner;

public class LiczbaFibon {
	
	static long ciagFibon(int n) {
		// policz ciag fibonacciego 0 1 1 2 3 5 8 13 21
		// F(0) = 0, F(1) = 1, F(n) = F(n-1) + F(n-2)
		
			long wynik = 1;
			if (n < 1) {
				wynik = 0;
				return wynik;
			}
			else if (n == 0) {
				wynik = 0;
				return wynik;
			}
			else if (n == 1 || n==2) {
				wynik = 1;
				return wynik;
			}
			else {		
					wynik = ciagFibon(n-1) + ciagFibon(n-2);
					return wynik;
			 }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub


	int wartosc = 0;
	Scanner wej = new Scanner(System.in); 
	System.out.println("Podaj kolejną liczbę ciągu Fibonacciego ");
	wartosc = wej.nextInt();
	
	long wynik = LiczbaFibon.ciagFibon(wartosc);
	System.out.println("Ta liczba to " + wynik);
}
}
