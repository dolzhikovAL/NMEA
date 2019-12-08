import java.util.Scanner;

public class SatelliteMain {
    public static void main(String[] args) {
        System.out.println("Выберите тип обрабатываемого сообщения");
        System.out.println("1-GNGLL | 2-GLGSV,GPGSV  | 3-GNRMC| 4-GNVTG| 5-GNGGA| 6-GNGSA ");
        Scanner scanner = new Scanner(System.in);
        int method = scanner.nextInt();
        switch (method) {
            case 1:
                MethodGPGLL.MethodGLL();
                break;
            case 2:
                MethodGPGSV.MethodGSV();
                break;
            case 3:
                MethodGNRMC.methodRMC();
                break;
            case 4:
                MethodGNVTG.MethodVTG();
                break;
            case 5:
                MethodGNGGA.MethodGGA();
                break;
            case 6:
                MethodGNGSA.methodGSA();
                break;
            default:
                System.out.println("Неверный номер метода");


        }
    }


}

