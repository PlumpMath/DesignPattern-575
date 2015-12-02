package template;

public class Benz extends Car {

	@Override
	void start() {
		System.out.println("Benz start.");
	}

	@Override
	void alarm() {
		System.out.println("Benz alarm.");

	}

	@Override
	void stop() {
		System.out.println("Benz stop.");

	}

	@Override
	void run() {
		start();
		alarm();
		stop();
	}

}
