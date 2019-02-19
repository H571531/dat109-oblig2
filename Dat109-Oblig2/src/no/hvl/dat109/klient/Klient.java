package no.hvl.dat109.klient;

import java.util.ArrayList;
import java.util.List;

import no.hvl.dat109.TerningSpill.Spiller;
import no.hvl.dat109.TerningSpill.Terningspill;
import no.hvl.dat109.grensesnitt.UiInterface;
/**
 * Klient
 * 
 * @author Gruppe 13
 *
 */
public class Klient {
	/**
	 * Main metode for � starte spillet
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> spillere = new ArrayList<String>();
		Terningspill spill = new Terningspill();
		UiInterface ui;
		ui = new MessageDialogUi(spill);
		
		boolean ferdig = false;
		Spiller vinner;
		String vinnerSetning;

		ui.setUpDeltakere();
		

		while (!ferdig) {
			ui.visVinner();
			ferdig = ui.spilleIgjen();
		}
	}

}
