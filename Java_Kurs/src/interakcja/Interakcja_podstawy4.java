package interakcja;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;

import javax.swing.JOptionPane;

// TODO zmienic typ na BigDecimal

public class Interakcja_podstawy4 {

	public static void main(String[] args) {
	String cena_z_txt = JOptionPane.showInputDialog("Ile zł kosztuje 1 kilogram ziemniaków?");
	BigDecimal cena_z = new BigDecimal(cena_z_txt);
	String ilosc_z_txt = JOptionPane.showInputDialog("A ile kg chcesz kupić?");
	BigDecimal ilosc_z = new BigDecimal(ilosc_z_txt);
	BigDecimal rachunek_z = cena_z.multiply(ilosc_z);

	String cena_b_txt = JOptionPane.showInputDialog("Ile zł kosztuje 1 kilogram bananów?");
	BigDecimal cena_b = new BigDecimal(cena_b_txt);
	String ilosc_b_txt = JOptionPane.showInputDialog("A ile kg chcesz kupić?");
	BigDecimal ilosc_b = new BigDecimal(ilosc_b_txt);
	BigDecimal rachunek_b = cena_b.multiply(ilosc_b);
	
	
	if (rachunek_z.compareTo(rachunek_b) > 0) {
		JOptionPane.showMessageDialog(null, "Za ziemniak zapłacisz drożej niż za banany");
	}
	else if (rachunek_z.compareTo(rachunek_b) < 0) {
		JOptionPane.showMessageDialog(null, "Za banany zapłacisz drożej niż za ziemniaki");
	}
	else {
		JOptionPane.showMessageDialog(null, "Za banany zapłacisz tyle samo co za ziemniaki");
	}
		
	
	BigDecimal rachunek = rachunek_z.add(rachunek_b);
	
	NumberFormat formatter = new DecimalFormat("#0.00");    
	JOptionPane.showMessageDialog(null, "To będzie razem: " + (formatter.format(rachunek)) + " zł");

	}

}
