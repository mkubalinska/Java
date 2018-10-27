package com.company;

public class Main {

    public static void main(String[] args) {
        Student Monika = new Student("Monika",Gender.FEMALE, 21, 3);
        Student Monia = new Student ( "Monika", Gender.FEMALE, 22, 4);
        System.out.println(Monika);
        System.out.println(Monika.equals(Monia));
    }
//	Dog reksio = new Dog("Reksio");
//	reksio.setNumberOfLegs(3);
//	System.out.println(reksio.getNumberOfLegs());
//	reksio.bark();
//	Dog.sayHau(); // żeby wywołać metodę statyczną musimy użyć nazwy danej klasy, jest wspólna dla wszystkich obiektów więc nie muszę mieć obiektu żeby ją wywołać
//    }
}
