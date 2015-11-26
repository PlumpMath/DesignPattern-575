package builder_2;

public class ConcreteProduct extends Builder{
	Product product = new Product();
	@Override
	void setPart() {
		// TODO Auto-generated method stub
		System.out.println("Step 1");
		System.out.println("Step 2");
		System.out.println("Step 3");
		System.out.println("Step 4");
		System.out.println("......");
		System.out.println("Step n-1");
		System.out.println("Step n");
	}
	public Product build(){
		return this.product;
	}
	@Override
	public void check() {
		// TODO Auto-generated method stub
		System.out.println("Check complete.");
	}
}
