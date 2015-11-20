package strategy;

public class Test {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyContext myContext = new MyContext(new Method1());
		myContext.solve();
		myContext.setMethod(new Method2());
		myContext.solve();
		
		}
}
