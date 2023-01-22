package Mechanics;

import Cars.Autopark;

import java.util.Objects;
import java.util.List;

public class MechanicsTeam {
    private final String firstName;
    private final String lastName;
    private String company;
    private final MechanicSkills mechanicSkills;

    public MechanicsTeam(String firstName, String lastName, String company, MechanicSkills mechanicSkills) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.company = company;
        this.mechanicSkills = mechanicSkills;
    }
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public MechanicSkills getAbilityToWorkCars() {
        return mechanicSkills;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        if (company == null || company.isBlank() || company.isEmpty()) {
            this.company = " Компания не указаана";
        } else {
            this.company = company;
        }
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MechanicsTeam mechanic = (MechanicsTeam) o;
        return Objects.equals(firstName, mechanic.firstName) && Objects.equals(lastName, mechanic.lastName) && Objects.equals(company, mechanic.company)
                && mechanicSkills == mechanic.mechanicSkills;
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, company, mechanicSkills);
    }
    public MechanicSkills getMechanicSkills() {
        return mechanicSkills;
    }


    @Override
    public String toString() {
        return getLastName() + " " + getFirstName() + " из компании: " +
                getCompany() + ". С квалификацией: " + getMechanicSkills();
    }







}
