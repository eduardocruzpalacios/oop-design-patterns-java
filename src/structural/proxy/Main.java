package structural.proxy;

import structural.proxy.model.HttpRequest;
import structural.proxy.model.Webpage;
import structural.proxy.proxy.CachedHttpServiceImpl;
import structural.proxy.service.HttpService;

public class Main {

	public static void main(String[] args) {

		// initialize proxy
		HttpService cachedHttpServiceImpl = new CachedHttpServiceImpl();

		// initialize a model class used by service-intended class (HttpServiceImpl)
		HttpRequest httpRequest = new HttpRequest("www.helloworld.com");

		/*
		 * use the interface's method implemented by both the service-intended class and
		 * the proxy, by calling the proxy instance.
		 * 
		 * First, the proxy searches for a cached returned object (Webpage instance).
		 * 
		 * In the 1st call there is not any cached object, so the service-intended class
		 * method is called (see requestWebpage method of CachedHttpServiceImpl class),
		 * the returned object is put in the cache-intended data structure, and this
		 * object is returned by the proxy method.
		 * 
		 * In the 2nd call there is the right cached object, so it is returned by the
		 * proxy method after having found it the cache-intended data structure.
		 * 
		 * As the url is used as key of the data structure for Webpage cached instances,
		 * every single HttpRequest with an url not present as key in this data
		 * structure is going to make a call to the service and put the returned value
		 * in this data structure for future callings.
		 */

		Webpage webpage1 = cachedHttpServiceImpl.requestWebpage(httpRequest);
		System.out.println(webpage1);

		Webpage webpage2 = cachedHttpServiceImpl.requestWebpage(httpRequest);
		System.out.println(webpage2);

	}

}
