package no.hvl.dat109.klient;

import java.util.ArrayList;
import java.util.List;

import no.hvl.dat109.TerningSpill.Spiller;
import no.hvl.dat109.TerningSpill.Terningspill;

public class Klient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <String> spillere = new ArrayList<String>();
		Terningspill spill=new Terningspill(0);
		Ui ui=new Ui();
		boolean ferdig=false;
		Spiller vinner;
		String vinnerSetning;
		
		spillere=ui.setUpDeltakere();
		spillere.forEach(s->spill.leggTilSpiller(s));
		
		while(!ferdig){
			
		vinner=spill.spill();
		if(!(vinner==null)) {
			vinnerSetning=vinner.getNavn()+" vant med "+vinner.getVerdi()+" poeng!";
		}else {
			vinnerSetning="Ingen spillere.";
		}
		ui.visVinner(vinnerSetning);
		System.out.println(ferdig);
		ferdig=ui.spilleIgjen();
		System.out.println(ferdig);
		
		}
	}

}
