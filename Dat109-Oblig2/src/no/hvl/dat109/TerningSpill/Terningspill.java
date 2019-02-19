/**
 * 
 */
package no.hvl.dat109.TerningSpill;

import java.util.ArrayList;
import java.util.List;

import no.hvl.dat109.grensesnitt.KoppInterface;
import no.hvl.dat109.util.Konstanter;

/**
 * Terningspill Kontroller for spillet
 * 
 * @author Gruppe 13
 *
 */
public class Terningspill {
	int id;
	List<Spiller> spillere;
	KoppInterface kopp;

	/**
	 * Konstruktør
	 * 
	 */
	public Terningspill() {
		spillere = new ArrayList<Spiller>();
		this.id = Konstanter.spillId++;
		kopp = new Kopp();
	}

	/**
	 * Legger til en spiller
	 * 
	 * @param navn på spilleren
	 */
	public void leggTilSpiller(String navn) {
		spillere.add(new Spiller(navn));
	}

	/**
	 * Starter spillet med spillerne som er lagt til.
	 * Håndterer ikke hvis flere spillere har samme verdi, siden dette ikke er definert i modellen.
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
