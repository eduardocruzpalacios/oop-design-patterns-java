package structural.facade.client;

import structural.facade.subsystem.VideoGame;

public class AnyVideoGame implements VideoGame {

	@Override
	public void play() {
		openningStuff();
		mainMenu();
	}

	private void openningStuff() {
		System.out.println("OPENING STUFF");
	}

	private void mainMenu() {
		System.out.println("MAIN MENU");
	}

}
