package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    //Тесты для переключения станций

    @Test
    public void shouldInstallQuantityStation() {
        Radio radio = new Radio(0, 9, 0, 9);
        assertEquals(9, radio.getQuantity());
    }

    @Test
    public void shouldInstallCurrentStation() {
        Radio radio = new Radio(5, 9, 0, 10);
        assertEquals(5, radio.getCurrentStation());
    }

    @Test
    public void shouldTurnNextStation() {
        Radio radio = new Radio(5, 9, 0, 10);
        radio.next();
        assertEquals(6, radio.getCurrentStation());
    }

    @Test
    public void shouldTurnPrevStation() {
        Radio radio = new Radio(4, 9, 0, 10);
        radio.prev();
        assertEquals(3, radio.getCurrentStation());
    }

    @Test
    public void shouldTurnMaxStation() {
        Radio radio = new Radio(9, 9, 0, 10);
        radio.next();

        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldTurnMinStation() {
        Radio radio = new Radio(0, 9, 0, 10);
        radio.prev();

        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void shouldTurnAfterMinStation() {
        Radio radio = new Radio(0, 9, 0, 10);
        radio.next();

        assertEquals(1, radio.getCurrentStation());
    }

    @Test
    public void shouldTurnPrevMaxStation() {
        Radio radio = new Radio(9, 9, 0, 10);
        radio.prev();

        assertEquals(8, radio.getCurrentStation());
    }

    @Test
    public void shouldTurnBeforeMaxStation() {
        Radio radio = new Radio(8, 9, 0, 10);
        radio.next();

        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void shouldTurnAfterOneStation() {
        Radio radio = new Radio(1, 9, 0, 10);
        radio.next();

        assertEquals(2, radio.getCurrentStation());
    }

    @Test
    public void shouldTurnBeforeOneStation() {
        Radio radio = new Radio(1, 9, 0, 10);
        radio.prev();

        assertEquals(0, radio.getCurrentStation());
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
