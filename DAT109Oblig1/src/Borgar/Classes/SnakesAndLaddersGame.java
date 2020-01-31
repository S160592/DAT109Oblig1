package Borgar.Classes;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Borgar Frøysland Grande
 *
 */

public class SnakesAndLaddersGame {

	private List<Spelar> spelarar;
	private Brett brett;
	private Spelar vinner;

	/**
	 * 
	 * @param spelarar, list of the players. Min 2, max 4.
	 */
	public SnakesAndLaddersGame() {
		this.spelarar = new ArrayList<Spelar>();
		this.brett = new Brett();
	}

	/**
	 * @param spelar, add a player to the game. The Spelar will get the Brett-object
	 */
	public boolean addPlayer(Spelar spelar) {
		if (spelarar.size() > 4) {
			return false;
		} else {
			spelarar.add(spelar);
			spelar.setBrett(this.brett);
			return true;
		}
	}

	public void start() {
		Spelar nextPlayer = spelarar.get(0);
		int teller = 0;
		while (vinner == null) {
			System.out.println("next player is: " + nextPlayer.getNavn());
			nextPlayer.spillTur();
			if(nextPlayer.isVinner()) {
				vinner = nextPlayer;
				System.out.println("Winner is : " + nextPlayer.getNavn());
				break;
			}
			teller ++;
			System.out.println("Teller : " + teller);
			nextPlayer = spelarar.get(teller % 3);
		
		}
	}

}
