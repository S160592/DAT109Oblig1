package Borgar.Classes;
/**
 * 
 * @author Borgar Frøysland Grande
 *
 */
public class Brikke {
	
	private int brikkeNr;
	private Rute plass;
	
	public Brikke(Rute startRute) {
		this.plass = startRute;
	}
	
	
	public Rute getPlass() {
		return this.plass;
	}
	public void setPlass(Rute plass) {
		this.plass = plass;
	}

}
