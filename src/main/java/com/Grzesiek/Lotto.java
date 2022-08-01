package com.Grzesiek;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Lotto {
    Set<Integer> losuj(int x, int min, int max) {
        Set<Integer> result = new TreeSet<>();
        Random random = new Random();
        while (result.size() != x) {
            result.add(random.nextInt(max - min) + min);
        }
        return result;
    }

    public static void main(String[] args) {
        Lotto lotto = new Lotto();
        Set<Integer> results = lotto.losuj(6, 1, 49);
        System.out.println(results);
    }

}
