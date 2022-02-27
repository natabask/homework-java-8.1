package ru.netology.domain;

public class Radio {

    private int currentStationNumber;
    private int currentVolume;

    public int getCurrentStationNumber() {
        return currentStationNumber;
    }

    public void setCurrentStationNumber(int currentStationNumber) {
        if (currentStationNumber > 9) {
            return;
        }
        this.currentStationNumber = currentStationNumber;
    }

    public void next() {
        if (currentStationNumber < 9) {
            currentStationNumber = currentStationNumber + 1;
        } else {
            currentStationNumber = 0;
        }
    }

    public void prev() {
        if (currentStationNumber > 0) {
            currentStationNumber = currentStationNumber - 1;
        } else {
            currentStationNumber = 9;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        this.currentVolume = currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }
}