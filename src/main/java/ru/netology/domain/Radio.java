package ru.netology.domain;

public class Radio {
    //для переключения станций
    private int currentStation;
    //для переключения громкости
    private int currentVolume;

    public int getCurrentStation() {
        return currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void next() {
        setCurrentStation(currentStation + 1);
    }

    public void prev() {
        setCurrentStation(currentStation - 1);
    }

    public void plusOne() {
        setCurrentVolume(currentVolume + 1);
    }

    public void minusOne() {
        setCurrentVolume(currentVolume - 1);
    }

    public void setCurrentStation(int newStation) {
        int maxStation = 9;
        int minStation = 0;

        if (newStation > maxStation) {
            this.currentStation = minStation;
        } else if (newStation < minStation) {
            this.currentStation = maxStation;
        } else {
            this.currentStation = newStation;
        }
    }

    public void setCurrentVolume(int newVolume) {
        int maxVolume = 10;
        int minVolume = 0;

        if (newVolume >= maxVolume) {
            this.currentVolume = maxVolume;
        } else if (newVolume <= minVolume) {
            this.currentVolume = minVolume;
        } else {
            this.currentVolume = newVolume;
        }
    }
}


