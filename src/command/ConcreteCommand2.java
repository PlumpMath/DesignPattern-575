package command;

public class ConcreteCommand2 extends Command {
	public ConcreteCommand2() {
		super(new Receiver2());
		System.out.println("Set receiver");
	}

	@Override
	public void execute() {
		System.out.println("Do command");
		super.receiver.doSomething();
	}
}
