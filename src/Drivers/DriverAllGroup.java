package Drivers;

public class DriverAllGroup {
    private final String fullName;
    private boolean driverLicense;
    private int workExperience;

    public DriverAllGroup(String fullName, boolean driverLicense, int workExperience) {
        this.fullName = fullName;
        this.driverLicense = driverLicense;
        this.workExperience = workExperience;
    }
    public String getFullName() {
        return fullName;
    }

    public boolean isDriverLicense() {
        return driverLicense;
    }

    public void setDriverLicense(boolean driverLicense) {
        this.driverLicense = driverLicense;
    }

    public int getWorkExperience() {
        return workExperience;
    }

    public void setWorkExperience(int workExperience) {
        this.workExperience = workExperience;
    }


    public void startMoving() {
        System.out.println(getFullName() + " начал движение.");
    }

    public void stop() {
        System.out.println(getFullName() + " остановился.");
    }

    public void refuelTheTransport() {
        System.out.println(getFullName() + " заправил транспорт.");
    }
}
