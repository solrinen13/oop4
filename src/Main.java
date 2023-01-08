import Cars.Bus;
import Cars.Car;
import Cars.Cargo_Car;
import Drivers.DriverB;
import Drivers.DriverC;
import Drivers.DriverD;

public class Main {
    public static void main(String[] args) {
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
        DriverD driverD4 = new DriverD("Vadim Smirnov", true, 14);

        //легковые
        Car <DriverB> bmwI8 = new Car("BMW","i8",1.5,driverB1);
        Car <DriverB> ferrari488 = new Car("Ferrari","488",4,driverB2);
        Car <DriverB> mercedesAmgGt = new Car("Mercedes","AMG GT",3,driverB3);
        Car <DriverB> jaguarXK = new Car("Jaguar","XK",3.5,driverB4);

        //Автобусы
        Bus <DriverD>  uralNext = new Bus("Ural","Next",6,driverD1);
        Bus <DriverD> paz3206 = new Bus("Paz","3206",5,driverD2);
        Bus <DriverD> mercedesT1408D = new Bus("Mercedes","T1 408D",5,driverD3);
        Bus <DriverD> gaz = new Bus("Gaz","322132",5.5,driverD4);

        //Cargo
        Cargo_Car <DriverC> maz5433 = new Cargo_Car("Maz","5433",11,driverC1);
        Cargo_Car <DriverC> gazelNext = new Cargo_Car("Gazel","Next",9,driverC2);
        Cargo_Car <DriverC> maz6312 = new Cargo_Car("Maz","6312",12,driverC3);
        Cargo_Car <DriverC> renaultMagnum = new Cargo_Car("Renault","Magnum",15,driverC4);



        bmwI8.printDriverStartingInformation();
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
        renaultMagnum.printDriverStartingInformation();
    }
}