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
        boolean partikel = false;
        if(partikel==true) {
            if (kmPerLiter >= 20 && kmPerLiter <= 50) {
                return 330 + 130;
            } else if (kmPerLiter >= 15 && kmPerLiter <= 20) {
                return 1050 + 1390;
            } else if (kmPerLiter >= 10 && kmPerLiter <= 15) {
                return 2340 + 1850;
            } else if (kmPerLiter >= 5 && kmPerLiter <= 10) {
                return 5500 + 2770;
            } else { // kmPerLiter er mindre end 5 // < 5
                return 10470 + 15260;
            }
        } else if (partikel==false){
            return kmPerLiter+1000;
        }
        return kmPerLiter;
    }

    @Override
    public String toString() {
        return "The information about the car you get is: " + getRegistrationNumber() + " " + getMake() + " "+ getModel() + " " +  getNumberOfDoors()+ " " + getKmPrLitre()+ " " + hasParticleFilter();
    }
}
