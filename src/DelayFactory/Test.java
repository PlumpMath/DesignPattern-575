package delayFactory;

public class Test {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		DelayFactory dfac = new DelayFactory();
		try {
			Product pr = dfac.createProduct("Product1");
			pr.product();
			pr = dfac.createProduct("Product2");
			pr.product();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
