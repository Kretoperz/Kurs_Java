package petle;

import java.util.Random;
import java.util.Scanner;

public class Zgadnij_liczbe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random r = new Random(); 
		int x = r.nextInt(1000); 
		int podany_wynik = 0;
		int counter = 1;
		Boolean sukces = false;
		
		   while (sukces == false) {
		Scanner wej = new Scanner(System.in);
		System.out.print("Odgadnij liczbę z przedziału 0-999: ");
	       podany_wynik = wej.nextInt();
	    
	       if (podany_wynik == x) {
	    	   System.out.print("Gratulacje, odgadnięto przy " + counter + " próbie!");
	    	   sukces = true;
	       } else if (podany_wynik > x) {
	    	   System.out.println("Podano za wysoką liczbę!");
	    	   System.out.print("Próbuj dalej! ");
	    	   counter++;
	       }
	       else {
	    	   System.out.println("Podano za niską liczbę!");
	    	   System.out.print("Próbuj dalej! ");
	    	   counter++;
	       }
	    	   
	       }
	}

}
