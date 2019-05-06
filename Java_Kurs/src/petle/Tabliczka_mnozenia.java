package petle;

import java.util.Random;
import java.util.Scanner;

public class Tabliczka_mnozenia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random r = new Random(); 
		int x = r.nextInt(10); 
		int y = r.nextInt(10);
		x = x+1;
		y = y+1;
		int wynik = x * y;
		int podany_wynik = 0;
		int counter = 1;
		Boolean sukces = false;
		
		   while (sukces == false) {
		Scanner wej = new Scanner(System.in);
		System.out.print("Podaj wynik mnożenia " + x + " * " + y + " = ");
	       podany_wynik = wej.nextInt();
	    
	       if (podany_wynik == wynik) {
	    	   System.out.print("Gratulacje, odgadłeś przy " + counter + " próbie!");
	    	   sukces = true;
	       } else {
	    	   System.out.print("Próbuj dalej! ");
	    	   counter++;
	       }
	    	   
	       }
	}

}
