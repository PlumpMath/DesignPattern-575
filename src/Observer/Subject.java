package Observer;

import java.util.Vector;

public abstract class Subject {
	Vector<Observer> observers = new Vector<Observer>();
	public void addObserver(Observer observer){
		this.observers.add(observer);
	};
	public void deleteObserver(Observer oberver){
		this.observers.remove(oberver);
	};
	public void notifyObservers(String something){
		for(Observer o : this.observers){
			o.update(something);
		}
	};	
}
