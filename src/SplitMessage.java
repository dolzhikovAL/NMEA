public interface SplitMessage {
    static   String[]  name1(String typeOfMethod){
        typeOfMethod = typeOfMethod.substring(1, (typeOfMethod.length() - 3));
        String[] masString = typeOfMethod.split(",");
        masString[0] = masString[0].substring(2);
        System.out.println("Type of method =  " + masString[0]);

return masString;
    }
}
