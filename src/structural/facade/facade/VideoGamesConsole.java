package structural.facade.facade;

import structural.facade.subsystem.VideoGame;

public interface VideoGamesConsole {

	void setVideoGame(VideoGame videoGame);

	void callDiskReader();

	void switchOnOff();

}