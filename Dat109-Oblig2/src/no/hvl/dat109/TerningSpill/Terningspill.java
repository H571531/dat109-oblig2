/**
 * 
 */
package no.hvl.dat109.TerningSpill;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Adrian
 *
 */
public class Terningspill {
	int id;
	List<Spiller> spillere;
	Kopp kopp;
	

public Terningspill(int id) {
	spillere=new ArrayList<Spiller>();
	this.id=id;
	kopp=new Kopp(id*10);
}

public void leggTilSpiller(String navn) {
	spillere.add(new Spiller(navn));
}

public Spiller spill() {
	Spiller vinner;
	if(spillere.size()>1) {
		spillere.forEach(s->s.spill(kopp));
		vinner=spillere.stream().max((a,b)->a.getVerdi()-b.getVerdi()).get();
	}else if(spillere.size()==1) {
		vinner=spillere.get(0);
	}else {
		vinner=null;
	}
	id++;
	return vinner;
}

}
