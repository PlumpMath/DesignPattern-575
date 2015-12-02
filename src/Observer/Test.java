package observer;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Observer obv1 = new ObserverImpl();
		// Observer obv2 = new ObserverImpl();
		SubjectImpl mSubject = new SubjectImpl();
		mSubject.addObserver(obv1);
		// mSubject.addObserver(obv2);
		mSubject.start();
		mSubject.pause();
		mSubject.end();
	}
}
