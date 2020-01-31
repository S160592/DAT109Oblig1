package Borgar.Classes;

import java.util.ArrayList;
import java.util.List;

public class Brett {

	private Rute[] ruter = new Rute[100];
	public String navn;

	public Brett() {
		createRoutes();
		this.navn = "Brettet";
	}

	private void createRoutes() {
		for (int i = 0; i < 100; i++) {
			ruter[i] = new Rute(i);
		}

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
