package SimpleFactory;

public class Factory {
	public static <T extends Product>T produce(Class c){
		Product product = null;
		try{
			product = (Product)Class.forName(c.getName()).newInstance();
		}
		catch(Exception ex){
			System.out.println("Error");
		}
		return (T)product;
	}

}