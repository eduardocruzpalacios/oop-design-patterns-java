package behavioral.chainofresponsibility.client;

import behavioral.chainofresponsibility.handlers.Grant;
import behavioral.chainofresponsibility.handlers.Grant1;
import behavioral.chainofresponsibility.handlers.Grant2;
import behavioral.chainofresponsibility.handlers.Grant3;

public class ChainOfResponsibility {

	public static Grant doChaining() {
		Grant grant1 = new Grant1(Grant.USER);
		Grant grant2 = new Grant2(Grant.ADMIN);
		grant1.setNextGrant(grant2);
		Grant grant3 = new Grant3(Grant.ADMIN);
		grant2.setNextGrant(grant3);
		return grant1;
	}

}
