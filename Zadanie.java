package com.company;

import java.util.Scanner;

public class Zadanie {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Daj liczbę a:");
        int a = scanner.nextInt();

        System.out.println("Daj liczbę b:");
        int b = scanner.nextInt();

        if(b == 0){
            System.out.println("O nie!");
        } else {
            double d = a / (double)b;
            System.out.println(a/b);}
//        System.out.println("Daj liczbę");
//        Scanner scanner = new Scanner(System.in);
//        int liczba = scanner.nextInt();
//        System.out.println("Wybrałeś" + liczba );
        //int a = 0;
//        if(a > 0 && a < 5){
//           System.out.println("hura!");
//        }else if(a > 5 && a < 10) {
//           System.out.println("wow");
//        }else {
//           System.out.println("o nie");
//        }
//        switch(a){
//            case 1:
//                System.out.println("1");
//                break; // jeśli nie wpiszemy break to wtedy switch wykona wszystkie instrukcje
//            case 2:
//                System.out.println("2");
//                break;
//            case 3:
//                System.out.println("3");
//                break;
//            default:
//                System.out.println("9");
//        do {
//            System.out.println(a);
//            a++
//        } while (a < 10);

//        while(a < 10){
//             System.out.println(a); <--- ta pętla się może nigdy nie wykonać jeśli nie jest spełniony warunek po while
//             a++;
//        }
    }
}
