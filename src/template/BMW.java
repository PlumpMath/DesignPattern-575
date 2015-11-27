package template;

public class BMW extends Car{

	@Override
	void start() {
		System.out.println("BMW start.");
	}

	@Override
	void alarm() {
		System.out.println("BMW alarm.");
	}

	@Override
	void stop() {
		System.out.println("BMW stop.");
	}

	@Override
	void run() {
		start();
		alarm();
		stop();
	}

}
