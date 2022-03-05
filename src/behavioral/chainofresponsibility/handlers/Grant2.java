package behavioral.chainofresponsibility.handlers;

public class Grant2 extends Grant {

	public Grant2(int grantId) {
		this.grantLevel = grantId;
	}

	@Override
	protected void printGrant() {
		System.out.println("You can create, update and delete");
	}
}
