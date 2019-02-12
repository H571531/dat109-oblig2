package no.hvl.dat109.TerningSpill;

import java.util.Random;

import no.hvl.dat109.util.Konstanter;

/**
 * Terning objekt. Kastes og tar vare på sin verdi.
 * 
 * @author Gruppe
 *
 */
public class Terning {
	private int id;
	private int verdi;

	/**
	 * Konstruktør
	 * 
	 * @param id
	 *            på terning
	 */
	public Terning(int id) {
		this.id = id;
		verdi = 0;
	}

	/**
	 * Triller terning og lagrer verdien
	 * 
	 */
	public void trill() {
		verdi = roll(Konstanter.TERNINGSTYPE);
	}

	/**
	 * Hjelpe klasse for trilling
	 * 
	 * @param ternings
	 *            type i tilfelle man vil ha andre typer
	 * @return returnerer tilfeldig verdi i ternings typen
	 */
	private int roll(int tType) {
		Random rn = new Random();
		int answer = rn.nextInt(tType) + 1;
		return answer;
	}

	public int getVerdi() {
		return verdi;
	}

	public void setVerdi(int verdi) {
		this.verdi = verdi;
	}
}
