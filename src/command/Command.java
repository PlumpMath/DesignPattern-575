package command;

public abstract class Command {
	protected final Receiver receiver;

	public Command(Receiver _receiver) {
		this.receiver = _receiver;
	}

	public abstract void execute();
}
