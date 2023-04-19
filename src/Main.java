public class Main {
    public static void main(String[] args) {
        FleetOfCars cars = new FleetOfCars();
       /* Car g1 = new GasolinCar();
        Car g2 = new GasolinCar();
        Car d1 = new DieselCar();*/
        Car d2 = new DieselCar("AY48568", "Toyota","Aygo",3,700,false);
        Car e1 = new ElectricCar("ZY25590"," Tesla"," Model Y ", 5,70,533);
       // Car e2 = new ElectricCar();


       /* FleetOfCars.addCar(g1);
        FleetOfCars.addCar(g2);
        FleetOfCars.addCar(d1);*/
        FleetOfCars.addCar(d2);
        FleetOfCars.addCar(e1);
       // FleetOfCars.addCar(e2);
    }
}