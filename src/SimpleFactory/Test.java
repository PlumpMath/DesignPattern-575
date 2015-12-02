package simpleFactory;

public class Test {
	public static void main(String[] args) {
		showProduct(Factory.produce(Product2.class));
	}

	public static void showProduct(Product product) {
		product.product();
	}
}
