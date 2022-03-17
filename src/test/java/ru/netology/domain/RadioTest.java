package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    //Тесты для переключения станций
    @Test
    public void shouldTurnMaxStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.next();

        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldTurnNextStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);
        radio.next();

        assertEquals(6, radio.getCurrentStation());
    }

    @Test
    public void shouldTurnMinStation() {
        Radio radio = new Radio();
        radio.prev();

        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void shouldTurnPrevStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(4);
        radio.prev();

        assertEquals(3, radio.getCurrentStation());
    }

    @Test
    public void shouldTurnBeforeMaxStation() {
        Radio radio = new Radio(10);
        radio.prev();

        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void shouldTurnAfterMinStation() {
        Radio radio = new Radio();
        radio.next();

        assertEquals(1, radio.getCurrentStation());
    }

    @Test
    public void shouldTurnPrevMaxStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.prev();

        assertEquals(8, radio.getCurrentStation());
    }

    @Test
    public void shouldTurnStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(8);
        radio.next();

        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void shouldTurnAfterZeroStation() {
        Radio radio = new Radio();
        radio.next();

        assertEquals(1, radio.getCurrentStation());
    }


    //Тесты для переключения громкости
    @Test
    public void shouldCountMinVolume() {
        Radio radio = new Radio(0, 100, 0);
        radio.plusOne();

        assertEquals(1, radio.getCurrentVolume());
    }

    @Test
    public void shouldCountBeforeMaxVolume() {
        Radio radio = new Radio(99, 100, 0);
        radio.plusOne();

        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void shouldCountMaxVolume() {
        Radio radio = new Radio(100, 100, 0);
        radio.plusOne();

        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void shouldCountMiddleVolume() {
        Radio radio = new Radio(56, 100, 0);
        radio.plusOne();

        assertEquals(57, radio.getCurrentVolume());
    }

    @Test
    public void shouldCountOverVolume() {
        Radio radio = new Radio(101, 100, 0);
        radio.plusOne();

        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void shouldCountMinusVolume() {
        Radio radio = new Radio(0, 100, 0);
        radio.minusOne();

        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldCountAfterMinVolume() {
        Radio radio = new Radio(1, 100, 0);
        radio.plusOne();

        assertEquals(2, radio.getCurrentVolume());
    }

    @Test
    public void shouldCountAfterMaxVolume() {
        Radio radio = new Radio(100, 100, 0);
        radio.minusOne();

        assertEquals(99, radio.getCurrentVolume());
    }
}
