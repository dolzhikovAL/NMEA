public interface TimeConverter {
    static void timeSplit(String s) {
        if (s.equals("")) {
            System.out.println("no Time ");
        } else {
            System.out.println(" UTC time in hours, minutes, seconds, and decimal seconds");
            System.out.println("HH = " + s.substring(0, 2) + " MM = " + s.substring(2, 4) + " SS = " + s.substring(4, 6) + " DS = " + s.substring(7, 9));
        }

    }
}
