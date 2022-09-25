package behavioral.command.command;

import behavioral.command.receiver.Gui;

public abstract class Command {

	protected Gui gui;

	public Command(Gui gui) {
		this.gui = gui;
	}

	public abstract void execute();

}
