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

	void setUpDeltakere(Terningspill spill);

	void visVinner(String vinner);

	boolean spilleIgjen();

}
