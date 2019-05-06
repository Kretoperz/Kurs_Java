package petle;

import java.util.Scanner;

public class Choinka {

	public static void main(String[] args) {
		

		// okreslam poziomy choinki
		int poziomy = 0;
		
		Scanner wej = new Scanner(System.in); 
		System.out.println("Podaj ilość poziomów choinki");
		poziomy = wej.nextInt();
		
		// okreslam poczatkowa ilosc znaków pustych i gwiazdek
		int gwiazdka = 1;
		int puste = poziomy - 1;
		
		
		// petla rysujaca choinke
		
		  for(int i = 0 ; i < poziomy; i++){
			  
	            for(int j = 0; j <= puste; j++){
	                System.out.print(" ");
	            }
	                for(int k = 0; k < gwiazdka; k++) {
	                	 System.out.print("*");
	                }
	             
	                System.out.println();
	                puste--;
	                gwiazdka += 2;
	        }
  	            
		  }
	}