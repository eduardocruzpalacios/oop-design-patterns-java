package behavioral.command.invoker;

import behavioral.command.command.Command;

public class Button {

	private Command command;

	public Button() {
	}

	public Button(Command command) {
		this.command = command;
	}

	public Command getCommand() {
		return this.command;
	}

	public void setCommand(Command command) {
		this.command = command;
	}

	public void click() {
		this.command.execute();
	}

}
