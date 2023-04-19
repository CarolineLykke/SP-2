import java.util.ArrayList;

public class FleetOfCars {

    static ArrayList<Car> fleet = new ArrayList<>();


    public static void addCar(Car car){
        fleet.add(car);

    }
    public int getTotalRegistrationFeeForFleet(){
        int totalFee = 0;
        for (Car car : fleet) {
            totalFee += car.getRegistrationFee();
        }
        return totalFee;

    }

    @Override
    public String toString(){
        String s = "The list of the cars in the store is: " + "\n" ;
        for (Car car : fleet){
            s += car.toString() + "\n";
        }
            return s;
    }
}
