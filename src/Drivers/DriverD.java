package Drivers;

import Cars.DriverLicenseException;

public class DriverD extends DriverAllGroup{

    public DriverD(String fullName, boolean driverLicense, int workExperience) {
        super(fullName, driverLicense, workExperience);
    }
    @Override
    public boolean getDriverLicense() {
        return super.getDriverLicense();
    }

    @Override
    public void setCategory(String category)  {
        super.setCategory(category);
        if (getCategory().equals("D")){
            this.category = category;
        } else {
            try {
                throw new DriverLicenseException("You must specify the correct permission type" +
                        " for the driver " + getFullName());

            } catch (DriverLicenseException e) {
                this.category = null;
                System.out.println(e.getMessage());
            }
        }


    }
}
