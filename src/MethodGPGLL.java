public class MethodGPGLL implements SplitMessage, TimeConverter {
    public static void MethodGLL() {

        String typeOfMethod = "$GPGLL,4915.3927,N,12259.8049,W,223636.00,A*18";
        String[] masString = SplitMessage.name1(typeOfMethod);

        double position1 = masString[1].equals("") ? 0 : Double.parseDouble(masString[1]);
        char northOrSouse = masString[2].equals("") ? 0 : masString[2].charAt(0);
        double position2 = masString[3].equals("") ? 0 : Double.parseDouble(masString[3]);
        char westOrEast = masString[4].equals("") ? 0 : masString[4].charAt(0);
        char dataStatus = masString[6].equals("") ? 0 : masString[6].charAt(0);


        System.out.println("Position latitude in degrees, minutes and decimal minutes = " + position1);
        System.out.println("Direction - " + northOrSouse);
        System.out.println("Position latitude in degrees, minutes and decimal minutes = " + position2);
        System.out.println("Direction - " + westOrEast);
        TimeConverter.timeSplit(masString[5]);
        System.out.println("Data status: A = Data valid, V = Data invalid - " + dataStatus);

    }
}















 /*   $GPRMC,001207.00,A,4911.2236,N,12254.4779,W,012.3,201.0,170109,,*2D
    NMEA 0183 v3.0:

    $GPRMC,222414.00,A,4915.3920,N,12259.8072,W,000.2,242.0,211210,,,A*49



    $GPVTG,180.0,T,,M,031.7,N,058.8,K*69
    NMEA 0183 v3.0:

    $GPVTG,023.0,T,,M,029.8,N,055.2,K,A*0D



    $GPGGA,000512.00,4910.9588,N,12254.6560,W,1,8,01.1,-00015,M,,M,,0000*5C


    $GPGSA,A,1,11,11,20,23,32,16,00,00,00,00,00,00,03.1,02.4,02.0*03*/

