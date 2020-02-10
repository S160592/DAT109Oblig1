package Borgar.Classes;

public class Snake extends Rute {

	/**
	 * Constructor. Creates a snakes that goes from one Rute to a lower Rute.
	 * @param ruteNr
	 * @param next
	 */
	public Snake(int ruteNr, Rute next) {
		super(ruteNr);
		this.jumpTo = next;
	}

}
