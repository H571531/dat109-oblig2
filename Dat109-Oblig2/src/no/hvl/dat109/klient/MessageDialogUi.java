/**
 * 
 */
package no.hvl.dat109.klient;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import no.hvl.dat109.TerningSpill.Spiller;
import no.hvl.dat109.TerningSpill.Terningspill;
import no.hvl.dat109.grensesnitt.UiInterface;

/**
 * @author Gruppe 13
 *
 */
public class MessageDialogUi implements UiInterface {
	private Terningspill spill;
	public MessageDialogUi(Terningspill spill) {
		this.spill=spill;
	}

	public void setUpDeltakere() {
		boolean fornoyd = false;
		List<String> deltakere = new ArrayList<String>();
		String input = "";
		int spillerT = 1;
		JOptionPane.showMessageDialog(null, "Velkommen til terningspill!");
		do {
			input = JOptionPane.showInputDialog("Skriv inn navn for Spiller" + spillerT + " tom linje for ingen");
			if (input.equals("")) {
				fornoyd = true;
			} else {
				deltakere.add(input);
			}
			spillerT++;
		} while (!fornoyd);
		 deltakere.forEach(s -> spill.leggTilSpiller(s));
	}

	public void visVinner() {
		Spiller vinner = spill.spill();
		String vinnerSetning="";
		if (!(vinner == null)) {
			vinnerSetning = vinner.getNavn() + " vant med " + vinner.getVerdi() + " poeng!";
		} else {
			vinnerSetning = "Ingen spillere.";
		}
		
		JOptionPane.showMessageDialog(null, vinnerSetning);
	}

	public boolean spilleIgjen() {
		boolean spille = false;
		// default icon, custom title
		int n = JOptionPane.showConfirmDialog(null, "Vil du spille igjen?", "Spille igjen?", JOptionPane.YES_NO_OPTION);

		if (n == JOptionPane.YES_OPTION) {
			spille = false;
		} else {
			spille = true;
		}
		return spille;

	}

}
