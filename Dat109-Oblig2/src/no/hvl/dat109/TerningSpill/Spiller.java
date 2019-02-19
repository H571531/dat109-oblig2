package no.hvl.dat109.TerningSpill;

/**
 * Spiller objektet.
 * 
 * @author Gruppe 13
 *
 */
public class Spiller {
	private String navn;
	private int verdi;

	/**
	 * Konstrukt�r
	 * 
	 * @param navn
	 *            p� spiller
	 */
	public Spiller(String navn) {
		this.navn = navn;
		verdi = 0;
	}

	/**
	 * Starter koppen og tar vare p� verdiene
	 * 
	 * @param kopp
	 *            som skal spilles med.
	 */
	public void spill(Kopp kopp) {
		// TODO Auto-generated method stub
		kopp.trill();
		verdi = kopp.getSum();
	}

	public String getNavn() {
		return navn;
	}

	public void setNavn(String navn) {
		this.navn = navn;
	}

	public int getVerdi() {
		return verdi;
	}

	public void setVerdi(int verdi) {
		this.verdi = verdi;
	}

}
