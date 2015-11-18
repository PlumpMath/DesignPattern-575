package command;

public class ConcreteCommand1 extends Command{
	public ConcreteCommand1(){
		super(new Receiver1());
		System.out.println("Set receiver");
	}
	@Override 
	public void execute(){
		System.out.println("Do command");
		super.receiver.doSomething();
	}
}