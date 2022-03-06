package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class Radio {
    private int currentStationNumber;
    private int currentVolume;
    private int stationAmount = 10;
    private int minVolume = 0;
    private int maxVolume = 100;

    // Сеттер с логикой
    public void setCurrentStationNumber(int currentStationNumber) {
        if (currentStationNumber > (stationAmount - 1)) {
            return;
        }
        this.currentStationNumber = currentStationNumber;
    }

    // Конструктор c 1 аргументом - количество станций
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