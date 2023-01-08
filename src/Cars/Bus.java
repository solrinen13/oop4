package Cars;


import Drivers.DriverD;
import com.sun.jdi.connect.Transport;

public class Bus <D extends DriverD> extends Autopark {
    private D driver;
    public Bus(String brand, String model, double engineVolume, D driver) {
        super(brand, model, engineVolume);
        this.driver = driver;
    }


    public D getDriver() {
        return driver;
    }

    public void setDriver(D driver) {
        this.driver = driver;
    }


    public void printDriverStartingInformation() {
        System.out.println("Водитель "+getDriver().getFullName() + " управляет автомобилем " + getBrand() + " " + getModel() +
                " и будет участвовать в заезде.");
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
        System.out.println("Автобус "+getBrand()+getModel()+" совершил питстоп "+getPitStop()+" раз.");
    }

    @Override
    public void setBestLapTime(int minutesOfBestLapTime) {
        super.setBestLapTime(minutesOfBestLapTime);
        System.out.println("Лучшее время автобуса "+getBrand()+getModel()+" достигла "+getBestLapTime());
    }

    @Override
    public void setMaxSpeed(int maxSpeed) {
        super.setMaxSpeed(maxSpeed);
        System.out.println("Максимальная скорость автобуса "+getBrand()+getModel()+" достигла "+getMaxSpeed());
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
