package interakcja;

import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class pole_trojkata {
	
	private static DecimalFormat df2 = new DecimalFormat("#.##");

	public static void main(String[] args) {
		
		double bok_a = Double.parseDouble(JOptionPane.showInputDialog("Podaj bok a trójkąta: "));
		double bok_b = Double.parseDouble(JOptionPane.showInputDialog("Podaj bok b trójkąta: "));
		double bok_c = Double.parseDouble(JOptionPane.showInputDialog("Podaj bok c trójkąta: "));
		if(bok_a + bok_b < bok_c) {
			JOptionPane.showMessageDialog(null, "Nie ma takiego trójkąta");
			return;	
		}
		if(bok_a + bok_c < bok_b) {
			JOptionPane.showMessageDialog(null, "Nie ma takiego trójkąta");
			return;	
		}
		if(bok_b + bok_c < bok_a) {
			JOptionPane.showMessageDialog(null, "Nie ma takiego trójkąta");
			return;	
		}
		double p = ((bok_a + bok_b + bok_c)/2);
		double pole = Math.sqrt(p * (p - bok_a) + (p - bok_b) + (p - bok_c));
		JOptionPane.showMessageDialog(null, "Pole trójkąta wynosi: " + df2.format(pole));

	}

}
