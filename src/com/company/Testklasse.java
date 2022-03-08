package com.company;

public class Testklasse {

  public static void main(String[] args) {
    //******************
    //***PERSONOPGAVE***
    //******************
    Person person1 = new Person("Morten",29); //Vi opretter et objekt der hedder person1. Den oprettes på baggrund af vores klasse Person.
    System.out.println(person1); //Her printer vi person1-objektet

    //For person1-objektet skriver vi, at vedkommende har fødselsdag
    person1.hasBirthday();

    //Vi printer nu person1 igen og kan se, at alder nu er 30, fordi vi har kaldt hasBirthday-metoden for objektet.
    System.out.println(person1);


  }
}
