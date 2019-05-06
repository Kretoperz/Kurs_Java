package interakcja;

import javax.swing.JOptionPane;

public class Interakcja_podstawy {

	public static void main(String[] args) {
	String cena_txt = JOptionPane.showInputDialog("Ile zł kosztuje 1 kilogram ziemniaków?");
	double cena = Double.parseDouble(cena_txt);
	double rachunek = cena * 5;
	JOptionPane.showMessageDialog(null, "To 5 kilogramów kosztuje: " + rachunek + " zł");

	}

}
