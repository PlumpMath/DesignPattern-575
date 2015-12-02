package abstractFactory;

/**
 * @author Tong 1.�߲�ģ�鲻���Ķ�������δ�������ģ�ֻ��ע�ӿ� 2.��Ʒ��ֱ��������Լ���ɹ�����������Ը߲�ģ����͸����
 *         3.���Ӳ�Ʒ���Ƿǳ������ģ�����չProduct������ 4.��Ʒ����ǳ�������չ������չCreator������
 */

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Creator creator1 = new Creator1();
		Creator creator2 = new Creator2();
		System.out.println("=== A1 ===");
		Product A1 = creator1.createProductA();
		A1.doSomething();
		System.out.println("=== A2 ===");
		Product A2 = creator2.createProductA();
		A2.doSomething();
		System.out.println("=== B1 ===");
		Product B1 = creator1.createProductB();
		B1.doSomething();
		System.out.println("=== B2 ===");
		Product B2 = creator2.createProductB();
		B2.doSomething();
	}

}
