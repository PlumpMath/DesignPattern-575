package proxy;

public class RealSubject implements Subject {
	private Subject proxy = null;

	public void fun() {
		if (isProxy())
			System.out.println("Do something...");
		else
			System.out.println("Wrong proxy!");
	}

	public Subject getProxy() {
		this.proxy = new Proxy(this);
		return this.proxy;
	}

	public boolean isProxy() {
		return !(this.proxy == null);
	}
}
