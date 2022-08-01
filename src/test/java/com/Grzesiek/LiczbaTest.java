package com.Grzesiek;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LiczbaTest {

    private Liczba liczba;

    @BeforeEach
    void setup() {
        System.out.println("Uruchamiam ");
        liczba = new Liczba();
    }

    @Test
    @DisplayName("prime number")
    void shouldBePrimeNumber() {
        //given
        int number = 7;
        //when
        boolean actual = liczba.czyPierwsza(number);
        //then
        assertThat(actual)
                .isTrue();
    }

    @Test
    @DisplayName("not a prime number")
    void shouldBeNotPrimeNumber() {
        //given
        int number = 8;
        //when
        Liczba liczba = new Liczba();
        boolean actual = liczba.czyPierwsza(number);
        //then
        assertThat(actual)
                .isFalse();
    }
}