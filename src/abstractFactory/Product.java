package abstractFactory;

public abstract class Product {
	public void sameMethod(){
		System.out.println("shared Method.");
	}
	public abstract void doSomething();
}
