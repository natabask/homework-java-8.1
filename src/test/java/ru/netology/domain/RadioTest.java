package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    // Количество станций по умолчанию, конструктор без аргументов
    Radio radio = new Radio();

    @Test // Устанавливаем минимальный номер станции из диапазона
    public void shouldSetCurrentStationNumberToMin() {
        radio.setCurrentStationNumber(0);

        int expected = 0;
        int actual = radio.getCurrentStationNumber();

        assertEquals(expected, actual);
    }

    @Test // Устанавливаем номер станции из диапазона (середина)
    public void shouldSetCurrentStationNumber() {
        radio.setCurrentStationNumber(5);

        int expected = 5;
        int actual = radio.getCurrentStationNumber();

        assertEquals(expected, actual);
    }

    @Test // Устанавливаем максимальный номер станции из диапазона
    public void shouldSetCurrentStationNumberToMax() {
        radio.setCurrentStationNumber(9);

        int expected = 9;
        int actual = radio.getCurrentStationNumber();

        assertEquals(expected, actual);
    }

    @Test // Устанавливаем номер станции вне диапазона
    public void shouldSetCurrentStationNumberOutsideRange() {
        radio.setCurrentStationNumber(10);

        int expected = 0;
        int actual = radio.getCurrentStationNumber();

        assertEquals(expected, actual);
    }

    @Test // Увеличиваем номер станции с минимальной
    public void shouldIncreaseCurrentStationNumberFromMin() {
        radio.setCurrentStationNumber(0);

        radio.next();

        int expected = 1;
        int actual = radio.getCurrentStationNumber();

        assertEquals(expected, actual);
    }

    @Test // Увеличиваем номер станции в середине диапазона
    public void shouldIncreaseCurrentStationNumber() {
        radio.setCurrentStationNumber(5);

        radio.next();

        int expected = 6;
        int actual = radio.getCurrentStationNumber();

        assertEquals(expected, actual);
    }

    @Test // Увеличиваем номер станции в конце диапазона
    public void shouldIncreaseCurrentStationNumberFromMax() {
        radio.setCurrentStationNumber(9);

        radio.next();

        int expected = 0;
        int actual = radio.getCurrentStationNumber();

        assertEquals(expected, actual);
    }

    @Test // Уменьшаем номер станции в начале диапазона
    public void shouldDecreaseCurrentStationNumberFromMin() {
        radio.setCurrentStationNumber(0);

        radio.prev();

        int expected = 9;
        int actual = radio.getCurrentStationNumber();

        assertEquals(expected, actual);
    }

    @Test // Уменьшаем номер станции в середине диапазона
    public void shouldDecreaseCurrentStationNumber() {
        radio.setCurrentStationNumber(5);

        radio.prev();

        int expected = 4;
        int actual = radio.getCurrentStationNumber();

        assertEquals(expected, actual);
    }

    @Test // Уменьшаем номер станции в конце диапазона
    public void shouldDecreaseCurrentStationNumberFromMax() {
        radio.setCurrentStationNumber(9);

        radio.prev();

        int expected = 8;
        int actual = radio.getCurrentStationNumber();

        assertEquals(expected, actual);
    }

    @Test // Увеличиваем громкость в начале диапазона
    public void shouldIncreaseCurrentVolumeFromMin() {
        radio.setCurrentVolume(0);

        radio.increaseVolume();

        int expected = 1;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test // Увеличиваем громкость в середине диапазона
    public void shouldIncreaseCurrentVolume() {
        radio.setCurrentVolume(50);

        radio.increaseVolume();

        int expected = 51;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test // Увеличиваем громкость в конце диапазона
    public void shouldIncreaseCurrentVolumeFromMax() {
        radio.setCurrentVolume(100);

        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test // Уменьшаем громкость в начале диапазона
    public void shouldDecreaseCurrentVolumeFromMin() {
        radio.setCurrentVolume(0);

        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test // Уменьшаем громкость в середине диапазона
    public void shouldDecreaseCurrentVolume() {
        radio.setCurrentVolume(50);

        radio.decreaseVolume();

        int expected = 49;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test // Уменьшаем громкость в конце диапазона
    public void shouldDecreaseCurrentVolumeFromMax() {
        radio.setCurrentVolume(100);

        radio.decreaseVolume();

        int expected = 99;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    // Количество станций задается пользователем, конструктор с 1 аргументом
    Radio radio2 = new Radio(15);

    @Test // Устанавливаем минимальный номер станции из диапазона
    public void shouldSetCurrentStationNumberToMin2() {
        radio2.setCurrentStationNumber(0);

        int expected = 0;
        int actual = radio2.getCurrentStationNumber();

        assertEquals(expected, actual);
    }

    @Test // Устанавливаем номер станции из диапазона (середина)
    public void shouldSetCurrentStationNumber2() {
        radio2.setCurrentStationNumber(7);

        int expected = 7;
        int actual = radio2.getCurrentStationNumber();

        assertEquals(expected, actual);
    }

    @Test // Устанавливаем максимальный номер станции из диапазона
    public void shouldSetCurrentStationNumberToMax2() {
        radio2.setCurrentStationNumber(14);

        int expected = 14;
        int actual = radio2.getCurrentStationNumber();

        assertEquals(expected, actual);
    }

    @Test // Устанавливаем номер станции вне диапазона
    public void shouldSetCurrentStationNumberOutsideRange2() {
        radio2.setCurrentStationNumber(15);

        int expected = 0;
        int actual = radio2.getCurrentStationNumber();

        assertEquals(expected, actual);
    }

    @Test // Увеличиваем номер станции с минимальной
    public void shouldIncreaseCurrentStationNumberFromMin2() {
        radio2.setCurrentStationNumber(0);

        radio2.next();

        int expected = 1;
        int actual = radio2.getCurrentStationNumber();

        assertEquals(expected, actual);
    }

    @Test // Увеличиваем номер станции в середине диапазона
    public void shouldIncreaseCurrentStationNumber2() {
        radio2.setCurrentStationNumber(7);

        radio2.next();

        int expected = 8;
        int actual = radio2.getCurrentStationNumber();

        assertEquals(expected, actual);
    }

    @Test // Увеличиваем номер станции в конце диапазона
    public void shouldIncreaseCurrentStationNumberFromMax2() {
        radio2.setCurrentStationNumber(14);

        radio2.next();

        int expected = 0;
        int actual = radio2.getCurrentStationNumber();

        assertEquals(expected, actual);
    }

    @Test // Уменьшаем номер станции в начале диапазона
    public void shouldDecreaseCurrentStationNumberFromMin2() {
        radio2.setCurrentStationNumber(0);

        radio2.prev();

        int expected = 14;
        int actual = radio2.getCurrentStationNumber();

        assertEquals(expected, actual);
    }

    @Test // Уменьшаем номер станции в середине диапазона
    public void shouldDecreaseCurrentStationNumber2() {
        radio2.setCurrentStationNumber(8);

        radio2.prev();

        int expected = 7;
        int actual = radio2.getCurrentStationNumber();

        assertEquals(expected, actual);
    }

    @Test // Уменьшаем номер станции в конце диапазона
    public void shouldDecreaseCurrentStationNumberFromMax2() {
        radio2.setCurrentStationNumber(14);

        radio2.prev();

        int expected = 13;
        int actual = radio2.getCurrentStationNumber();

        assertEquals(expected, actual);
    }

    @Test // Увеличиваем громкость в начале диапазона
    public void shouldIncreaseCurrentVolumeFromMin2() {
        radio2.setCurrentVolume(0);

        radio2.increaseVolume();

        int expected = 1;
        int actual = radio2.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test // Увеличиваем громкость в середине диапазона
    public void shouldIncreaseCurrentVolume2() {
        radio2.setCurrentVolume(50);

        radio2.increaseVolume();

        int expected = 51;
        int actual = radio2.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test // Увеличиваем громкость в конце диапазона
    public void shouldIncreaseCurrentVolumeFromMax2() {
        radio2.setCurrentVolume(100);

        radio2.increaseVolume();

        int expected = 100;
        int actual = radio2.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test // Уменьшаем громкость в начале диапазона
    public void shouldDecreaseCurrentVolumeFromMin2() {
        radio2.setCurrentVolume(0);

        radio2.decreaseVolume();

        int expected = 0;
        int actual = radio2.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test // Уменьшаем громкость в середине диапазона
    public void shouldDecreaseCurrentVolume2() {
        radio2.setCurrentVolume(50);

        radio2.decreaseVolume();

        int expected = 49;
        int actual = radio2.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test // Уменьшаем громкость в конце диапазона
    public void shouldDecreaseCurrentVolumeFromMax2() {
        radio2.setCurrentVolume(100);

        radio2.decreaseVolume();

        int expected = 99;
        int actual = radio2.getCurrentVolume();

        assertEquals(expected, actual);
    }

}