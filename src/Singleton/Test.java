package Singleton;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singleton singleton1 = Singleton.getInstance();
		System.out.println(singleton1.getKey());
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		Singleton singleton2 = Singleton.getInstance();
		System.out.println(singleton2.getKey());		
	}
}
