package abstractFactory;

/**
 * @author Tong 1.高层模块不关心对象是如何创造出来的，只关注接口 2.产品族直接数量的约束由工厂负责管理，对高层模块是透明的
 *         3.增加产品族是非常繁琐的，即扩展Product的种类 4.产品级别非常容易扩展，即扩展Creator的种类
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
