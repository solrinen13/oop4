package Drivers;

import Cars.DriverLicenseException;

public class DriverC extends DriverAllGroup{
    public DriverC(String fullName, boolean driverLicense, int workExperience) {
        super(fullName, driverLicense, workExperience);
    }



    @Override
    public String getCategory() {
        return super.getCategory();
    }

    @Override
    public void setCategory(String category)  {
        super.setCategory(category);
        if (getCategory().equals("C")){
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