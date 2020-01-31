package Borgar.main;

import java.util.ArrayList;

import Borgar.Classes.Brikke;
import Borgar.Classes.SnakesAndLaddersGame;
import Borgar.Classes.Spelar;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Spelar borgar = new Spelar("Borgar");

		Spelar jonas = new Spelar("Jonas");

		Spelar didrik = new Spelar("Didrik");
		

		SnakesAndLaddersGame game = new SnakesAndLaddersGame();
		game.addPlayer(borgar);
		game.addPlayer(jonas);
		game.addPlayer(didrik);
		game.start();
		
	}

}
