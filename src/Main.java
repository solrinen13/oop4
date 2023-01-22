import Cars.*;
import Drivers.DriverAllGroup;
import Drivers.DriverB;
import Drivers.DriverC;
import Drivers.DriverD;
import Mechanics.MechanicSkills;
import Mechanics.MechanicsTeam;


import java.sql.Driver;
import java.util.*;

import static Cars.Autopark.*;

public class Main {
    public static void main(String[] args) throws DriverLicenseException {

       // List<MechanicsTeam> mechanicList = new ArrayList<>();
        MechanicsTeam mechanic1 = new MechanicsTeam("Vladimir", " Neciforov ", "Truck Repair Company", MechanicSkills.REPAIR_TRUCK);
        MechanicsTeam mechanic2 = new MechanicsTeam("Vadim", "Vadimov", "BusRepairHelp", MechanicSkills.REPAIR_BUS);
        MechanicsTeam mechanic3 = new MechanicsTeam("Rosco", "Ros", "oooAutoRepair", MechanicSkills.REPAIR_UNIVERSAL);
        MechanicsTeam mechanic4 = new MechanicsTeam("Reno", "Li", "Bars Auto", MechanicSkills.REPAIR_CARS);
        //mechanicList.add(MechanicsTeam mechanic1);
        addMechanic(mechanic1);
        addMechanic( mechanic2);
        addMechanic(mechanic3);
        addMechanic(mechanic4);


        ArrayList<DriverAllGroup> driverList = new ArrayList<>();
        //Водители
        DriverB driverB1 = new DriverB("Stephan Filch", true, 10);
        DriverB driverB2 = new DriverB("Anthony White", true, 15);
        DriverB driverB3 = new DriverB("John Silver", true, 8);
        DriverB driverB4 = new DriverB("Ivan Ivanov", true, 6);

        DriverC driverC1 = new DriverC("Jonathan Jostar", true, 18);
        DriverC driverC2 = new DriverC("Marko Black", true, 14);
        DriverC driverC3 = new DriverC("Bjorn SteelHand", true, 12);
        DriverC driverC4 = new DriverC("Steven Smith", true, 11);

        DriverD driverD1 = new DriverD("Vasiliy Erhov", true, 8);
        DriverD driverD2 = new DriverD("Romul Smith", true, 9);
        DriverD driverD3 = new DriverD("Todd Coward", true, 5);
        DriverD driverD4 = new DriverD("Todd Coward", true, 5);

        driverList.add(driverB1);
        driverList.add(driverB2);
        driverList.add(driverB3);
        driverList.add(driverB4);

        driverList.add(driverC1);
        driverList.add(driverC2);
        driverList.add(driverC3);
        driverList.add(driverC4);

        driverList.add(driverD1);
        driverList.add(driverD2);
        driverList.add(driverD3);
        driverList.add(driverD4);

        Set<DriverAllGroup> drivers = new HashSet<>();
        drivers.add(driverB1);
        drivers.add(driverB2);
        drivers.add(driverB3);
        drivers.add(driverB4);

        drivers.add(driverC1);
        drivers.add(driverC2);
        drivers.add(driverC3);
        drivers.add(driverC4);

        drivers.add(driverD1);
        drivers.add(driverD2);
        drivers.add(driverD3);
        drivers.add(driverD4);

        Iterator<DriverAllGroup> iterator = drivers.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }


        //почему не выводит значение?
       /* for (int i = 0; i < 12; i++) {
            System.out.println(driverList.get(i));
        }*/

        ArrayList<Autopark> allCars = new ArrayList<>();
        //легковые
        Car <DriverB> car1 = new Car("BMW","i8",1.5, mechanicList,driverB1);
        Car <DriverB> car2 = new Car("Ferrari","488",4,mechanicList, driverB2);
        Car <DriverB> car3 = new Car("Mercedes","AMG GT",3,mechanicList, driverB3);
        Car <DriverB> car4 = new Car("Jaguar","XK",3.5, mechanicList, driverB4);
       // System.out.println(car1);
        //Автобусы
        Bus <DriverD>  bus1 = new Bus("Ural","Next",6,mechanicList,driverD1);
        Bus <DriverD> bus2 = new Bus("Paz","3206",5,mechanicList,driverD2);
        Bus <DriverD> bus3 = new Bus("Mercedes","T1 408D",5,mechanicList,driverD3);
        Bus <DriverD> bus4 = new Bus("Gaz","322132",5.5,mechanicList,driverD4);
        //Cargo
        Cargo_Car <DriverC> cargo1 = new Cargo_Car("Maz","5433",11,mechanicList,driverC1);
        Cargo_Car <DriverC> cargo2 = new Cargo_Car("Gazel","Next",9,mechanicList,driverC2);
        Cargo_Car <DriverC> cargo3 = new Cargo_Car("Maz","6312",12,mechanicList,driverC3);
        Cargo_Car <DriverC> cargo4 = new Cargo_Car("Renault","Magnum",15,mechanicList,driverC4);

        allCars.add(car1);
        allCars.add(car2);
        allCars.add(car3);
        allCars.add(car4);

        allCars.add(bus1);
        allCars.add(bus2);
        allCars.add(bus3);
        allCars.add(bus4);

        allCars.add(cargo1);
        allCars.add(cargo2);
        allCars.add(cargo3);
        allCars.add(cargo4);

        Map<Autopark, MechanicsTeam> mechanicMap = new HashMap<>();
        mechanicMap.put(cargo1,mechanic1);
        mechanicMap.put(cargo2,mechanic3);
        mechanicMap.put(cargo3,mechanic3);
        mechanicMap.put(cargo4,mechanic1);


        //System.out.println(mechanicMap.get(cargo1));
    /*    for (Map.Entry<Autopark, MechanicsTeam> entry : mechanicMap.entrySet()) {
            System.out.println(entry.getKey().getBrand() + " " + entry.getKey().getModel() + ":______: " +
                    entry.getValue());
        }*/


       // allCars.forEach ( System.out::println );

     /*   car1.performMaintenance(mechanicList);
        bus1.performMaintenance(mechanicList);
        //car1.repairCar(mechanicList);
        System.out.println("Данные о водителе автомобиля " + car1.getDriver());
        driverB1.setCategory("B");
        System.out.println("Данные о водителе автомобиля " + bus1.getDriver());
        printMechanicList();*/


       // Напишите программу, с помощью которой можно узнать, как зовут водителя авто, какие механики у нее есть.
    /*    bmwI8.printDriverStartingInformation();
        ferrari488.printDriverStartingInformation();
        mercedesAmgGt.printDriverStartingInformation();
        jaguarXK.printDriverStartingInformation();

        System.out.println("=========================================================================================");

        uralNext.printDriverStartingInformation();
        paz3206.printDriverStartingInformation();
        mercedesT1408D.printDriverStartingInformation();
        gaz.printDriverStartingInformation();

        System.out.println("=========================================================================================");

        maz5433.printDriverStartingInformation();
        gazelNext.printDriverStartingInformation();
        maz6312.printDriverStartingInformation();
        renaultMagnum.printDriverStartingInformation();*/


      /*  bmwI8.setCarBodyType(Car.CarBodyType.SEDAN);
        bmwI8.printType();
        ferrari488.printType();
        System.out.println("=========================================================================================");
        uralNext.setBusBodyType(Bus.BusCapacity.LARGE);
        uralNext.printType();
        System.out.println("=========================================================================================");
        maz5433.setTruckCapacityType(Cargo_Car.TruckCapacityType.N2);
        maz5433.printType();*/


      /*  driverB1.setCategory("B");
        System.out.println(driverB1.getCategory());*/



    }



}
