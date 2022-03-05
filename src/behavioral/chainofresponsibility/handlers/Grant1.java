package behavioral.chainofresponsibility.handlers;

public class Grant1 extends Grant {

	public Grant1(int grantId) {
		this.grantLevel = grantId;
	}

	@Override
	protected void printGrant() {
		System.out.println("You can read");
	}
}
