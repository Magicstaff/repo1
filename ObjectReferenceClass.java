import java.util.Locale;

public class ObjectReferenceClass {

    public static void main(String[] args) {
        Byte numberOfSeats = 5;
        Short horsePower = 392;
        Integer price = 14999;
        Long registrationNumber = 78877887878787l;

        Float fuelConsumption = 15.5F;
        Double fuelConsumptionPrecise = 15.5454545454545454;

        Boolean isDamaged = true;
        Character energyEfficiencyCategory = 'G';

        String carModel = " DodgeChallenger SRT 392";
        String carModelNew = new String (" DodgeChallenger SRT 392" );

        System.out.println("Number of seatss" + numberOfSeats);
        System.out.println("Horsepower" + horsePower);
        System.out.println("Price: $" + price.floatValue());
        System.out.println("Reg number" + registrationNumber);
        System.out.println("Combined fuel" + fuelConsumption);
        System.out.println("Fuel consumption precise" + fuelConsumptionPrecise.intValue());
        System.out.println("This car is danaged" + isDamaged);
        System.out.println("Energy efficiency category" + energyEfficiencyCategory);

        System.out.println("The car model" + carModel.toUpperCase());
        System.out.println("The car model" + carModel.toLowerCase());
        System.out.println("The car model and car model with new keywords are equals" + carModel.equals(carModelNew));
        System.out.println("The car model with new keyword" + carModelNew);
    }
}
