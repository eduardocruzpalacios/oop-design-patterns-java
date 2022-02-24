package behavioral.command.receiver;

import behavioral.command.commands.Command;
import behavioral.command.commands.CopyCommand;
import behavioral.command.sender.Button;
import behavioral.command.sender.ShortCut;

public class Gui {

	/*
	 * The Receiver class contains some business logic.
	 * 
	 * Most commands only handle the details of how a request is passed to the
	 * receiver, while the receiver itself does the actual work.
	 */

	// concrete commands which use the receiver instance
	private Command copyCommand = new CopyCommand(this);

	/*
	 * Gui triggers which receive the commands (many triggers can use the same
	 * Command
	 */
	private Button copyButton = new Button(copyCommand);
	private ShortCut controlCShurtCut = new ShortCut(copyCommand);

	// properties handled by commands
	private String textSelected;
	private String clipboard;

	public String getTextSelected() {
		return textSelected;
	}

	public void setTextSelected(String textSelected) {
		this.textSelected = textSelected;
	}

	public String getClipboard() {
		return clipboard;
	}

	public void setClipboard(String clipboard) {
		this.clipboard = clipboard;
	}

	// actions done by Gui by specified by handlers
	public void clickOnCopyButton() {
		this.copyButton.click();
	}

	public void pressControlC() {
		this.controlCShurtCut.press();
	}

}
