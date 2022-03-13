package structural.bridge.refinedabstractions;

import structural.bridge.abstraction.DomoticHouseControl;

public class SecurityFeature extends DomoticHouseControl {

	private String secretCode = "2022";

	public void executeSafed(String command, String deviceKey, String password) {
		if (password.equals(this.secretCode)) {
			super.execute(command, deviceKey);
		} else {
			System.out.println("Wrong password, you cannot access");
		}
	}

}
