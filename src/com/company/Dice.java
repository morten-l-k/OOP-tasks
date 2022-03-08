package com.company;

public class Dice {
  private int faceValue;

  //Opretter en konstruktørmetode - umiddelbart har vi dog ikke brug for den, når vi ikke tager noget parameter ind
/*  public Die(){
    this.faceValue = faceValue;
  }*/

  //Laver en roll-metode
  public void rollDice(){
    faceValue = (int) Math.floor(Math.random()*6+1);
  }

  //Laver en get-metode
  public int getFaceValue(){
    return faceValue;
  }

  //Laver en toString metode
  public String toString(){
    return "Facevalue er: " + "\t" + faceValue;
  }
}
