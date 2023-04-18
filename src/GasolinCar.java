public class GasolinCar extends AFuelCar {

    public GasolinCar(String registrationNumber, String make, String model, int numberOfDoors, int kmPrLitre) {
        super(registrationNumber, make, model, numberOfDoors, kmPrLitre);
    }

    @Override
    public String getFuelType() {
        return "Gasonlin car";
    }

    public int getRegistrationFee(){
       int kmPerLiter = getKmPrLitre();
        if (kmPerLiter >= 20 && kmPerLiter <= 50) {
            return 330;
        } else if (kmPerLiter >= 15 && kmPerLiter <= 20) {
            return 1050;
        } else if (kmPerLiter >= 10 && kmPerLiter <= 15) {
            return 2340;
        } else if (kmPerLiter >= 5 && kmPerLiter <= 10) {
            return 5500;
        } else { // kmPerLiter er mindre end 5 // < 5
            return 10470;
        }

    }
    @Override
    public String toString(){

        return  "The information about the car you get is: " + getMake() + getModel() + getRegistrationNumber() + getNumberOfDoors() + getKmPrLitre();
    }
}
