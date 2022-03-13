package structural.proxy.model;

public class HttpRequest {

	private String url;

	public HttpRequest() {
	}

	public HttpRequest(String url) {
		this.url = url;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Override
	public String toString() {
		return "HttpRequest [url=" + url + "]";
	}

}
