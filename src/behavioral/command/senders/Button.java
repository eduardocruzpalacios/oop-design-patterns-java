package behavioral.command.senders;

import behavioral.command.commands.Command;

public class Button {

	/*
	 * Sender class (aka invoker) is responsible for initiating requests.
	 * 
	 * This class must have a field for storing a reference to a command object. The
	 * sender triggers that command instead of sending the request directly to the
	 * receiver.
	 * 
	 * The sender is not responsible for creating the command object. Instead, it
	 * gets a pre-created command
	 */

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
