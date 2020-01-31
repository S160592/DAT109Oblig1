package Borgar.Classes;

public class Spelar {

	private String navn;
	private Brikke brikke;
	private Brett brett;
	private Boolean vinner;
	
	
	public Spelar(String navn) {
		this.navn = navn;
		this.vinner = false;
		
	}

	public void setBrett(Brett brett) {
		this.brett = brett;
		this.brikke = new Brikke(brett.getStartRute());
	}
	
	public String getNavn() {
		return this.navn;
	}
	
	public void spillTur() {
		Terning terning = new Terning();
		terning.trill();
		System.err.println(this.navn + " triller : " + terning.getVerdi());
		System.out.println(this.navn + " stod på plass " + brikke.getPlass().getRuteNr());
		
		brikke.setPlass(brett.nyPlassering(this.brikke.getPlass(), terning.getVerdi()));	
		System.out.println(this.navn + " flytta til plass " + brikke.getPlass().getRuteNr());
		if(brikke.getPlass().getRuteNr() == 99) {
			this.vinner = true;
		}
	}
	
	public Boolean isVinner() {
		return this.vinner;
	}

}
