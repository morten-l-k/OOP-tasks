package com.company;

public class Person {
  //Opretter to attributter til klassen Person
  private String navn;
  private int alder;

  //Opretter konstruktørmetode
  public Person(String navn, int alder){
    this.navn = navn;
    this.alder = alder;
  }

  //Opretter get metoder for klassen
  public String getNavn() {
    return navn;
  }

  public int getAlder() {
    return alder;
  }

  //Opretter en toString metode
  public String toString(){
    return "Navnet er: " + navn +  "\tAlderen er: " + alder;
  }

  //Laver hasBirthday metode
  public void hasBirthday(){
    alder++;
  }
}
