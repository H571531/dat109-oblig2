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
	 * Main metode for å starte spillet
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Terningspill spill = new Terningspill();
		UiInterface ui;
		
		/*
		 * To forskjellige brukergrensesnitt er implementert:
		 * MessageDialogUi for bruk av dialogbokser,
		 * Tekstgrensesnitt for bruk av konsoll
		 */
		
		//ui = new MessageDialogUi(spill);
		ui = new Tekstgrensesnitt(spill);
		boolean ferdig = false;

		ui.setUpDeltakere();
		

		while (!ferdig) {
			ui.visVinner();
			ferdig = ui.spilleIgjen();
		}
	}

}
