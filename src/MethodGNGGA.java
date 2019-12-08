public class MethodGNGGA implements TimeConverter {
    public static void MethodGGA() {
        String typeOfMethod = "$GPGGA,000512.00,4910.9588,N,12254.6560,W,1,8,01.1,-00015,M,,M,,0000*5C";
        String[] masString = SplitMessage.name1(typeOfMethod);

        double position1 = masString[2].equals("") ? 0 : Double.parseDouble(masString[2]);
        char northOrSouse = masString[3].equals("") ? 0 : masString[3].charAt(0);
        double position2 = masString[4].equals("") ? 0 : Double.parseDouble(masString[4]);
        char westOrEast = masString[5].equals("") ? 0 : masString[5].charAt(0);
        byte quality = masString[6].equals("") ? 0 : Byte.parseByte(masString[6]);
        byte numberOfSatellites = masString[7].equals("") ? 0 : Byte.parseByte(masString[7]);
        double horizonDilution = masString[8].equals("") ? 0 : Double.parseDouble(masString[8]);
        int seaLevel = masString[9].equals("") ? 0 : Integer.parseInt(masString[9]);


        TimeConverter.timeSplit(masString[1]);
        System.out.println("Position latitude in degrees, minutes and decimal minutes = " + position1);
        System.out.println("North or South ?? - " + northOrSouse);
        System.out.println("Position latitude in degrees, minutes and decimal minutes = " + position2);
        System.out.println("Direction West or East - " + westOrEast);
        System.out.println("GPS quality norm or not - " + quality);
        System.out.println("Number of satellites in use (range 0 to 12) = " + numberOfSatellites);
        System.out.println("Horizontal Dilution of Precision (HDOP) = " + horizonDilution);
        System.out.println("altitude above or below mean sea level in meters = " + seaLevel);
    }
}
