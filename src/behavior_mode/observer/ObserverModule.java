package behavior_mode.observer;

import java.util.Observable;
import java.util.Observer;

public class ObserverModule {

}

//���۲����
class Water3 extends Observable {
	private double temperature;
	private String status;
	
	public Water3(){
		super();
		this.status = "��ˮ";
		this.temperature = 0;
	}
	
	public Water3(Observer observer) {
		this();
		
	}
}

//�۲����
