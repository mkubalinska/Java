package com.company;

public class Dog {
    String name; // cecha (parametr??)
    private int numberOfLegs; // to powoduje że nie mamy wstępu do zmiennej numberOfLegs, ale teraz nie możemy ani zmienić, ani wypisać

    public Dog() { // nie wrzucamy numberOfLegs, bo podajemy konkretną wartość w konstruktorze, nie chcemy jej wpisywać potem
        this.numberOfLegs = 4; // konstruktor służy do inicjalizowania obiektu, służy do wrzucania wartości do obiektu
    }

    public Dog(String name) { // jeśli chcemy coś wrzucić , to wpisujemy to w nawias po Dog
        this(); // ta sformułowanie wywołyje konstruktor " public Dog() "
        this.name = name; // żeby dobrać się do konkretnego obiektu dlatego używam słówka "this", które służy także do wywoływania konstruktorów z tej samej klasy
    }
    public void  bark(){
        System.out.println("hua hua");
    }
    public int getNumberOfLegs(){
        return numberOfLegs;
    }
    public void setNumberOfLegs(int numberOfLegs){
        this.numberOfLegs = numberOfLegs;
    }
    public static void sayHau(){
        System.out.println("hau"); // metoda statyczna
    }

}
