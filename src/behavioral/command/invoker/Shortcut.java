package behavioral.command.invoker;

import behavioral.command.command.Command;

public class Shortcut {

	private Command command;

	public Shortcut() {
	}

	public Shortcut(Command command) {
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
