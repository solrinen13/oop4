package Cars;


import Drivers.DriverD;
import Mechanics.MechanicSkills;
import Mechanics.MechanicsTeam;
import java.util.List;

public class Bus <D extends DriverD> extends Autopark {
    private D driver;
    private BusCapacity busCapacity;
    public Bus(String brand, String model, double engineVolume, List<MechanicsTeam> mechanic, D driver) {
        super(brand, model, engineVolume,mechanic);
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
    //енум..............................................................................................................
    public enum BusCapacity{
        ESPECIALLY_SMALL(0, 10),
        SMALL(0, 25),
        AVERAGE(40, 50),
        LARGE(60, 80),
        ESPECIALLY_LARGE(100, 120);
        private final Integer lowerLimit;
        private final Integer upperLimit;
        BusCapacity(Integer lowerLimit, Integer upperLimit) {
            if (lowerLimit >= 0 && upperLimit >= 0) {
                this.lowerLimit = lowerLimit;
                this.upperLimit = upperLimit;
            } else {
                throw new IllegalArgumentException("Limits should be positive");
            }
        }
        public int getLowerLimit() {
            return lowerLimit;
        }

        public int getUpperLimit() {
            return upperLimit;
        }
        @Override
        public String toString() {
            if (lowerLimit == 0) {
                return "Вместимость: до " + getUpperLimit() + " мест";
            } else {
                return "Вместимость: " + getLowerLimit() + " - " + getUpperLimit() + " мест";
            }
        }
    }

    public void setBusBodyType(Bus.BusCapacity busCapacity) {
        this.busCapacity = busCapacity;
    }

    public BusCapacity getBusCapacity() {
        return busCapacity;
    }

    @Override
    public void printType() {
        super.printType();
        if (busCapacity == null) {
            System.out.println("Данных по транспортному средству недостаточно");
        } else {
            System.out.println("Тип транспортного средства: " + getBusCapacity().name() + " (" + getBusCapacity().toString() + ")");
        }
    }

    @Override
    public void passDiagnostics() {
        System.out.println("Автобусы не проходят диагностику!!!");
    }

    @Override
    public String toString() {
        return
                "brand='" + brand + '\'' +
                        ", model='" + model + '\'' +
                        ", engineVolume=" + engineVolume;
    }

    @Override
    public void performMaintenance(List<MechanicsTeam> mechanics) {
        System.out.println("Автобус " + getBrand() + " " + getModel() + ", объем двигателя " + getEngineVolume());
        for (MechanicsTeam value : mechanics) {
            if (value.getMechanicSkills() == MechanicSkills.REPAIR_CARS || value.getAbilityToWorkCars() == MechanicSkills.REPAIR_UNIVERSAL) {
                System.out.println("- обслуживает " + value);
            }
        }

    }

    @Override
    public void repairCar(List<MechanicsTeam> mechanics) {
        System.out.println("Автобус " + getBrand() + " " + getModel() + ", объем двигателя " + getEngineVolume());
        for (MechanicsTeam value : mechanics) {
            if (value.getMechanicSkills() == MechanicSkills.REPAIR_BUS || value.getAbilityToWorkCars() == MechanicSkills.REPAIR_UNIVERSAL) {
                System.out.println("- отремонтировал " + value);
            }
        }
    }
}
