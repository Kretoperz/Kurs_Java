package interakcja;

import javax.swing.JOptionPane;

public class buty_do_szewca {

	public static void main(String[] args) {
		
		
		int dzien = Integer.parseInt(JOptionPane.showInputDialog("Podaj aktualny numer dnia tygodnia: "));
		if(dzien > 7) {
			JOptionPane.showMessageDialog(null, "Nie ma takiego dnia tygodnia");
			return;
		}
		int czas = Integer.parseInt(JOptionPane.showInputDialog("Podaj ile dni potrwa naprawa butów: "));
		
		int odbior = dzien + czas;
		int tydzien = 0;
		
		while (odbior > 7) {
			odbior = odbior - 7;
			tydzien++;
		}
		
		if (tydzien > 4) {
			tydzien = 4;
		}
		
		
		String[] dzien_txt = {"dziś", "w poniedziałek", "we wtorek", "we środę", "w czwartek", "w piątek", "w sobotę", "w niedzielę"};
		String[] tydzien_txt = {" w tym tygodniu", " w przyszłym tygodniu", " za 2 tygodnie", " za 3 tygodnie", " za miesiąc"};
		
		
		JOptionPane.showMessageDialog(null, "Buty będą gotowe " + dzien_txt[odbior] + tydzien_txt[tydzien]);
		
		}		
}
