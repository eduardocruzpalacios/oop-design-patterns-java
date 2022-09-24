package structural.proxy.virtualproxyvariant.realsubject;

import structural.proxy.virtualproxyvariant.model.HtmlDocument;
import structural.proxy.virtualproxyvariant.subject.WebpageService;

public class Webpage implements WebpageService {

	@Override
	public HtmlDocument requestWebpage(String url) {
		// let's suppose we are making a query to a external source
		return new HtmlDocument("<h1>Hello world</h1>", "h1 {color: 'red';}", "console.log('hello world');");
	}

}
