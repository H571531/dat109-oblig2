package no.hvl.dat109.TerningSpill;

import java.util.ArrayList;
import java.util.List;

import no.hvl.dat109.util.Konstanter;

public class Kopp {
	private List <Terning> terninger=new ArrayList<Terning>();
	private int sum;
	private int id;
	public Kopp(int id) {
		for(int i=0; i<Konstanter.ANTALLTERNINGER; i++) {
			terninger.add(new Terning(id+i));	
		}
		int sum=0;
		this.id=id;
	}
	
	public void trill() {
		terninger.forEach(t->t.trill());
	}
	
	public int getSum() {
		sum=terninger.stream().mapToInt(t->t.getVerdi()).sum();
		return sum;
	}
}
