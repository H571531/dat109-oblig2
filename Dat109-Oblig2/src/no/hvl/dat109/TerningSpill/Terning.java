package no.hvl.dat109.TerningSpill;

import java.util.Random;

import no.hvl.dat109.grensesnitt.TerningInterface;
import no.hvl.dat109.util.Konstanter;

/**
 * Terning objekt. Kastes og tar vare p� sin verdi.
 * 
 * @author Gruppe 13
 *
 */
public class Terning implements TerningInterface {
	private int id;
	private int verdi;
	private Random random;

	/**
	 * Konstrukt�r
	 * 
	 * @param id
	 *            p� terning
	 */
	public Terning() {
		this.id = Konstanter.terningId++;
		verdi = 0;
		random = new Random();
	}

	/**
	 * Triller terning og lagrer verdien
	 * 
	 */
	public void trill() {
		verdi = roll(Konstanter.TERNINGSTYPE);
	}

	/**
	 * Hjelpemetode for trilling
	 * 
	 * @param terningstype
	 *            i tilfelle man vil ha andre typer
	 * @return returnerer tilfeldig verdi i ternings typen
	 */
	private int roll(int tType) {
		int answer = random.nextInt(tType) + 1;
		return answer;
	}

	public int getVerdi() {
		return verdi;
	}

	public void setVerdi(int verdi) {
		this.verdi = verdi;
	}
}
