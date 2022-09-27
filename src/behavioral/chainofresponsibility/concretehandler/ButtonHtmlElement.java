package behavioral.chainofresponsibility.concretehandler;

import behavioral.chainofresponsibility.handler.HtmlElement;
import behavioral.chainofresponsibility.model.AnyRequest;

public class ButtonHtmlElement extends HtmlElement {

	public ButtonHtmlElement(HtmlElement htmlElementSuccessor) {
		super(htmlElementSuccessor);
	}

	@Override
	protected boolean canHandle() {
		return true;
	}

	@Override
	protected void processRequest(AnyRequest request) {
		System.out.println(request + " processed by button element");
	}

}
