package structural.bridge.implementations;

public class Door implements Device {

	private boolean isOpen;

	public Door() {
	}

	public Door(boolean isOpen) {
		this.isOpen = isOpen;
	}

	public boolean isOpen() {
		return isOpen;
	}

	public void setOpen(boolean isOpen) {
		this.isOpen = isOpen;
	}

	@Override
	public String toString() {
		return "Door [isOpen=" + isOpen + "]";
	}

	@Override
	public void execute(String command) {
		switch (command) {
		case "open":
			this.setOpen(true);
			break;
		case "close":
			this.setOpen(false);
			break;
		default:
			System.out.println("Unknown command");
			break;
		}
	}

}
