public class Main {
    public static void main(String[] args) {
        FleetOfCars cars = new FleetOfCars();
        Car g1 = new GasolinCar("ZK45310","Toyota", "Aygo",3,21);
        Car g2 = new GasolinCar("CK84125", "Opel","Corsa",5,19);
        Car d1 = new DieselCar("BW78369","Mercedes", "AMG",5,14,false);
        Car d2 = new DieselCar("AY48568", "Audi","Q5",5,15,true);
        Car e1 = new ElectricCar("ZY25590","Tesla","Model Y", 5,70,533);
        Car e2 = new ElectricCar("FC03092","Tesla","Model x",3,100,450);

        FleetOfCars.addCar(g1);
        FleetOfCars.addCar(g2);
        FleetOfCars.addCar(d1);
        FleetOfCars.addCar(d2);
        FleetOfCars.addCar(e1);
        FleetOfCars.addCar(e2);

        System.out.println(cars.toString());

        System.out.println("Total fee for fleet is: " + cars.getTotalRegistrationFeeForFleet());
    }
}