package no.hvl.dat109.test;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import no.hvl.dat109.TerningSpill.Kopp;
import no.hvl.dat109.TerningSpill.Terning;
import no.hvl.dat109.util.Konstanter;
/**
 * Testklasse
 * 
 * @author Gruppe 13
 *
 */
public class TestSpill {

	/**
	 * Tester om terning er innenfor parameterne gitt
	 */
	@Test
	public void testTerning() {
		Terning t = new Terning();
		List<Integer> res = new ArrayList<Integer>();
		for (int i = 0; i < 1000; i++) {
			t.trill();
			res.add(t.getVerdi());
		}
		int max = res.stream().mapToInt(s -> s).max().getAsInt();
		int min = res.stream().mapToInt(s -> s).min().getAsInt();

		assertTrue(max < (Konstanter.TERNINGSTYPE + 1));
		assertTrue(min > 0);
	}

	@Test
	public void testKopp() {
		Kopp k = new Kopp();
		List<Integer> res = new ArrayList<Integer>();
		for (int i = 0; i < 1000; i++) {
			k.trill();
			res.add(k.getSum());
		}
		int max = res.stream().mapToInt(s -> s).max().getAsInt();
		int min = res.stream().mapToInt(s -> s).min().getAsInt();
		assertTrue(max < Konstanter.ANTALLTERNINGER * Konstanter.TERNINGSTYPE + 1);
		assertTrue(min > Konstanter.ANTALLTERNINGER - 1);
	}

}
