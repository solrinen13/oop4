package Cars;

import Drivers.DriverC;
import Drivers.DriverD;

public class Cargo_Car<C extends DriverC> extends Autopark  {
    private C driver;
    public Cargo_Car(String brand, String model, double engineVolume, C driver) {
        super(brand, model, engineVolume);
        this.driver = driver;
    }
    public void printDriverStartingInformation() {
        System.out.println("Водитель "+getDriver().getFullName() + " управляет автомобилем " + getBrand() + " " + getModel() +
                " и будет участвовать в заезде.");
    }

    public C getDriver() {
        return driver;
    }

    public void setDriver(C driver) {
        this.driver = driver;
    }

    @Override
    public int getPitStop() {
        return super.getPitStop();

    }

    @Override
    public int getBestLapTime() {
        return super.getBestLapTime();
    }

    @Override
    public int getMaxSpeed() {
        return super.getMaxSpeed();
    }

    @Override
    public void setPitStop(int amountOfPitStop) {
        super.setPitStop(amountOfPitStop);
        System.out.println("Грузовик "+getBrand()+getModel()+" совершил питстоп "+getPitStop()+" раз.");
    }

    @Override
    public void setBestLapTime(int minutesOfBestLapTime) {
        super.setBestLapTime(minutesOfBestLapTime);
        System.out.println("Лучшее время грузовика "+getBrand()+getModel()+" достигла "+getBestLapTime());
    }

    @Override
    public void setMaxSpeed(int maxSpeed) {
        super.setMaxSpeed(maxSpeed);
        System.out.println("Максимальная скорость грузовика "+getBrand()+getModel()+" достигла "+getMaxSpeed());
    }
    @Override
    public void startMove() {
        super.startMove();
    }

    @Override
    public void finishMove() {
        super.finishMove();
    }

    @Override
    public String toString() {
        return
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineVolume=" + engineVolume;
    }
}
