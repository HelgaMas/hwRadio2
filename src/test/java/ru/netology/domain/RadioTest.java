package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
   //Тесты для переключения станций
    @Test
   public void shouldTurnNextStation() {
       Radio radio = new Radio();
       radio.setCurrentStation(5);
       radio.next();

       int expected = 6;
       int actual = radio.getCurrentStation();

       assertEquals(expected, actual);
   }
    @Test
   public void shouldTurnPrevStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(3);
        radio.prev();

        int expected = 2;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }
    @Test
    public void shouldTurnMaxStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.next();

        int expected = 0;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }
    @Test
    public void shouldTurnMinStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.prev();

        int expected = 9;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }
    @Test
    public void shouldTurnAfterMinStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.next();

        int expected = 1;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }
    @Test
    public void shouldTurnPrevMaxStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.prev();

        int expected = 8;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }
    @Test
    public void shouldTurnBeforeMaxStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(8);
        radio.next();

        int expected = 9;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }
    @Test
    public void shouldTurnAfterOneStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(1);
        radio.next();

        int expected = 2;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }
    @Test
    public void shouldTurnBeforeOneStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(1);
        radio.prev();

        int expected = 0;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    //Тесты для переключения громкости
    @Test
    public void shouldCountMinVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.plusOne();

        int expected = 1;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldCountBeforeMaxVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(9);
        radio.plusOne();

        int expected = 10;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldCountMaxVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        radio.plusOne();

        int expected = 10;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldCountMiddleVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(5);
        radio.plusOne();

        int expected = 6;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldCountOverVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(11);
        radio.plusOne();

        int expected = 10;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldCountMinusVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);
        radio.minusOne();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldCountAfterMinVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);
        radio.plusOne();

        int expected = 2;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

}
