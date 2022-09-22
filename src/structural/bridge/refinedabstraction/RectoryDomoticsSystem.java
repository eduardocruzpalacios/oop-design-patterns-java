package structural.bridge.refinedabstraction;

import structural.bridge.abstraction.DomoticsSystem;
import structural.bridge.concreteimplementor.InnerDoor;
import structural.bridge.view.DataForm;

public class RectoryDomoticsSystem extends DomoticsSystem {

	private String password = "2022";
	private String device = "BQ";

	@Override
	public void openDoor() {
		if (this.door instanceof InnerDoor) {
			this.door.open();
		} else {
			String userInput = DataForm.getString("What is the password?");
			if (userInput.equals(this.password)) {
				String userDevice = DataForm.getString("2-Factor Authentication");
				if (userDevice.equals(this.device)) {
					this.door.open();
				} else {
					System.out.println("Wrong device");
				}
			} else {
				System.out.println("Wrong password");
			}
		}
	}

}
