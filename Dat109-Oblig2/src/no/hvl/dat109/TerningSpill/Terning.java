package no.hvl.dat109.TerningSpill;

import java.util.Random;

import no.hvl.dat109.util.Konstanter;

public class Terning {
private int id;
private int verdi;

	public Terning(int id) {
		this.id=id;
		verdi=0;
	}

	public void trill() {
		verdi=roll(Konstanter.TERNINGSTYPE);
	}
	
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
