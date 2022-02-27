package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test // Устанавливаем минимальный номер станции из диапазона
    public void shouldSetCurrentStationNumberToMin() {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(0);

        int expected = 0;
        int actual = radio.getCurrentStationNumber();

        assertEquals(expected, actual);
    }

    @Test // Устанавливаем номер станции из диапазона
    public void shouldSetCurrentStationNumber() {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(5);

        int expected = 5;
        int actual = radio.getCurrentStationNumber();

        assertEquals(expected, actual);
    }

    @Test // Устанавливаем максимальный номер станции из диапазона
    public void shouldSetCurrentStationNumberToMax() {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(9);

        int expected = 9;
        int actual = radio.getCurrentStationNumber();

        assertEquals(expected, actual);
    }

    @Test // Устанавливаем номер станции вне диапазона
    public void shouldSetCurrentStationNumberOutsideRange() {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(20);

        int expected = 0;
        int actual = radio.getCurrentStationNumber();

        assertEquals(expected, actual);
    }

    @Test // Увеличиваем номер станции с минимальной
    public void shouldIncreaseCurrentStationNumberFromMin() {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(0);

        radio.next();

        int expected = 1;
        int actual = radio.getCurrentStationNumber();

        assertEquals(expected, actual);
    }

    @Test // Увеличиваем номер станции в середине диапазона
    public void shouldIncreaseCurrentStationNumber() {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(5);

        radio.next();

        int expected = 6;
        int actual = radio.getCurrentStationNumber();

        assertEquals(expected, actual);
    }

    @Test // Увеличиваем номер станции в конце диапазона
    public void shouldIncreaseCurrentStationNumberFromMax() {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(9);

        radio.next();

        int expected = 0;
        int actual = radio.getCurrentStationNumber();

        assertEquals(expected, actual);
    }

    @Test // Уменьшаем номер станции в начале диапазона
    public void shouldDecreaseCurrentStationNumberFromMin() {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(0);

        radio.prev();

        int expected = 9;
        int actual = radio.getCurrentStationNumber();

        assertEquals(expected, actual);
    }

    @Test // Уменьшаем номер станции в середине диапазона
    public void shouldDecreaseCurrentStationNumber() {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(7);

        radio.prev();

        int expected = 6;
        int actual = radio.getCurrentStationNumber();

        assertEquals(expected, actual);
    }

    @Test // Уменьшаем номер станции в конце диапазона
    public void shouldDecreaseCurrentStationNumberFromMax() {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(9);

        radio.prev();

        int expected = 8;
        int actual = radio.getCurrentStationNumber();

        assertEquals(expected, actual);
    }

    @Test // Увеличиваем громкость в начале диапазона
    public void shouldIncreaseCurrentVolumeFromMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);

        radio.increaseVolume();

        int expected = 1;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test // Увеличиваем громкость в середине диапазона
    public void shouldIncreaseCurrentVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(4);

        radio.increaseVolume();

        int expected = 5;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test // Увеличиваем громкость в конце диапазона
    public void shouldIncreaseCurrentVolumeFromMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);

        radio.increaseVolume();

        int expected = 10;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test // Уменьшаем громкость в начале диапазона
    public void shouldDecreaseCurrentVolumeFromMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);

        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test // Уменьшаем громкость в середине диапазона
    public void shouldDecreaseCurrentVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(7);

        radio.decreaseVolume();

        int expected = 6;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test // Уменьшаем громкость в конце диапазона
    public void shouldDecreaseCurrentVolumeFromMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);

        radio.decreaseVolume();

        int expected = 9;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }
}