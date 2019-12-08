public class MethodGNGSA {
    public static void methodGSA() {
        String typeOfMethod = " $GPGSA,A,1,11,11,20,23,32,16,00,00,00,00,00,00,03.1,02.4,02.0*03";
        String[] masString = SplitMessage.name1(typeOfMethod);
        byte idSatellite;

        char mode = masString[1].equals("") ? 0 : masString[2].charAt(0);
        byte fixMode = masString[2].equals("") ? 0 : Byte.parseByte(masString[2]);
        double percentDOP = masString[15].equals("") ? 0 : Double.parseDouble(masString[15]);
        double horizontalDOP = masString[16].equals("") ? 0 : Double.parseDouble(masString[16]);
        double verticalDOP = masString[17].equals("") ? 0 : Double.parseDouble(masString[17]);

        System.out.println("Receiver mode:( A = automatic; M = manual) = " + mode);
        System.out.println("fix mode: (1 = fix not available; 2 = 2D; 3 = 3D) = " + fixMode);
        for (int i = 3; i < 15; i++) {
            idSatellite = masString[i].equals("") ? 0 : Byte.parseByte(masString[i]);
            System.out.println("ID of  satellite used in the fix = " + idSatellite);
        }
        System.out.println("Percent DOP value = " + percentDOP);
        System.out.println("Horizontal DOP value = " + horizontalDOP);
        System.out.println("Vertical DOP value = " + verticalDOP);

    }
}
