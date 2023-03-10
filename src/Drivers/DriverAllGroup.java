package Drivers;

import Cars.DriverLicenseException;

import java.util.Objects;

public class DriverAllGroup {
    private final String fullName;
    private boolean driverLicense;
    private int workExperience;
    protected String category;

    public DriverAllGroup(String fullName, boolean driverLicense, int workExperience) {
        this.fullName = fullName;
        this.driverLicense = driverLicense;
        this.workExperience = workExperience;

    }
    public String getFullName() {
        return fullName;
    }

    public boolean getDriverLicense() {
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
    public String getCategory() {
        return category;
    }

    public void setCategory(String category)  {
        if (category == null || category.isEmpty()) {
            try {
                throw new DriverLicenseException("Driver's licence category have to be specified" +
                        " for the driver " + getFullName());
            } catch (DriverLicenseException e) {
                System.out.println(e.getMessage());
            }
        } else if (category.equals("B") || category.equals("C") || category.equals("D")) {
            this.category = category;
        } else {
            try {
                throw new DriverLicenseException("Driver's licence category have to be specified" +
                        " for the driver " + getFullName());
            } catch (DriverLicenseException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DriverAllGroup that = (DriverAllGroup) o;
        return driverLicense == that.driverLicense && workExperience == that.workExperience && Objects.equals(fullName, that.fullName) && Objects.equals(category, that.category);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, driverLicense, workExperience, category);
    }

    @Override
    public String toString() {
        return "fullName='" + fullName +
                ", driverLicense=" + driverLicense +
                ", workExperience=" + workExperience +
                ", category='" + category
                ;
    }
}
