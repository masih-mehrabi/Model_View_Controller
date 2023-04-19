package model_view_controller.model;

import model_view_controller.view.Observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Observable {

	private List<Observer> observers = new ArrayList<>();

	//TODO: Implement notifyObservers()
	public void notifyObservers() {
		for (Observer observer: observers) {
			observer.update();
		}
	}

	public List<Observer> getObservers() {
		return observers;
	}

	public void addObserver(Observer observer) {
		observers.add(observer);
	}

	public void removeObserver(Observer observer) {
		observers.remove(observer);
	}
}
