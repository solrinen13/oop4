package Cars;

import Drivers.DriverB;
import Mechanics.MechanicSkills;
import Mechanics.MechanicsTeam;

import java.util.List;

public class Car<B extends DriverB> extends Autopark {
    private B driver;
    private CarBodyType carBodyType;

    public Car(String brand, String model, double engineVolume, List<MechanicsTeam> mechanic,  B driver) {
        super(brand, model, engineVolume,mechanic);
        this.driver = driver;
    }

    public void printDriverStartingInformation() {
        System.out.println("Водитель " + getDriver().getFullName() + " управляет автомобилем " + getBrand() + " " + getModel() +
                " и будет участвовать в заезде.");
    }

    public B getDriver() {
        return driver;
    }

    public void setDriver(B driver) {
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
        System.out.println("Легковая машина " + getBrand() + getModel() + " совершила питстоп " + getPitStop() + " раз.");
    }

    @Override
    public void setBestLapTime(int minutesOfBestLapTime) {
        super.setBestLapTime(minutesOfBestLapTime);
        System.out.println("Лучшее время легковой машины " + getBrand() + getModel() + " достигла " + getBestLapTime());
    }

    @Override
    public void setMaxSpeed(int maxSpeed) {
        super.setMaxSpeed(maxSpeed);
        System.out.println("Максимальная скорость легковой машины " + getBrand() + getModel() + " достигла " + getMaxSpeed());
    }


    @Override
    public void startMove() {
        super.startMove();
    }

    @Override
    public void finishMove() {
        super.finishMove();
    }


    // кузов енум ..........................................................................................
    public enum CarBodyType {

        SEDAN("Седан"),
        HATCHBACK("Хетчбек"),
        COUPE("Купе"),
        STATION_WAGON("Универсал"),
        SPORT_UTILITY_VEHICLE("Внедорожник"),
        CROSSOVER("Кроссовер"),
        PICKUP("Пикап"),
        VAN("Фургон"),
        MINIVAN("Минивэн");
        private final String russianTranslate;

        CarBodyType(String russianTranslate) {
            this.russianTranslate = russianTranslate;
        }

        public String getRussianTranslate() {
            return russianTranslate;
        }

        @Override
        public String toString() {
            return "Тип кузова: " + getRussianTranslate();
        }
    }

    public CarBodyType getCarBodyType() {
        return carBodyType;
    }

    public void setCarBodyType(CarBodyType carBodyType) {
        this.carBodyType = carBodyType;
    }

    @Override
    public void printType() {
        super.printType();
        if (carBodyType == null) {
            System.out.println("Данных по транспортному средству недостаточно");
        } else {
            System.out.println("Тип транспортного средства: " + getCarBodyType().name() + " (" + getCarBodyType().toString() + ")");
        }
    }

    // тостринг...............................................................................................
    @Override
    public String toString() {
        return
                "brand='" + brand + '\'' +
                        ", model='" + model + '\'' +
                        ", engineVolume=" + engineVolume
                        + " Тип кузова: " + carBodyType;
    }

    @Override
    public void passDiagnostics() {
        super.passDiagnostics();
    }

    @Override
    public void performMaintenance(List<MechanicsTeam> mechanics) {
        System.out.println("Автомобиль " + getBrand() + " " + getModel() + ", объем двигателя " + getEngineVolume());
        for (MechanicsTeam value : mechanics) {
            if (value.getMechanicSkills() == MechanicSkills.REPAIR_CARS || value.getAbilityToWorkCars() == MechanicSkills.REPAIR_UNIVERSAL) {
                System.out.println("- обслуживает " + value);
            }
        }

    }

    @Override
    public void repairCar(List<MechanicsTeam> mechanics) {
        System.out.println("Автомобиль " + getBrand() + " " + getModel() + ", объем двигателя " + getEngineVolume());
        for (MechanicsTeam value : mechanics) {
            if (value.getMechanicSkills() == MechanicSkills.REPAIR_CARS || value.getAbilityToWorkCars() == MechanicSkills.REPAIR_UNIVERSAL) {
                System.out.println("- отремонтировал " + value);
            }
        }
    }
}
