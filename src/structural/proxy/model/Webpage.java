package structural.proxy.model;

public class Webpage {

	private String html;
	private String css;
	private String js;

	public Webpage() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Webpage(String html, String css, String js) {
		super();
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
