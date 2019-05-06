package interakcja;

import javax.swing.JOptionPane;

public class Interakcja_podstawy2 {

	public static void main(String[] args) {
	String cena_txt = JOptionPane.showInputDialog("Ile zł kosztuje 1 kilogram ziemniaków?");
	double cena = Double.parseDouble(cena_txt);
	String ilosc_txt = JOptionPane.showInputDialog("A ile kg chcesz kupić?");
	double ilosc = Double.parseDouble(ilosc_txt);
	double rachunek = cena * ilosc;
	JOptionPane.showMessageDialog(null, "To będzie razem: " + rachunek + " zł");

	}

}
