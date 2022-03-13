package structural.proxy.service;

import structural.proxy.model.HttpRequest;
import structural.proxy.model.Webpage;

public class HttpServiceImpl implements HttpService {

	@Override
	public Webpage requestWebpage(HttpRequest httpRequest) {
		// let's suppose we are making a query to a external source
		return new Webpage("<h1>Hello world</h1>", "h1 {color: 'red';}", "console.log('hello world');");
	}

}
