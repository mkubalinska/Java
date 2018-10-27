package com.company;

public class tablica {

    public static void main( String[] args){
        String[] tablica = {"Monika", "Ola", "Ala"};
        int sum = 0;
        for (int i = 0; i < tablica.length; i++){ // tablica.length to jest cecha, dlatego nie ma po length ()
            System.out.println(tablica[i].toLowerCase()); // toLowerCase - wszystkie litery duże zamienione na małe
            System.out.println(tablica[i].length()); // tutaj mamy zachowanie naszego stringa, dlatego mamy po length () nawiasy
            sum += tablica[i].length();
        }
        System.out.println(sum);

    }
}
