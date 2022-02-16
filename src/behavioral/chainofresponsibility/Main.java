package behavioral.chainofresponsibility;

import behavioral.chainofresponsibility.client.ChainOfResponsability;
import behavioral.chainofresponsibility.handlers.Grant;

public class Main {

	public static void main(String[] args) {

		// build chain which return Grant1 instance
		Grant chainGrant = ChainOfResponsability.doChaining();

		// chain receives a request (getGranInfo()) and what must be handled (int)

		/*
		 * Grant1 only calls printGrant() in getGranInfo(...) because the request is not
		 * passed to the next handler
		 */
		System.out.println("***** 1st asking for grants\n");
		chainGrant.getGrantInfo(1);

		// Grant1 calls printGrant() in getGranInfo(...) and pass the int to nextGrant
		System.out.println("\n***** 2nd asking for grants\n");
		chainGrant.getGrantInfo(2);

		/*
		 * Grant1 calls printGrant() in getGranInfo(...) and pass the int to nextGrant.
		 * This does the same. This only calls printGrant() in getGranInfo(...)
		 */
		System.out.println("\n***** 3rd asking for grants\n");
		chainGrant.getGrantInfo(3);

	}

}
