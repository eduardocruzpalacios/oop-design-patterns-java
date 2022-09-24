package structural.facade.subsystem;

public class DiskReader {

	private boolean open;

	public DiskReader() {
	}

	public boolean isOpen() {
		return this.open;
	}

	public void operate() {
		this.open = !this.open;
	}

}
