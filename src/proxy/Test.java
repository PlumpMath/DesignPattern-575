package proxy;

public class Test {

	public static void main(String[] args) {
		Subject sub = new RealSubject();
		System.out.println("直接访问具体对象方法:");
		sub.fun();
		Proxy proxy1 = new Proxy(sub);
		System.out.println("自定义代理访问方法:");
		proxy1.fun();
		Proxy proxy2 = (Proxy) sub.getProxy();
		System.out.println("通过对象产生的代理访问方法:");
		proxy2.fun();
	}

}
