package Ovelse1.Classes;

public class Ladder extends Rute {

	/**
	 * Constructor. Creates a Ladder, that goes from one Rute to another. 
	 * @param ruteNr
	 * @param next
	 */
	public Ladder(int ruteNr, Rute next) {
		super(ruteNr);
		this.jumpTo = next;
	}

}
