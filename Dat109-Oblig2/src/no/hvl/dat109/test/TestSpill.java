package no.hvl.dat109.test;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import no.hvl.dat109.TerningSpill.Kopp;
import no.hvl.dat109.TerningSpill.Terning;
import no.hvl.dat109.util.Konstanter;

public class TestSpill {

	/**
	 * Tester om terning er innenfor parameterne gitt
	 */
	@Test
	public void testTerning() {
		Terning t = new Terning(0);
		List<Integer> res = new ArrayList<Integer>();
		for (int i = 0; i < 1000; i++) {
			t.trill();
			res.add(t.getVerdi());
		}
		assertTrue(res.stream().mapToInt(s -> s).max().getAsInt() < (Konstanter.TERNINGSTYPE + 1));

	}

	@Test
	public void testKopp() {
		Kopp k = new Kopp(1);
		List<Integer> res = new ArrayList<Integer>();
		for (int i = 0; i < 1000; i++) {
			k.trill();
			res.add(k.getSum());
		}
		int storsteSum = res.stream().mapToInt(s -> s).max().getAsInt();
		int minsteSum = res.stream().mapToInt(s -> s).min().getAsInt();
		assertTrue(storsteSum < Konstanter.ANTALLTERNINGER * Konstanter.TERNINGSTYPE + 1);
		assertTrue(minsteSum > Konstanter.ANTALLTERNINGER - 1);

	}

}
