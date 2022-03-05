package behavioral.chainofresponsibility.handlers;

public class Grant3 extends Grant {

	public Grant3(int grantId) {
		this.grantLevel = grantId;
	}

	@Override
	protected void printGrant() {
		System.out.println("You can hack the system");
	}
}
