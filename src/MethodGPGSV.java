public class MethodGPGSV implements SplitMessage {
    public static void MethodGSV() {
        String typeOfMethod = "$GPGSV,2,1,08,01,40,083,46,02,17,308,41,12,07,344,39,14,22,228,45*75";
        String[] masString = SplitMessage.name1(typeOfMethod);

        int numOfSat;
        int cornerOnGroundSat;
        int azimuth;
        int signalLevel;

        int countMes = masString[1].equals("") ? 0 : Integer.parseInt(masString[1]);
        int numberOfPac = masString[2].equals("") ? 0 : Integer.parseInt(masString[2]);
        int numbOfVisibleSat = masString[3].equals("") ? 0 : Integer.parseInt(masString[3]);


        System.out.println("Total number of message = " + countMes);
        System.out.println("Message number = " + numberOfPac);
        System.out.println("Satellite in view = " + numbOfVisibleSat);

        for (int i = 4; i <= 16; i += 4) {
            numOfSat = masString[i].equals("") ? 0 : Integer.parseInt(masString[i]);
            cornerOnGroundSat = masString[i + 1].equals("") ? 0 : Integer.parseInt(masString[i + 1]);
            azimuth = masString[i + 2].equals("") ? 0 : Integer.parseInt(masString[i + 2]);
            signalLevel = masString[i + 3].equals("") ? 0 : Integer.parseInt(masString[i + 3]);

            System.out.println("Satellite number =  " + numOfSat);
            System.out.println("Elevation in degrees = " + cornerOnGroundSat);
            System.out.println("Аzimuth in degrees to true = " + azimuth);
            System.out.println("SNR in dB =" + signalLevel);
        }
    }
}


