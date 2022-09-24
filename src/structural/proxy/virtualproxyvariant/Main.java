package structural.proxy.virtualproxyvariant;

import structural.proxy.virtualproxyvariant.model.HtmlDocument;
import structural.proxy.virtualproxyvariant.proxy.WebpageProxy;
import structural.proxy.virtualproxyvariant.subject.WebpageService;

public class Main {

	public static void main(String[] args) {

		// initialize proxy
		WebpageService webpageService = new WebpageProxy();

		// initialize proxy dependencies
		String url = "www.helloworld.com";

		// expensive query as Proxy redirects it to RealSubject and catches it
		HtmlDocument webpage1 = webpageService.requestWebpage(url);
		System.out.println(webpage1);

		// cheap query as Proxy serves catched and RealSubject is not called
		HtmlDocument webpage2 = webpageService.requestWebpage(url);
		System.out.println(webpage2);

	}

}
