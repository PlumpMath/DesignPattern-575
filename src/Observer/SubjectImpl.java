package observer;

public class SubjectImpl extends Subject {
	public void start() {
		System.out.println("Subject: start");
		super.notifyObservers("start");
	}

	public void pause() {
		System.out.println("Subject: pause");
		super.notifyObservers("pause");
	}

	public void end() {
		System.out.println("Subject: end");
		super.notifyObservers("end");
	}
}
