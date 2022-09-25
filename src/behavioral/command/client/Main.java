package behavioral.command.client;

import behavioral.command.receiver.Gui;

public class Main {

	public static void main(String[] args) {

		Gui gui = new Gui();

		// select a random text, click copy button and print the clipboard
		gui.setTextSelected("this text has been selected");
		gui.clickOnCopyButton();
		System.out.println("text in clipboard = " + gui.getClipboard());

		// select another text, press ctrl+c and print the clipboard
		gui.setTextSelected("a new piece of text has been selected");
		gui.pressControlC();
		System.out.println("text in clipboard = " + gui.getClipboard());

		/*
		 * in case a new command is needed, the maintainer must:
		 *
		 * - Create the concrete command in command package, make them inherit abstract
		 * Command class and implement the execute() method. The maintainer might need to
		 * add new properties along this their getters and setters to make this method
		 * work
		 *
		 * - Create a new instance of the concrete command passing it the receiver
		 * instance
		 *
		 * - Create Gui triggers instances passing them this new concrete command
		 */

	}

}
