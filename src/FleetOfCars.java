import java.util.ArrayList;

public class FleetOfCars {

    static ArrayList<Car> fleet = new ArrayList<>();


    public static void addCar(Car car){
        fleet.add(car);
        System.out.println(fleet);

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
        return "the list of the cars in the store is: " + fleet + "and how much the total fee is: " + getTotalRegistrationFeeForFleet();
    }
}
