package builder_2;

public class Director {
	private Builder builder = new ConcreteProduct();
	public Product getProduct(){
		builder.setPart();
		builder.check();
		System.out.println("Finish.");
		return builder.build();
	}	
}
