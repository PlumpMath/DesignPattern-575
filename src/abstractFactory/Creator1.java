package abstractFactory;

public class Creator1 extends Creator {

	@Override
	public Product createProductA() {
		System.out.println("-----Created by No.2-----");
		return new ProductA();
	}

	@Override
	public Product createProductB() {
		// TODO Auto-generated method stub
		System.out.println("-----Created by No.2-----");
		return new ProductB();
	}
}
