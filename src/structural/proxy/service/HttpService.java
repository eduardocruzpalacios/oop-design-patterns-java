package structural.proxy.service;

import structural.proxy.model.HttpRequest;
import structural.proxy.model.Webpage;

public interface HttpService {

	public Webpage requestWebpage(HttpRequest httpRequest);

}
