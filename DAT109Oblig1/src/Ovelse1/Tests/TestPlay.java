package Ovelse1.Tests;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

import Ovelse1.Classes.Brett;
import Ovelse1.Classes.Rute;

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
