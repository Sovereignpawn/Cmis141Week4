class BicycleDemo {
  public static void main (String[] args){

    //Create two different
    //Bicycle objects
    Bicycle bike1 = new Bicycle();
    Bicycle bike2 = new Bicycle();

    //invoke methods
    //on those objects
    bike1.changeCandence(50);
    bike1.speedUp(10);
    bike1.changeGear(2);
    bike1.printStates();

    bike2.changeCandence(50);
    bike2.speedUp(10);
    bike2.changeGear(2);

    bike2.changeCandence(40);
    bike2.speedUp(10);
    bike2.changeGear(3);

    bike2.printStates();
  }
}
class Bicycle{
  int cadence =0;
  int speed=0;
  int gear=1;

  void changeCandence(int newValue){
    cadence = newValue;
  }

  void changeGear(int newValue){
    gear = newValue;
  }

  void speedUp(int increment) {
    speed = speed + increment;
  }

  void applyBrakes(int decrement) {
    speed =speed - decrement;
  }
  void printStates(){
    System.out.println("cadence:" +
      cadence + "speed:" +
      speed + "gear:" + gear);
  }
}
