package no.hvl.dat109.TerningSpill;

public class Spiller {
	private String navn; 
	private int verdi;
	public Spiller(String navn) {
		this.navn=navn;
		verdi=0;
	}
	public void spill(Kopp kopp) {
		// TODO Auto-generated method stub
		kopp.trill();
		verdi=kopp.getSum();
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
	public int compareTo(Spiller andreSpiller) {
        return (this.getVerdi() - andreSpiller.getVerdi());
    }

}
