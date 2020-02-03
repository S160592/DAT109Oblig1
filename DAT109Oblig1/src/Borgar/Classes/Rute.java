package Borgar.Classes;

/**
 * 
 * @author Borgar Frøysland Grande
 *
 */

public class Rute {
	
	private int ruteNr;
	private Rute jumpTo;
	
	public Rute(int ruteNr) {
		this.ruteNr = ruteNr;
		this.jumpTo = this;
	}
	
	public int getRuteNr() {
		return this.ruteNr;
	}
	
	public Rute jumpTo() {
		return this.jumpTo;
	}
	public void setJumpTo(Rute rute) {
		this.jumpTo = rute;
	}
	
}
