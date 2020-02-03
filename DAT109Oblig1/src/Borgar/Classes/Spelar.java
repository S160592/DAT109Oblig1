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

	public Rute getPlassering() {
		return this.brikke.getPlass();
	}

	public void spillTur() {
		Terning terning = new Terning();
		terning.trill();
		System.out.println(this.navn + " triller : " + terning.getVerdi());
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(this.navn + " stod på plass " + brikke.getPlass().getRuteNr());

		brikke.setPlass(brett.nyPlassering(this.brikke.getPlass(), terning.getVerdi()));
		System.out.println(this.navn + " flytta til plass " + brikke.getPlass().getRuteNr());
		if (brikke.getPlass().jumpTo().equals(brikke.getPlass())) {

		} else {
			brikke.setPlass(brikke.getPlass().jumpTo());
			System.out.println("jumps to : " + brikke.getPlass().getRuteNr());
		}
		if (brikke.getPlass().getRuteNr() == 99) {
			this.vinner = true;
		}
	}

	public Boolean isVinner() {
		return this.vinner;
	}

}
