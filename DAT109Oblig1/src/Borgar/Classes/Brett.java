package Borgar.Classes;

import java.util.ArrayList;
import java.util.List;

public class Brett {

	private Rute[] ruter = new Rute[100];

	public Brett() {
		createRoutes();

	}

	private void createRoutes() {
		for (int i = 0; i < 100; i++) {
			ruter[i] = new Rute(i);
		}
		ruter[2].setJumpTo(ruter[7]);
		ruter[22].setJumpTo(ruter[5]);
		ruter[11].setJumpTo(ruter[78]);
		ruter[79].setJumpTo(ruter[57]);
		ruter[80].setJumpTo(ruter[48]);
		

	}

	public Rute getStartRute() {
		return this.ruter[0];
	}

	public Rute nyPlassering(Rute rute, int antallRute) {
		if (rute.getRuteNr() + antallRute > 99) {
			return rute;
		} else {
			return ruter[rute.getRuteNr() + antallRute];
		}
	}

	
	
}
