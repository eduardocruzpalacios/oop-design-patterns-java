package behavioral.command.senders;

import behavioral.command.commands.Command;

public class ShortCut {

	private Command command;

	public ShortCut() {
	}

	public ShortCut(Command command) {
		this.command = command;
	}

	public Command getCommand() {
		return this.command;
	}

	public void setCommand(Command command) {
		this.command = command;
	}

	public void press() {
		this.command.execute();
	}

}
