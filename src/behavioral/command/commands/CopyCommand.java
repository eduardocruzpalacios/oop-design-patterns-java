package behavioral.command.commands;

import behavioral.command.receiver.Gui;

public class CopyCommand extends Command {

	public CopyCommand(Gui gui) {
		super(gui);
	}

	@Override
	public void execute() {
		this.gui.setClipboard(this.gui.getTextSelected());
	}

}
