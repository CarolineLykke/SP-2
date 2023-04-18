public class Main {
    public static void main(String[] args) {
        FleetOfCars cars = new FleetOfCars();
        Car g1 = new GasolinCar();
        Car g2 = new GasolinCar();
        Car d1 = new DieselCar();
        Car d2 = new DieselCar();
        Car e1 = new ElectricCar();
        Car e2 = new ElectricCar();


        FleetOfCars.addCar(g1);
        FleetOfCars.addCar(g2);
        FleetOfCars.addCar(d1);
        FleetOfCars.addCar(d2);
        FleetOfCars.addCar(e1);
        FleetOfCars.addCar(e2);
    }
}