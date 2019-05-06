package funkcje;

import java.util.Scanner;

public class PoleTrojkata {
	
	static double poleTrojkata (double bok_a, double bok_b, double bok_c) {
		double pole = 0.0;
		if(bok_a + bok_b < bok_c) {
			return pole;	
		}
		if(bok_a + bok_c < bok_b) {
			return pole;
		}
		if(bok_b + bok_c < bok_a) {
			return pole;
		}
		double p = ((bok_a + bok_b + bok_c)/2);
		pole = Math.sqrt(p * (p - bok_a) + (p - bok_b) + (p - bok_c));
		return pole;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner wej = new Scanner(System.in); 
		System.out.println("Podaj bok a trójkąta");
		double bok_a = wej.nextDouble();
		System.out.println("Podaj bok b trójkąta");
		double bok_b = wej.nextDouble();
		System.out.println("Podaj bok c trójkąta");
		double bok_c = wej.nextDouble();
		double wynik = poleTrojkata(bok_a, bok_b, bok_c);
		if (wynik == 0.0) {
		System.out.println("Nie ma takiego trójkąta!");
		}
		else {
		System.out.println("Pole trójkąta wynosi: " + wynik);
		}

	}

}
