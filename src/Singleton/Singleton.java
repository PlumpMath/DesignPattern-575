package singleton;

public class Singleton {
	private long KEY;

	public Singleton() {
		KEY = System.currentTimeMillis();
	}

	public long getKey() {
		return KEY;
	}

	private static Singleton instance = null;

	/**
	 * 
	 * @return unique Singleton object
	 */
	public static Singleton getInstance() {
		if (instance == null) {
			instance = new Singleton();
		}
		return instance;
	}
}
