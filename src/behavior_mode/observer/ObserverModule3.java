package behavior_mode.observer;

import java.util.Observable;
import java.util.Observer;

public class ObserverModule3 {
	public static void main(String args[]) {
		TemperatureObserver1 temperatureObserver = new TemperatureObserver1();
	    BoildObserver1 boildObserver1 = new BoildObserver1("关闭电源...");
	    BoildObserver1 boildObserver2 = new BoildObserver1("继续保湿...");
	    Water3 water = new Water3(temperatureObserver);
	    water.addObserver(boildObserver1);
	    water.addObserver(boildObserver2);
	    water.change(45);
	    water.change(80);
	    water.change(100);
	}
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
		addObserver(observer);
	}
	
	public double getTemperature() {
		return this.temperature;
	}
	
	public String getStatus() {
		return this.status;
	}
	
	public void change(double temperature) {
	      this.temperature = temperature;
	      if (temperature < 40) {
	          status = "冷水";
	      } else if (temperature >= 40 && temperature < 60) {
	          status = "温水";
	      }else if (temperature >= 60 && temperature < 100 ) {
	          status = "热水";
	      } else {
	          status = "开水";
	      }
	      setChanged();
	      notifyObservers();
	  }
}

//观察对象
class TemperatureObserver1 implements Observer {

	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		Water3 water = (Water3)o;
	    System.out.println("温度：" + water.getTemperature() +  "    状态：" + water.getStatus());
	    System.out.println("TemperatureObserver observing...");
	}
	
}

class BoildObserver1 implements Observer {
	String doSomthing;
	BoildObserver1(String doSomthing) {
		this.doSomthing = doSomthing;
	}
	  
	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
	      Water3 water = (Water3)o;
	      if (water.getTemperature() >= 100) {
	          System.out.println("状态：" + water.getStatus());
	          System.out.println("BoildObserver:" + doSomthing);
	      }
	}
	
}