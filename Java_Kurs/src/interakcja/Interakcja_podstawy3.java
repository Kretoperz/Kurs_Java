package interakcja;

import javax.swing.JOptionPane;

public class Interakcja_podstawy3 {

	public static void main(String[] args) {
	String cena_z_txt = JOptionPane.showInputDialog("Ile zł kosztuje 1 kilogram ziemniaków?");
	double cena_z = Double.parseDouble(cena_z_txt);
	String ilosc_z_txt = JOptionPane.showInputDialog("A ile kg chcesz kupić?");
	double ilosc_z = Double.parseDouble(ilosc_z_txt);
	double rachunek_z = cena_z * ilosc_z;
	
	String cena_b_txt = JOptionPane.showInputDialog("Ile zł kosztuje 1 kilogram bananów?");
	double cena_b = Double.parseDouble(cena_b_txt);
	String ilosc_b_txt = JOptionPane.showInputDialog("A ile kg chcesz kupić?");
	double ilosc_b = Double.parseDouble(ilosc_b_txt);
	double rachunek_b = cena_b * ilosc_b;	
	
	if (rachunek_z > rachunek_b) {
		JOptionPane.showMessageDialog(null, "Za ziemniaki zapłacisz drożej niż za banany");		
	}
	else if (rachunek_z < rachunek_b) {
		JOptionPane.showMessageDialog(null, "Za banany zapłacisz drożej niż za ziemniaki");
	}
	else {
		JOptionPane.showMessageDialog(null, "Za banany zapłacisz tyle samo co za ziemniaki");
	}
		
	double rachunek = rachunek_z + rachunek_b;
	
	JOptionPane.showMessageDialog(null, "To będzie razem: " + rachunek + " zł");

	}

}
