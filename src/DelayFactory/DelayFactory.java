package DelayFactory;

import java.util.HashMap;
import java.util.Map;

public class DelayFactory {
	public static final Map<String, Product> prMap = new HashMap(); 
	public static synchronized Product createProduct(String type) throws Exception{
		Product product = null;		
		if(prMap.containsKey(type)){
			product = prMap.get(type);
		}
		else{
			if(type.equals("Product1"))
				product = new Product1();
			else
				product = new Product2();
		}		
		return product;
	}
}
