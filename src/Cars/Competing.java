package Cars;

public interface Competing {


    int getPitStop();

    int getBestLapTime();

    int getMaxSpeed();

    void setPitStop(int amountOfPitStop);

    void setBestLapTime(int minutesOfBestLapTime);

    void setMaxSpeed(int maximumSpeed);
    void printType();

}
