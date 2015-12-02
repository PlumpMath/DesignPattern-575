package command;

public class Invoker {
	Command command = null;

	public void setCommand(Command _command) {
		System.out.println("Set Command");
		this.command = _command;
	}

	public void action() {
		System.out.println("Command begin...");
		this.command.execute();
	}
}
