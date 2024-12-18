

package ru.netology;

public class Radio {
    private int currentStation; // текущая станция
    private int currentVolume; // громкость звука


    public Radio(int currentStation, int currentVolume) {
        this.currentStation = currentStation;
        this.currentVolume = currentVolume;

    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation >= 0 && currentStation <= 9) {
            this.currentStation = currentStation;
        }
    }

    public void next() {
        if (currentStation == 9) {
            currentStation = 0;
        } else {
            currentStation++;
        }
    }

    public void prev() {
        if (currentStation == 0) {
            currentStation = 9;
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