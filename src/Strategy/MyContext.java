package strategy;

public class MyContext {
	Method method = null;

	public void setMethod(Method method) {
		this.method = method;
	}

	MyContext(Method _method) {
		this.method = _method;
	}

	public void solve() {
		this.method.doMethod();
	}
}
