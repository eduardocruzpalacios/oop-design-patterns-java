package behavioral.command.client;

import behavioral.command.receiver.Gui;

public class Main {

	public static void main(String[] args) {

		Gui gui = new Gui();

		gui.setTextSelected("this text has been selected");
		gui.clickOnCopyButton();
		System.out.println("text in clipboard = " + gui.getClipboard());

		gui.setTextSelected("a new piece of text has been selected");
		gui.pressControlC();
		System.out.println("text in clipboard = " + gui.getClipboard());

	}

}
