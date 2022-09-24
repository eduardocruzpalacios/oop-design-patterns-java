package structural.facade.subsystem;

import structural.facade.facade.VideoGamesConsole;

public class VideoGamesConsoleImpl implements VideoGamesConsole {

	private boolean on;
	private DiskReader diskReader;
	private VideoGame videoGame;

	public VideoGamesConsoleImpl() {
		this.diskReader = new DiskReader();
	}

	@Override
	public void setVideoGame(VideoGame videoGame) {
		if (this.diskReader.isOpen()) {
			System.out.println("DiskReader on, so VideoGame loaded");
			this.videoGame = videoGame;
		} else {
			System.err.println("open DiskReader before setting VideoGame!");
		}
	}

	@Override
	public void callDiskReader() {
		this.diskReader.operate();
		System.out.println("DiskReader called. Is diskReader open now? " + diskReader.isOpen());
	}

	@Override
	public void switchOnOff() {
		this.on = !this.on;
		if (this.on) {
			System.out.println("on now");
			if (this.videoGame == null) {
				System.err.println("on without game, insert one, VideoGamesConsole off now");
				this.on = false;
			} else {
				if (this.diskReader.isOpen()) {
					System.err.println("DiskReader open, please close it, VideoGamesConsole off now");
					this.on = false;
				} else {
					System.out.println("on with game, so play");
					this.videoGame.play();
				}
			}
		} else {
			System.out.println("off now");
		}
	}

}
