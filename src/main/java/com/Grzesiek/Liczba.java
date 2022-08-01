package com.Grzesiek;

public class Liczba {

    public boolean czyPierwsza(int number) {
        for (int i = 2; i <= (int) Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Liczba liczba = new Liczba();
        System.out.println(liczba.czyPierwsza(10));
        System.out.println(liczba.czyPierwsza(7));
    }
}
