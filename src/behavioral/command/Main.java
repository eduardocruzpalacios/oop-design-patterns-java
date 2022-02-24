package behavioral.command;

import behavioral.command.receiver.Gui;

public class Main {

	public static void main(String[] args) {

		Gui gui = new Gui();

		/*
		 * select a random text, click copy button and print the clipboard
		 */
		gui.setTextSelected("this text has been selected");
		gui.clickOnCopyButton();
		System.out.println("text in clipboard = " + gui.getClipboard());

		/*
		 * select another text, press ctrl+c and print the clipboard
		 */
		gui.setTextSelected("a new piece of text has been selected");
		gui.pressControlC();
		System.out.println("text in clipboard = " + gui.getClipboard());

	}

}
