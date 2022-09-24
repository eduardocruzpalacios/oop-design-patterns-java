package structural.proxy.virtualproxyvariant.model;

public class HtmlDocument {

	private String html;
	private String css;
	private String js;

	public HtmlDocument() {
	}

	public HtmlDocument(String html, String css, String js) {
		this.html = html;
		this.css = css;
		this.js = js;
	}

	public String getHtml() {
		return html;
	}

	public void setHtml(String html) {
		this.html = html;
	}

	public String getCss() {
		return css;
	}

	public void setCss(String css) {
		this.css = css;
	}

	public String getJs() {
		return js;
	}

	public void setJs(String js) {
		this.js = js;
	}

	@Override
	public String toString() {
		return "Webpage [html=" + html + ", css=" + css + ", js=" + js + "]";
	}

}
