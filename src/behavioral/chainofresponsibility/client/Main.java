package behavioral.chainofresponsibility.client;

import behavioral.chainofresponsibility.concretehandler.ButtonHtmlElement;
import behavioral.chainofresponsibility.concretehandler.DivHtmlElement;
import behavioral.chainofresponsibility.handler.HtmlElement;
import behavioral.chainofresponsibility.model.AnyRequest;

public class Main {

	public static void main(String[] args) {

		// chain
		HtmlElement button = new ButtonHtmlElement(null);
		HtmlElement div = new DivHtmlElement(button);

		// handle request
		AnyRequest anyRequest = new AnyRequest();

		div.handleRequest(anyRequest);

	}

}
