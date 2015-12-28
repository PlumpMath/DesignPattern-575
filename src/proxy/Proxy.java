package proxy;

public class Proxy implements Subject {
	private Subject sub = null;

	public Proxy(Subject sub) {
		this.sub = sub;
	}

	public void fun() {
		this.sub.fun();
	}

	public Subject getProxy() {
		return this;
	}
}
