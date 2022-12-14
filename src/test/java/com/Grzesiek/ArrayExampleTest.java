package com.Grzesiek;

import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;


class ArrayExampleTest {

    @Test
    void removeDuplicates() {

        //given
        String[] tablica = {"Ala", "ma", "kota", "ma"};
        //when
        ArrayExample arrayExample = new ArrayExample();
        Set<String> actual = arrayExample.removeDuplicates(tablica);
        Set<String> expected = Set.of("Ala", "ma", "kota");
        //then
        assertThat(actual).isEqualTo(expected);
    }

}
