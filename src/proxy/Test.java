package proxy;

public class Test {

	public static void main(String[] args) {
		Subject sub = new RealSubject();
		System.out.println("ֱ�ӷ��ʾ�����󷽷�:");
		sub.fun();
		Proxy proxy1 = new Proxy(sub);
		System.out.println("�Զ��������ʷ���:");
		proxy1.fun();
		Proxy proxy2 = (Proxy) sub.getProxy();
		System.out.println("ͨ����������Ĵ�����ʷ���:");
		proxy2.fun();
	}

}
