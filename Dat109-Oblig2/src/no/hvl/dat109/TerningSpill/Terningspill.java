/**
 * 
 */
package no.hvl.dat109.TerningSpill;

import java.util.ArrayList;
import java.util.List;

/**
 * Terningspill Kontroller for spillet
 * 
 * @author Gruppe
 *
 */
public class Terningspill {
	int id;
	List<Spiller> spillere;
	Kopp kopp;

	/**
	 * Konstruktør
	 * 
	 * @param id
	 *            på spillet
	 */
	public Terningspill(int id) {
		spillere = new ArrayList<Spiller>();
		this.id = id;
		kopp = new Kopp(id * 10);
	}

	/**
	 * Legger til en spiller
	 * 
	 * @param navn
	 *            på spilleren
	 */
	public void leggTilSpiller(String navn) {
		spillere.add(new Spiller(navn));
	}

	/**
	 * Starter spillet med spillerne som er lagt til.
	 * 
	 * @return vinneren av spillet.
	 */
	public Spiller spill() {
		Spiller vinner;
		if (spillere.size() > 1) {
			spillere.forEach(s -> s.spill(kopp));
			vinner = spillere.stream().max((a, b) -> a.getVerdi() - b.getVerdi()).get();
		} else if (spillere.size() == 1) {
			vinner = spillere.get(0);
		} else {
			vinner = null;
		}
		id++;
		return vinner;
	}

}
