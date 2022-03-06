package ru.netology.domain;

public class Radio {

    private int currentStationNumber;
    private int currentVolume;
    private int stationAmount = 10;
    private int minVolume = 0;
    private int maxVolume = 100;

    // Геттеры и сеттеры
    public int getMinVolume() {
        return minVolume;
    }

    public void setMinVolume(int minVolume) {
        this.minVolume = minVolume;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public void setMaxVolume(int maxVolume) {
        this.maxVolume = maxVolume;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        this.currentVolume = currentVolume;
    }

    public int getStationAmount() {
        return stationAmount;
    }

    public void setStationAmount(int stationAmount) {
        this.stationAmount = stationAmount;
    }

    public int getCurrentStationNumber() {
        return currentStationNumber;
    }

    public void setCurrentStationNumber(int currentStationNumber) {
        if (currentStationNumber > (stationAmount - 1)) {
            return;
        }
        this.currentStationNumber = currentStationNumber;
    }

    // Конструкторы
    public Radio() {
    }

    public Radio(int stationAmount) {
        this.stationAmount = stationAmount;
    }

    // Методы
    public void next() {
        if (currentStationNumber < (stationAmount - 1)) {
            currentStationNumber = currentStationNumber + 1;
        } else {
            currentStationNumber = 0;
        }
    }

    public void prev() {
        if (currentStationNumber > 0) {
            currentStationNumber = currentStationNumber - 1;
        } else {
            currentStationNumber = (stationAmount - 1);
        }
    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;
        }
    }
}