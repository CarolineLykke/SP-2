public class DieselCar extends AFuelCar {
    private boolean hasParticleFilter;

    public DieselCar(String registrationNumber, String make, String model, int numberOfDoors, int kmPerLiter, boolean hasParticleFilter) {
        super(registrationNumber, make, model, numberOfDoors, kmPerLiter);
        this.hasParticleFilter = hasParticleFilter;
    }


    public boolean hasParticleFilter() {
        return hasParticleFilter;
    }

    @Override
    public String getFuelType() {
        return "Diesel car";
    }

    public int getRegistrationFee() {
        int kmPerLiter = getKmPrLitre();
        boolean partikel = hasParticleFilter();
        if (partikel == true) {
            if (kmPerLiter >= 20 && kmPerLiter <= 50) {
                return 460;
            } else if (kmPerLiter >= 15 && kmPerLiter <= 20) {
                return 2440;
            } else if (kmPerLiter >= 10 && kmPerLiter <= 15) {
                return 4190;
            } else if (kmPerLiter >= 5 && kmPerLiter <= 10) {
                return 8270;
            } else { // kmPerLiter er mindre end 5 // < 5
                return 10470 + 15260;
            }
        } else if (partikel == false) {
            if (kmPerLiter >= 20 && kmPerLiter <= 50) {
                return 1460;
            } else if (kmPerLiter >= 15 && kmPerLiter <= 20) {
                return 3440;
            } else if (kmPerLiter >= 10 && kmPerLiter <= 15) {
                return 5190;
            } else if (kmPerLiter >= 5 && kmPerLiter <= 10) {
                return 9270;
            } else { // kmPerLiter er mindre end 5 // < 5
                return 26730;
            }

        }
        return kmPerLiter;
    }

    @Override
    public String toString() {
        return "The information about the car you get is: " + getRegistrationNumber() + " " + getMake() + " "+ getModel() + " " +  getNumberOfDoors()+ " " + getKmPrLitre()+ " " + hasParticleFilter()+ " " + getRegistrationFee();
    }
}
