package behavioral.chainofresponsibility.concretehandler;

import behavioral.chainofresponsibility.handler.HtmlElement;
import behavioral.chainofresponsibility.model.AnyRequest;

public class DivHtmlElement extends HtmlElement {

	public DivHtmlElement(HtmlElement htmlElementSuccessor) {
		super(htmlElementSuccessor);
	}

	@Override
	protected boolean canHandle() {
		double random = Math.random();
		return random <= 0.5;
	}

	@Override
	protected void processRequest(AnyRequest request) {
		System.out.println(request + " processed by div element");
	}

}
