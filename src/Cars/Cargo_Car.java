package Cars;

import Drivers.DriverC;
import Drivers.DriverD;
import Mechanics.MechanicSkills;
import Mechanics.MechanicsTeam;

import java.util.List;

public class Cargo_Car<C extends DriverC> extends Autopark  {
    private C driver;
    private TruckCapacityType truckCapacityType;
    public Cargo_Car(String brand, String model, double engineVolume, List<MechanicsTeam> mechanic, C driver) {
        super(brand, model, engineVolume,mechanic);
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
    public enum TruckCapacityType {

        N1(0, 3.5f),
        N2(3.5f, 12),
        N3(12, 0);
        private final float lowerLimit;
        private final float upperLimit;
        TruckCapacityType(float lowerLimit, float upperLimit) {
            if (lowerLimit >= 0 && upperLimit >= 0) {
                this.lowerLimit = lowerLimit;
                this.upperLimit = upperLimit;
            } else {
                throw new IllegalArgumentException("Limits should be positive");
            }
        }
        public float getLowerLimit() {
            return lowerLimit;
        }

        public float getUpperLimit() {
            return upperLimit;
        }
        @Override
        public String toString() {
            if (lowerLimit == 0) {
                return "Грузоподъемность: до " + getUpperLimit() + " тонн";
            } else if (upperLimit == 0) {
                return "Грузоподъемность: свыше " + getLowerLimit() + " тонн";
            } else {
                return "Грузоподъемность: от " + getLowerLimit() + " до " + getUpperLimit() + " тонн";
            }
        }
    }

    public TruckCapacityType getTruckCapacityType() {
        return truckCapacityType;
    }

    public void setTruckCapacityType(TruckCapacityType truckCapacityType) {
        this.truckCapacityType = truckCapacityType;
    }
    @Override
    public void printType() {
        if (truckCapacityType == null) {
            System.out.println("Данных по транспортному средству недостаточно");
        } else {
            System.out.println("Тип транспортного средства: " + getTruckCapacityType().name() + " (" + getTruckCapacityType().toString() + ")");
        }
    }
    @Override
    public String toString() {
        return
                "brand='" + brand + '\'' +
                        ", model='" + model + '\'' +
                        ", engineVolume=" + engineVolume;
    }

    @Override
    public void passDiagnostics() {
        super.passDiagnostics();
    }



    @Override
    public void performMaintenance(List<MechanicsTeam> mechanics) {
        System.out.println("Грузовик " + getBrand() + " " + getModel() + ", объем двигателя " + getEngineVolume());
        for (MechanicsTeam value : mechanics) {
            if (value.getMechanicSkills() == MechanicSkills.REPAIR_TRUCK || value.getAbilityToWorkCars() == MechanicSkills.REPAIR_UNIVERSAL) {
                System.out.println("- обслуживает " + value);
            }
        }

    }

    @Override
    public void repairCar(List<MechanicsTeam> mechanics) {
        System.out.println("Грузовик " + getBrand() + " " + getModel() + ", объем двигателя " + getEngineVolume());
        for (MechanicsTeam value : mechanics) {
            if (value.getMechanicSkills() == MechanicSkills.REPAIR_TRUCK || value.getAbilityToWorkCars() == MechanicSkills.REPAIR_UNIVERSAL) {
                System.out.println("- отремонтировал " + value);
            }
        }
    }
}
