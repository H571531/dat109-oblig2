package no.hvl.dat109.klient;

import java.util.Scanner;

import no.hvl.dat109.TerningSpill.Spiller;
import no.hvl.dat109.TerningSpill.Terningspill;
import no.hvl.dat109.grensesnitt.UiInterface;

/**
 * Tekstgrensesnitt for terningspill
 * @author Gruppe 13
 *
 */
public class Tekstgrensesnitt implements UiInterface {

	Scanner inn;
	Terningspill spill;
	
	public Tekstgrensesnitt(Terningspill spill) {
		inn = new Scanner(System.in);
		this.spill = spill;
	}
	
	@Override
	public void setUpDeltakere() {
		Scanner inn = new Scanner(System.in);
		
		int spillerId = 1;
		String navn;
		
		do {
			System.out.println("Skriv navn på spiller nr. " + spillerId++ + " (zzz for å avslutte)");
			navn = inn.nextLine();
			if(!navn.equals("zzz")) {
				spill.leggTilSpiller(navn);
			}
		} while(!navn.equals("zzz"));
	
		System.out.println("\n-----------------------------------------------\n");
	}

	@Override
	public void visVinner() {
		Spiller vinner = spill.spill();
		System.out.println("Vinner: " + vinner + " med " + vinner.getVerdi());
	}

	@Override
	public boolean spilleIgjen() {
		
		String valg;
		System.out.println("Spille igjen? (svar n for å avslutte)");
		valg = inn.nextLine();
		if(valg.equalsIgnoreCase("n")) {
			inn.close();
		}
		return valg.equalsIgnoreCase("n");
		
	}

}
