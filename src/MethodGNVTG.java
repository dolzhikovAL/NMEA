public class MethodGNVTG implements SplitMessage {
    public static void MethodVTG() {
        String typeOfMethod = "$GPVTG,180.0,T,,M,031.7,N,058.8,K*69";
        String[] masString = SplitMessage.name1(typeOfMethod);

        double heading = masString[1].equals("") ? 0 : Double.parseDouble(masString[1]);
        char chech = masString[2].equals("") ? 0 : masString[2].charAt(0);
        double headingMagneto = masString[3].equals("") ? 0 : Double.parseDouble(masString[3]);
        char magneto = masString[4].equals("") ? 0 : masString[4].charAt(0);
        double horizontalVelocityKnots = masString[5].equals("") ? 0 : Double.parseDouble(masString[5]);
        char knots = masString[6].equals("") ? 0 : masString[6].charAt(0);
        double horizontalVelocityKInH = masString[7].equals("") ? 0 : Double.parseDouble(masString[7]);
        char kilometersInHour = masString[8].equals("") ? 0 : masString[8].charAt(0);

        System.out.println("Heading over ground in degrees = " + heading);
        System.out.println("True ?? - " + chech);
        System.out.println("heading over ground in degrees Magnetic = " + headingMagneto);
        System.out.println("Magnetic ?? - " + magneto);
        System.out.println("Horizontal velocity over ground in knots = " + horizontalVelocityKnots);
        System.out.println("Knots ?? -" + knots);
        System.out.println("Horizontal velocity over ground in km/h = " + horizontalVelocityKInH);
        System.out.println("Kilometers ?? - " + kilometersInHour);
    }

}
