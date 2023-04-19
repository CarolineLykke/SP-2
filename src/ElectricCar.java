public class ElectricCar extends ACar {
    private int batteryCapacity;
    private int maxRangeKm;

    public ElectricCar(String registrationNumber, String make, String model, int numberOfDoors, int batteryCapacity, int maxRangeKm) {
        super(registrationNumber, make, model, numberOfDoors);
        this.batteryCapacity = batteryCapacity;
        this.maxRangeKm = maxRangeKm;
    }


    public int getBatteryCapacityKWh() {
        return batteryCapacity;
    }

    public int getMaxRangeKm() {
        return maxRangeKm;
    }

    public double getWhPrKm() {
        int whkm = batteryCapacity*1000;
        int as = whkm/maxRangeKm;
        double a = as / 91.25;
        return 100 / a;

    }

    public int getRegistrationFee() {
        double whPrKm = getWhPrKm();
        if (whPrKm >= 20 && whPrKm <= 90) {
            return 330;
        } else if (whPrKm >= 15 && whPrKm <= 20) {
            return 1050;
        } else if (whPrKm >= 10 && whPrKm <= 15) {
            return 2340;
        } else if (whPrKm >= 5 && whPrKm <= 10) {
            return 5500;
        } else { // kmPerLiter er mindre end 5 // < 5
            return 10470;
        }
    }

    @Override
    public String toString() {
        return "The information about the car you get is: " + getRegistrationNumber() + getMake() + getModel() + " " + getNumberOfDoors() + " " + getWhPrKm();
    }
}
