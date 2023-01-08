package Cars;
import java.util.Objects;
public  class Autopark implements Competing {

    private static final String DEFAULT_VALUE = "default";
    private static final double DEFAULT_ENGINE_VOLUME = 8.0;
    protected final String brand;
    protected final String model;
    protected double engineVolume;
    private int amountOfPitStop;
    private int minutesOfBestLapTime;
    private int maxSpeed;


    public Autopark(String brand, String model, double engineVolume) {
        this.brand = validateStringArgument(brand);
        this.model = validateStringArgument(model);
        this.engineVolume = validateEngineVolumeArgument(engineVolume);
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = validateEngineVolumeArgument(engineVolume);
    }



    public void startMove() {
        System.out.println("The " + getBrand() + " " + getModel() + " starts moving.");
    }

    public void finishMove() {
        System.out.println("The " + getBrand() + " " + getModel() + " finishes moving.");
    }

    private String validateStringArgument(String stringValue) {
        if (stringValue == null || stringValue.isEmpty() || stringValue.isBlank()) {
            return DEFAULT_VALUE;
        } else {
            return stringValue;
        }
    }

    private double validateEngineVolumeArgument(double engineVolume) {
        if (engineVolume <= 0) {
            return DEFAULT_ENGINE_VOLUME;
        } else {
            return engineVolume;
        }
    }

    private int validateIntegerArgument(int integerArgument) {
        return Math.max(integerArgument, 0);
    }


    //интерфейсные гетеры и сетеры
    @Override
    public int getPitStop() {
        return amountOfPitStop;
    }

    @Override
    public int getBestLapTime() {
        return minutesOfBestLapTime;
    }

    @Override
    public int getMaxSpeed() {
        return maxSpeed;
    }


    @Override
    public void setPitStop(int amountOfPitStop) {
        this.amountOfPitStop = validateIntegerArgument(amountOfPitStop);
    }

    @Override
    public void setBestLapTime(int minutesOfBestLapTime) {
        this.minutesOfBestLapTime = validateIntegerArgument(minutesOfBestLapTime);
    }

    @Override
    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = validateIntegerArgument(maxSpeed);
    }

    @Override
    public void printType() {

    }
    //исключения......................................................................................................
    public  void passDiagnostics(){
        System.out.println("Диагностика проведена");
    }

}