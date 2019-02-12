package no.hvl.dat109.TerningSpill;

import java.util.ArrayList;
import java.util.List;

import no.hvl.dat109.util.Konstanter;

/**
 * Kopp objektet, brukes til å kaste og ta vare på terningene.
 * 
 * @author Gruppe
 *
 */
public class Kopp {
	private List<Terning> terninger = new ArrayList<Terning>();
	private int sum;
	private int id;

	/**
	 * Konstruktør
	 * 
	 * @param id
	 *            for kopp.
	 */
	public Kopp(int id) {
		for (int i = 0; i < Konstanter.ANTALLTERNINGER; i++) {
			terninger.add(new Terning(id + i));
		}
		int sum = 0;
		this.id = id;
	}

	/**
	 * Kaster alle terningene som skal brukes.
	 * 
	 */
	public void trill() {
		terninger.forEach(t -> t.trill());
	}

	/**
	 * Sjekker verdi på vær terning og summerer disse
	 * 
	 * @return sum av alle terninger i koppen.
	 */
	public int getSum() {
		sum = terninger.stream().mapToInt(t -> t.getVerdi()).sum();
		return sum;
	}
}
