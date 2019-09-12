package me.smash.mediator;

public class MediatorDemo {

  public static void main(String[] args) {
    Mediator mediator = new ConcreteMediator();
    new ConcreteColleague(mediator, "colleague1");
    new ConcreteColleague(mediator, "colleague2");
    Colleague colleague3 = new ConcreteColleague(mediator, "colleague3");
    new ConcreteColleague(mediator, "colleague4");
    new MobileColleague(mediator, "colleague5");
    new MobileColleague(mediator, "colleague6");

    colleague3.sendMessage("Hello I'm colleague3");


  }
}
