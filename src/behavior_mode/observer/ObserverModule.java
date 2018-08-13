package behavior_mode.observer;

import java.util.Observable;
import java.util.Observer;

public class ObserverModule {

}

//被观察对象
class Water3 extends Observable {
	private double temperature;
	private String status;
	
	public Water3(){
		super();
		this.status = "冷水";
		this.temperature = 0;
	}
	
	public Water3(Observer observer) {
		this();
		
	}
}

//观察对象
