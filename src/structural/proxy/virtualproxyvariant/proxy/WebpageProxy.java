package structural.proxy.virtualproxyvariant.proxy;

import java.util.HashMap;
import java.util.Map;

import structural.proxy.virtualproxyvariant.model.HtmlDocument;
import structural.proxy.virtualproxyvariant.realsubject.Webpage;
import structural.proxy.virtualproxyvariant.subject.WebpageService;

public class WebpageProxy implements WebpageService {

	private Webpage webpage = new Webpage();

	private Map<String, HtmlDocument> htmlDocuments = new HashMap<String, HtmlDocument>();

	@Override
	public HtmlDocument requestWebpage(String url) {
		HtmlDocument htmlDocument = htmlDocuments.get(url);
		if (htmlDocument == null) {
			htmlDocument = this.webpage.requestWebpage(url);
			this.htmlDocuments.put(url, htmlDocument);
			System.out.println("expensive query");
		}
		return htmlDocument;
	}

}
