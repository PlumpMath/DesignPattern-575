package observer;

public class ObserverImpl implements Observer{
	@Override
	public void update(String something){
		System.out.println("Observer: Subject is " + something);
	}
}
