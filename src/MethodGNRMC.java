public class MethodGNRMC implements SplitMessage {
    public static void methodRMC() {
        String typeOfMethod = "$GPRMC,001207.00,A,4911.2236,N,12254.4779,W,012.3,201.0,170109,,*2D";
        String[] masString = SplitMessage.name1(typeOfMethod);

        char dataFlag = masString[2].equals("") ? 0 : masString[2].charAt(0);
        double position1 = masString[3].equals("") ? 0 : Double.parseDouble(masString[3]);
        char northOrSouse = masString[4].equals("") ? 0 : masString[4].charAt(0);
        double position2 = masString[5].equals("") ? 0 : Double.parseDouble(masString[5]);
        char westOrEast = masString[6].equals("") ? 0 : masString[6].charAt(0);
        double horizontalVelocity = masString[7].equals("") ? 0 : Double.parseDouble(masString[7]);
        double heading = masString[8].equals("") ? 0 : Double.parseDouble(masString[8]);

        TimeConverter.timeSplit(masString[1]);
        System.out.println("Data validity flag = " + dataFlag);
        System.out.println("Position latitude in degrees, minutes and decimal minutes = " + position1);
        System.out.println("Direction - " + northOrSouse);
        System.out.println("Position latitude in degrees, minutes and decimal minutes = " + position2);
        System.out.println("Direction - " + westOrEast);
        System.out.println("Horizontal velocity = " + horizontalVelocity);
        System.out.println("Heading in degrees = " + heading);
        DataConverter.timeSplit(masString[9]);

    }
}
