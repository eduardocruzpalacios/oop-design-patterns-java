package behavioral.command.receiver;

import behavioral.command.command.Command;
import behavioral.command.concretecommand.CopyCommand;
import behavioral.command.invoker.Button;
import behavioral.command.invoker.Shortcut;

public class Gui {

	private Command copyCommand = new CopyCommand(this);

	private Button copyButton = new Button(copyCommand);
	private Shortcut controlCShurtCut = new Shortcut(copyCommand);

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

	public void clickOnCopyButton() {
		this.copyButton.click();
	}

	public void pressControlC() {
		this.controlCShurtCut.press();
	}

}
