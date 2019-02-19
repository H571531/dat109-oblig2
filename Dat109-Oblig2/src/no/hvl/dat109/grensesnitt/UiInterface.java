package no.hvl.dat109.grensesnitt;

import java.util.List;

import no.hvl.dat109.TerningSpill.Terningspill;
/**
 * Grensesnitt for brukergrensesnitt
 * 
 * @author Gruppe 13
 *
 */
public interface UiInterface {
	
	/**
	 * Ber bruker om å skrive inn navn på deltakere, som legges inn i terningspill
	 */
	void setUpDeltakere();

	/**
	 * Spiller en runde av terningspillet, og viser en vinner
	 */
	void visVinner();

	/**
	 * Spør bruker om bruker ønsker å spille flere runder
	 * @return true hvis bruker vil spille flere runder
	 */
	boolean spilleIgjen();

}
