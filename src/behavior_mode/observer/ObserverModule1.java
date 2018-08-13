package behavior_mode.observer;

//�ˣ��۲���
class Person {
  public void update(String data) {
      System.out.println(data + "�ص�Դ...");
  }
}

//ˮ�����۲���
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
          person.update("ˮ���ˣ�");
          isBoiled = false;
      }
  }
}

//�ͻ���
public class ObserverModule1 {
  public static void main(String args[]) {
      Person person = new Person();
      Water1 water = new Water1();
      water.addObserver(person);
      water.SetBoiled();
  }
}
