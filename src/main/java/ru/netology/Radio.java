

package ru.netology;

public class Radio {
    private int currentStation; // текущая станция
    private int currentVolume; // громкость звука
    private int numberOfStation;

    public Radio(int numberOfStation) {
        this.numberOfStation = numberOfStation;
    }

    public Radio() {
        this.numberOfStation = 10;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation >= 0 && currentStation < numberOfStation) {
            this.currentStation = currentStation;
        }
    }

    public void next() {
        if (currentStation < numberOfStation - 1) {
            currentStation++;
        } else {
            currentStation = 0;
        }
    }

    public void prev() {
        if (currentStation == 0) {
            currentStation = numberOfStation - 1;
        } else {
            currentStation--;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    // увеличить громкость
    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume++;
        }
    }

    // уменьшить громкость
    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume--;
        }
    }

}