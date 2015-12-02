package abstractFactory;

public class Creator2 extends Creator {

	@Override
	public Product createProductA() {
		// TODO Auto-generated method stub
		System.out.println("-----Created by No.1-----");
		return new ProductA();
	}

	@Override
	public Product createProductB() {
		// TODO Auto-generated method stub
		System.out.println("-----Created by No.1-----");
		return new ProductB();
	}

}
