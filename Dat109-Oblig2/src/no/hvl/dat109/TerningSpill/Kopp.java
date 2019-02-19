package no.hvl.dat109.TerningSpill;

import java.util.ArrayList;
import java.util.List;

import no.hvl.dat109.grensesnitt.TerningInterface;
import no.hvl.dat109.grensesnitt.KoppInterface;
import no.hvl.dat109.util.Konstanter;

/**
 * Kopp objektet, brukes til å kaste og ta vare på terningene.
 * 
 * @author Gruppe 13
 *
 */
public class Kopp implements KoppInterface {
	private List<TerningInterface> terninger = new ArrayList<TerningInterface>();

	private int sum;
	private int id;

	/**
	 * Konstruktør
	 * 
	 */
	public Kopp() {
		for (int i = 0; i < Konstanter.ANTALLTERNINGER; i++) {
			terninger.add(new Terning());
		}
		sum = 0;
		this.id = Konstanter.koppId++;
	}

	/**
	 * Kaster alle terningene som skal brukes.
	 * 
	 */
	public void trill() {
		terninger.forEach(t -> t.trill());
	}

	/**
	 * Sjekker verdi på hver terning og summerer disse
	 * 
	 * @return sum av alle terninger i koppen.
	 */
	public int getSum() {
		sum = terninger.stream().mapToInt(t -> t.getVerdi()).sum();
		return sum;
	}
}
