package behavior_mode.observer;

//人，观察者
class Person {
  public void update(String data) {
      System.out.println(data + "关电源...");
  }
}

//水，被观察者
class Water1 {
  private Person person;
  private boolean isBoiled;
  public Water1() {
      isBoiled = false;
  }

  public void SetBoiled() {
      isBoiled = true;
      notifyObserve();
  }
  public void addObserver(Person person) {
      this.person = person;
  }

  public void removeObserver() {
      if (person != null) {
          person = null;
      }
  }

  public void notifyObserve() {
      if (isBoiled && person != null) {
          person.update("水开了，");
          isBoiled = false;
      }
  }
}

//客户端
public class ObserverModule1 {
  public static void main(String args[]) {
      Person person = new Person();
      Water1 water = new Water1();
      water.addObserver(person);
      water.SetBoiled();
  }
}
