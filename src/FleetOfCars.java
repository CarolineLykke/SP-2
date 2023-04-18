import java.util.ArrayList;

public class FleetOfCars {

    ArrayList<Car> fleet = new ArrayList<>();


    public void addCar(Car car){
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

    }
}
