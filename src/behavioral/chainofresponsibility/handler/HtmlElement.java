package behavioral.chainofresponsibility.handler;

import behavioral.chainofresponsibility.model.AnyRequest;

public abstract class HtmlElement {

	private HtmlElement htmlElementSuccessor;

	public HtmlElement(HtmlElement htmlElementSuccessor) {
		this.htmlElementSuccessor = htmlElementSuccessor;
	}

	public void handleRequest(AnyRequest request) {
		if (canHandle()) {
			processRequest(request);
		} else {
			this.htmlElementSuccessor.handleRequest(request);
		}
	}

	protected abstract boolean canHandle();

	protected abstract void processRequest(AnyRequest request);

}
