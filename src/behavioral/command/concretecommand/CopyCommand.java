package behavioral.command.concretecommand;

import behavioral.command.command.Command;
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
