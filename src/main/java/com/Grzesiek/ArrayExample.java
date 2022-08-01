package com.Grzesiek;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.ThreadLocalRandom;

public class ArrayExample {

    Set<String> removeDuplicates(String[] tablica) {
        Set<String> result = new HashSet<>();
        for (String string : tablica) {
            result.add(string);
        }
        return result;
    }
}


