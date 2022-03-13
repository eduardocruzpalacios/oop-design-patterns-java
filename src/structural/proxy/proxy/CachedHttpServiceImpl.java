package structural.proxy.proxy;

import java.util.HashMap;
import java.util.Map;

import structural.proxy.model.HttpRequest;
import structural.proxy.model.Webpage;
import structural.proxy.service.HttpService;
import structural.proxy.service.HttpServiceImpl;

public class CachedHttpServiceImpl implements HttpService {

	private HttpServiceImpl httpServiceImpl = new HttpServiceImpl();

	private Map<String, Webpage> cache = new HashMap<String, Webpage>();

	@Override
	public Webpage requestWebpage(HttpRequest httpRequest) {
		Webpage webpage = cache.get(httpRequest.getUrl());
		if (webpage == null) {
			webpage = this.httpServiceImpl.requestWebpage(httpRequest);
			this.cache.put(httpRequest.getUrl(), webpage);
			System.out.println("expensive query");
		}
		return webpage;
	}

}
