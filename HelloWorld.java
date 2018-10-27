package com.company;

public class HelloWorld {
// komentowanie
    public static void main(String[] args){
       // int i = 9;
        // long age0fUniverse = 382478234798137489L; // większa liczna int (całkowita)
        //float c = 8.9f;
        //double b = 8.9; // większa zmienna przecinkowa, można dodać d na końcu
        //char a = 'a';
        //boolean isJavaFun = true;
        //System.out.println(isJavaFun);

        int x = 4567;
        int y = 77;
        double z = x/(double)y; // rzutowanie -  żeby powstała nam zmienna przecinkowa musimy nie tylko wynik przypisać do double ale też jedną ze zmiennych
        String name = "Monika";
        int[] tablica = {1, 2, 3}; //tablica jednowymiarowa, przechowuje więcej niż jedną zmienną tego samego typu
        double[] tablica1 = new double[10];
        tablica1[0] = 0.9; // dodawanie elementów do "tablicy"

        int[][] f = new int[3][]; // tablica ma 3 podtablice
        f[0] = new int[5];
        f[1] = new int[3];
        f[2] = new int[2];
        f[1][0] = 1;
        //System.out.println(x++);  postinkrementacja, wyświetla 9 bo tutaj zwiększa o 1 dopiero po komendzie
        //System.out.println(x);  tutaj już mamy x zwiększone o 1
        //System.out.println(x != y); ---> nie równe
        //System.out.println(x == y); ---> równe
        // ważne żeby były podwójne operatory logiczne && i || <--- pojedyncze to są operacje na bitach !!!
        System.out.println(!(x < y || false));
    }
}
