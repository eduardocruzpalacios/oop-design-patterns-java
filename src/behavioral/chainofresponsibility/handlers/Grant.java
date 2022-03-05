package behavioral.chainofresponsibility.handlers;

public abstract class Grant {

	final public static int USER = 1;
	final public static int ADMIN = 2;
	final public static int ROOT = 3;

	protected int grantLevel;

	protected Grant nextGrant;

	public void setNextGrant(Grant nextGrant) {
		this.nextGrant = nextGrant;
	}

	public void getGrantInfo(int grantLevel) {
		if (this.grantLevel <= grantLevel) {
			printGrant();
		}
		if (this.grantLevel < grantLevel && this.nextGrant != null) {
			this.nextGrant.getGrantInfo(grantLevel);
		}
	}

	protected abstract void printGrant();

}
