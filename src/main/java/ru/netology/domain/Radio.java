package ru.netology.domain;

public class Radio {

    private int currentStation;
    private int currentVolume;
    private int maxStation = 9;
    private int minStation = 0;
    private int maxVolume = 100;
    private int minVolume = 0;
    private int quantity = 10; //общее количество станций

    public Radio() {
    }

    public Radio(int currentStation, int maxStation, int minStation, int quantity) {
        this.currentStation = currentStation;
        this.maxStation = maxStation;
        this.minStation = minStation;
        this.quantity = quantity;
    }

    public Radio(int currentVolume, int maxVolume, int minVolume) {
        this.currentVolume = currentVolume;
        this.maxVolume = maxVolume;
        this.minVolume = minVolume;
    }

    public Radio(int quantity) {
        this.quantity = quantity;
    }

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
        if (newStation > maxStation) {
            this.currentStation = minStation;
        } else if (newStation < minStation) {
            this.currentStation = maxStation;
        } else {
            this.currentStation = newStation;
        }
    }

    public void setCurrentVolume(int newVolume) {


        if (newVolume >= maxVolume) {
            this.currentVolume = maxVolume;
        } else if (newVolume <= minVolume) {
            this.currentVolume = minVolume;
        } else {
            this.currentVolume = newVolume;
        }
    }

    public int getQuantity() {
        return quantity;
    }
}


