package Borgar.Tests;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

import Borgar.Classes.Brett;
import Borgar.Classes.Rute;

class TestPlay {

	Brett brett = new Brett();

	@Test
	void testMove() {

		
		// Følger ruta oppover, og følg slangen tilbake til start.
		Rute rute = brett.nyPlassering(brett.getStartRute(), 4);
		rute = brett.nyPlassering(rute, 40);
		rute = brett.nyPlassering(rute, 4);
		rute = rute.jumpTo();
		assertTrue(rute.equals(brett.getStartRute()));
		
		
		
	}

}
