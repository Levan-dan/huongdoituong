package lopmophongdenpin;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Battery battery = new Battery(100);
        FlashLamp flashLamp = new FlashLamp();
        while (true){
            System.out.println("1. de kiem tra den bat hay tat." + "\n" + "2. Kiem tra phan tram pin. " + "\n" + "3. Bat den" + "\n" + "4. Tat den");
            int chayDen = scanner.nextInt();

            switch (chayDen) {
                case 1:
                    flashLamp.batTat();
                    break;
                case 2:
                    System.out.println("Phan tram pin hien tai la:");
                    int pin = battery.getenergy();
                    System.out.println(pin + "%");
                    break;
                case 3:
                    if(flashLamp.bat()){
                        System.out.println("den da dc bat.");
                    }
                    battery.phanTramPin();
                    break;
                case 4:
                    System.out.println("da tat den.");
                    flashLamp.tat();
                    break;
                default:
                    System.out.println("xem lai menu");
            }
        }


    }
}
