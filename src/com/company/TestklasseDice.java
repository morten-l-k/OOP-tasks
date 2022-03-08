package com.company;

public class TestklasseDice {
  Dice dice1 = new Dice();
  int one = 0;
  int two = 0;
  int three = 0;
  int four = 0;
  int five = 0;
  int six = 0;

  public void rollDice100(){
    for (int i = 0; i < 100; i++){
      dice1.rollDice();
      switch(dice1.getFaceValue()){
        case 1:
          one++;
          break;
        case 2:
          two++;
          break;
        case 3:
          three++;
          break;
        case 4:
          four++;
          break;
        case 5:
          five++;
          break;
        case 6:
          six++;
          break;
      }
    }
  }

  public void print(){
    rollDice100();
    System.out.println("Antal 1: " + one);
    System.out.println("Antal 2: " + two);
    System.out.println("Antal 3: " + three);
    System.out.println("Antal 4: " + four);
    System.out.println("Antal 5: " + five);
    System.out.println("Antal 6: " + six);
  }

  public static void main(String[] args) {
    //******************
    //***TERNINGOPGAVE***
    //******************
    Dice dice1 = new Dice();

    TestklasseDice obj = new TestklasseDice();
    obj.print();
  }
}
