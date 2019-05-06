package algorytmy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//oblicz:
//static int suma(int[] tab)
//static double srednia(int[] tab)
//static int max(int[] tab)
//static int roznicaMinMax(int[] tab)
//static void wypiszWieksze(int[] tab, int x) <- wypisuje wieksze od podanego x
//static Integer pierwszaWieksza(int[] tab, int x) <- wypisuje pierwsza wieksza od podanego x lub zwraca null
//static int sumaWiekszych(int[] tab, int x) <- wypisuje sume wiekszych liczb od podanego x
//static int ileWiekszych(int[] tab, int x) <- wypisuje ilosc wiekszych liczb od podanego x
//static void wypiszPodzielne(int[] tab, int x) <- wypisuje wszystkie podzielne przez podany x (element % x == 0)
//static Integer pierwszaPodzielna(int[] tab, int x) <- wypisuje pierwsza podzielna przez podany x lub zwraca null
//static int ilePodzielnych(int[] tab, int x) <- wypisuje ilosc podzielnych liczb przez podany x
//Integer znajdzWspolny(int[] t1, int[] t2) – zwraca element, który występuje zarówno w tablicy t1, jak i t2; lub zwraca null
//List<Integer> wszystkieWspolne(int[] t1, int[] t2) – zwraca listę wszystkich wspólnych elementów z tablic t1 i t2; lub zwraca null

public class Tablice {
	
	
	static int suma(int[] tab) {
		int wynik_sum = 0;
		for (int a : tab) {
			wynik_sum += a;
			}	
	   		 return wynik_sum;
	}
	
	
	static double srednia(int[] tab) {
		double wynik_sr = 0;
			wynik_sr = suma(tab) / tab.length;
		return wynik_sr;
	}
	
	
	static int max(int[] tab) {
		int wynik_max = Integer.MIN_VALUE;
		for (int a : tab) {
			if(a > wynik_max) {
				wynik_max = a;
			}
		}
		return wynik_max;
	}
	
	static int min(int[] tab) {
		int wynik_min = Integer.MAX_VALUE;
		for (int a : tab) {
			if(a < wynik_min) {
				wynik_min = a;
			}
		}
		return wynik_min;
	}
	
	static int roznicaMinMax(int[] tab) {
			int wynik_roz_minmax = Tablice.max(tab) - Tablice.min(tab);
		return wynik_roz_minmax;
	}
	
	
	static void wypiszWieksze(int[] tab, int x) {
		System.out.print("Liczby zbioru większe od " + x + " : ");
		for (int a : tab) {
			if (a > x) {
				System.out.print(a + ", ");
			}
		}
		System.out.println();
	}
	
	
	static Integer pierwszaWieksza(int[] tab, int x) {
		Integer wynik_pierwmax = null;
		for (int a : tab) {
			if (a > x) {
				wynik_pierwmax = a;
				System.out.println("Pierwsza liczba zbioru większa od " + x + " to: " + wynik_pierwmax);
				break;
			}
				}
	return wynik_pierwmax;
		}
	
	
	static int sumaWiekszych(int[] tab, int x) {
		int wynik_sumwiek = 0;
		for (int a : tab) {
			if (a > x) {
				wynik_sumwiek += a;
			}
		}
		return wynik_sumwiek;
	}
	
	static int ileWiekszych(int[] tab, int x) {
		int wynik_ilewiek = 0;
		for (int a : tab) {
			if (a > x) {
				wynik_ilewiek++;
			}
		}
		return wynik_ilewiek;
	}
	
	static void wypiszPodzielne(int[] tab, int x) {
		System.out.print("Liczby zbioru podzielne przez " + x + " : ");
		for (int a : tab) {
			if (a % x == 0) {
				System.out.print(a + ", ");
			}
		}
		System.out.println();
	}
	
	
	static Integer pierwszaPodzielna(int[] tab, int x) {
		Integer wynik_pierwpodz = null;
		for (int a : tab) {
			if (a % x == 0) {
				wynik_pierwpodz = a;
				System.out.println("Pierwsza liczba zbioru podzielna przez " + x + " to: " + wynik_pierwpodz);
				break;
			}
				}
	return wynik_pierwpodz;
		
	}
	
	
	static int ilePodzielnych(int[] tab, int x) {
		int wynik_ilepodz = 0;
		for (int a : tab) {
			if (a % x == 0) {
				wynik_ilepodz++;
			}
	}
		return wynik_ilepodz;
	}
		
	
	static Integer znajdzWspolny(int[] t1, int[] t2) {
		Integer wynik_znajdzwsp = null;
		for (int a : t1) {
			for (int b : t2) {
				if (b == a) {
					wynik_znajdzwsp = b;
					System.out.print("Liczba wspólna zbioru to: " + wynik_znajdzwsp);
				}				
			}
		}
		return wynik_znajdzwsp;
	}
	
	
	static List<Integer> wszystkieWspolne(int[] t1, int[] t2) {
		List<Integer> wynik_wszwsp = new ArrayList<Integer>();
		for (int a : t1) {
			for (int b : t2) {
				if (b == a) {
					wynik_wszwsp.add(b);
				}				
			}
		}
		return wynik_wszwsp;
	}
	
	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {1, 4, 3, 4, 8, 7};
		int[] b = {5, 0, 7, -30, 10, 5};
		int[] c = {4, 4, 10};
		

		System.out.println("Suma liczb zbioru a: " + Tablice.suma(a));
		System.out.println("Suma liczb zbioru b: " + Tablice.suma(b));
		System.out.println("Suma liczb zbioru c: " + Tablice.suma(c));
		
		System.out.println("Średnia liczb zbioru a: " + Tablice.srednia(a));
		System.out.println("Średnia liczb zbioru b: " + Tablice.srednia(b));
		System.out.println("Średnia liczb zbioru c: " + Tablice.srednia(c));
		
		System.out.println("Największa liczba zbioru a: " + Tablice.max(a));
		System.out.println("Największa liczba zbioru b: " + Tablice.max(b));
		System.out.println("Największa liczba zbioru c: " + Tablice.max(c));
		
		System.out.println("Różnica największej i najmniejszej liczby zbioru a: " + Tablice.roznicaMinMax(a));
		System.out.println("Różnica największej i najmniejszej liczby zbioru b: " + Tablice.roznicaMinMax(b));
		System.out.println("Różnica największej i najmniejszej liczby zbioru c: " + Tablice.roznicaMinMax(c));
		
		Scanner wej1 = new Scanner(System.in); 
		System.out.println("Podaj wartość x: ");
		int x = wej1.nextInt();
		Tablice.wypiszWieksze(a, x);
		Tablice.wypiszWieksze(b, x);
		Tablice.wypiszWieksze(c, x);
		
		Scanner wej2 = new Scanner(System.in); 
		System.out.println("Podaj wartość x: ");
		Integer y = wej2.nextInt();
		Tablice.pierwszaWieksza(a, y);
		Tablice.pierwszaWieksza(b, y);
		Tablice.pierwszaWieksza(c, y);
		
		Scanner wej3 = new Scanner(System.in); 
		System.out.println("Podaj wartość x: ");
		int z = wej3.nextInt();
		System.out.println("Suma większych liczb zbioru a: " + Tablice.sumaWiekszych(a, z));
		System.out.println("Suma większych liczb zbioru b: " + Tablice.sumaWiekszych(b, z));
		System.out.println("Suma większych liczb zbioru c: " + Tablice.sumaWiekszych(c, z));
		
		Scanner wej4 = new Scanner(System.in); 
		System.out.println("Podaj wartość x: ");
		int x1 = wej4.nextInt();
		System.out.println("Ilość większych liczb zbioru a: " + Tablice.ileWiekszych(a, x1));
		System.out.println("Ilość większych liczb zbioru b: " + Tablice.ileWiekszych(b, x1));
		System.out.println("Ilość większych liczb zbioru c: " + Tablice.ileWiekszych(c, x1));
		
		Scanner wej5 = new Scanner(System.in); 
		System.out.println("Podaj wartość x: ");
		int y1 = wej5.nextInt();
		Tablice.wypiszPodzielne(a, y1);
		Tablice.wypiszPodzielne(b, y1);
		Tablice.wypiszPodzielne(c, y1);
		
		Scanner wej6 = new Scanner(System.in); 
		System.out.println("Podaj wartość x: ");
		Integer z1 = wej6.nextInt();
		Tablice.pierwszaPodzielna(a, z1);
		Tablice.pierwszaPodzielna(b, z1);
		Tablice.pierwszaPodzielna(c, z1);
		
		Scanner wej7 = new Scanner(System.in); 
		System.out.println("Podaj wartość x: ");
		int x2 = wej7.nextInt();
		System.out.println("Ilość liczb zbioru a podzielnych przez x: " + Tablice.ilePodzielnych(a, x2));
		System.out.println("Ilość liczb zbioru b podzielnych przez x: " + Tablice.ilePodzielnych(b, x2));
		System.out.println("Ilość liczb zbioru c podzielnych przez x: " + Tablice.ilePodzielnych(c, x2));
		
		Tablice.znajdzWspolny(a, b);
		
		System.out.println("Wszystkie liczby wspólne zbiorów a i b: " + Tablice.wszystkieWspolne(a, b));
		System.out.println("Wszystkie liczby wspólne zbiorów a i c: " + Tablice.wszystkieWspolne(a, c));
		
	}

}
