package structural.bridge.abstraction;

import java.util.HashMap;
import java.util.Map;

import structural.bridge.implementations.Device;

public class DomoticHouseControl {

	private Map<String, Device> devices = new HashMap<String, Device>();

	public void addDevice(String deviceKey, Device device) {
		this.devices.put(deviceKey, device);
	}

	public void execute(String command, String deviceKey) {
		this.devices.get(deviceKey).execute(command);
	}

}
