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

    public float getWhPrKm() {
        int whkm = batteryCapacity*1000;
        int as = whkm/maxRangeKm;
        float a = (float) (as / 91.25);
        float total = (float) (100.0/a);
        return total;

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
        } else { // kmPerLiter is smaller than < 5
            return 10470;
        }
    }

    @Override
    public String toString() {
        return "An electric car with the information: " + getRegistrationNumber() +" "+ getMake() +" "+ getModel() + " " + getNumberOfDoors() + " " + getWhPrKm() + " -- The registration fee is on: " + getRegistrationFee();
    }
}
