package command;

public class Test {

	public static void main(String[] args) {
		Invoker invoker = new Invoker();
		Command command = new ConcreteCommand1();
		invoker.setCommand(command);
		invoker.action();
		command = new ConcreteCommand2();
		invoker.setCommand(command);
		invoker.action();
		
	}

}
