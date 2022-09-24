package structural.facade;

import structural.facade.client.AnyVideoGame;
import structural.facade.facade.VideoGamesConsole;
import structural.facade.subsystem.VideoGame;
import structural.facade.subsystem.VideoGamesConsoleImpl;

public class Main {

	public static void main(String[] args) {

		// initialize client classes
		VideoGame videoGame = new AnyVideoGame();

		// initialize Facade
		VideoGamesConsole videoGamesConsole = new VideoGamesConsoleImpl();

		// use Facade
		videoGamesConsole.setVideoGame(videoGame);
		videoGamesConsole.switchOnOff();
		videoGamesConsole.callDiskReader();
		videoGamesConsole.setVideoGame(videoGame);
		videoGamesConsole.switchOnOff();
		videoGamesConsole.callDiskReader();
		videoGamesConsole.switchOnOff();
		videoGamesConsole.switchOnOff();

	}

}
