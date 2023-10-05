public class MathCalc {
    public static void main(String[] args) {
        double earthRadiusMiles = 7600.0;
        double sunRadiusMiles = 865000.0;

        double earthVolume = calculateVolume(earthRadiusMiles);
        double sunVolume = calculateVolume(sunRadiusMiles);
        double ratio = sunVolume / earthVolume;

        System.out.println("The volume of the Earth is " + earthVolume + " cubic miles.");
        System.out.println("The volume of the Sun is " + sunVolume + " cubic miles.");
        System.out.println("The ratio of the volume of the Sun to the volume of the Earth is " + ratio);
    }

    // Function to calculate the volume of a sphere given its radius
    public static double calculateVolume(double radius) {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }
}

