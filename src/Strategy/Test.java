package strategy;

public class Test {
	public static void main(String[] args) {
		MyContext myContext = new MyContext(new Method1());
		myContext.solve();
		myContext.setMethod(new Method2());
		myContext.solve();		
		}
}
