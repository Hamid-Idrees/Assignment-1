public class Q2 {
    public static void main(String[] args) {
		
		
        double kilometers = 2614;

        // Information
        double mInKm = 1000;
        double ftInKm = 3280.84;
        double inchesInKm = 39370.1;
        double cmInKm = 100000;


        double mDistance = kilometers * mInKm;
        double ftDistance = kilometers * ftInKm;
        double inchesDIstance = kilometers * inchesInKm;
        double cmDistance = kilometers * cmInKm;


        System.out.println("Distance in Kilometers: " + kilometers + " km");
        System.out.println("Distance in Meters: " + mDistance + " m");
        System.out.println("Distance in Feet: " + ftDistance + " ft");
        System.out.println("Distance in Inches: " + inchesDIstance + " in");
        System.out.println("Distance in Centimeters: " + cmDistance + " cm");
    }
}
