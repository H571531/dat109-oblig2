package no.hvl.dat109.grensesnitt;

import java.util.List;
/**
 * Grensesnitt for brukergrensesnitt
 * 
 * @author Gruppe 13
 *
 */
public interface UiInterface {

	List<String> setUpDeltakere();

	void visVinner(String vinner);

	boolean spilleIgjen();

}
