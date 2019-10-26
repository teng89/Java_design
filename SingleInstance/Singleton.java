package design.SingleInstance;

public class Singleton {
	
	private static Singleton instance;
	
	public static Singleton getInstance() {
		if(instance == null) {
			synchronized (Singleton.class) {
				if(instance == null) {
					instance = new Singleton();
				}
			}
		}
		return instance;
	}
	
	private Singleton() {
		// TODO Auto-generated constructor stub
	}
}
