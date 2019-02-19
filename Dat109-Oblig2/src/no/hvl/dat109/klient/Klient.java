package no.hvl.dat109.klient;

import java.util.ArrayList;
import java.util.List;

import no.hvl.dat109.ADT.UiInterface;
import no.hvl.dat109.TerningSpill.Spiller;
import no.hvl.dat109.TerningSpill.Terningspill;

public class Klient {
	/**
	 * Main metode for å starte spillet
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> spillere = new ArrayList<String>();
		Terningspill spill = new Terningspill(0);
		UiInterface ui;

		ui = new MessageDialogUi();
		boolean ferdig = false;
		Spiller vinner;
		String vinnerSetning;

		spillere = ui.setUpDeltakere();
		spillere.forEach(s -> spill.leggTilSpiller(s));

		while (!ferdig) {
			vinner = spill.spill();
			if (!(vinner == null)) {
				vinnerSetning = vinner.getNavn() + " vant med " + vinner.getVerdi() + " poeng!";
			} else {
				vinnerSetning = "Ingen spillere.";
			}
			ui.visVinner(vinnerSetning);
			ferdig = ui.spilleIgjen();
		}
	}

}
