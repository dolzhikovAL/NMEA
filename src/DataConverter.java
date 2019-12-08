public interface DataConverter {
    static void timeSplit(String s) {
        if (s.equals("")) {
            System.out.println("no Data ");
        } else {
            System.out.println("Data in format ddmmyy is the day, month and year");
            System.out.println("DD = " + s.substring(0, 2) + " MM = " + s.substring(2, 4) + " YY = " + s.substring(4, 6));
        }

    }
}
