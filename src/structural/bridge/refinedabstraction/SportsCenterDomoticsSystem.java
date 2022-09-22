package structural.bridge.refinedabstraction;

import structural.bridge.abstraction.DomoticsSystem;
import structural.bridge.concreteimplementor.InnerDoor;
import structural.bridge.view.DataForm;

public class SportsCenterDomoticsSystem extends DomoticsSystem {

	private String password = "2022";

	@Override
	public void openDoor() {
		if (this.door instanceof InnerDoor) {
			this.door.open();
		} else {
			String userInput = DataForm.getString("What is the password?");
			if (userInput.equals(this.password)) {
				this.door.open();
			} else {
				System.out.println("Wrong password");
			}
		}
	}

}
