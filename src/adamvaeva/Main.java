package adamvaeva;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Human Eva = new Human("Eva", "Nữ", 60);
        Human Adam = new Human("Adam", "Nam", 80);
        Apple apple = new Apple();
        String resultEva = Eva.resultNu();
        String resultAdam = Adam.resultNam();

        while (true) {
            if (apple.getWeight() == 0) {
                System.out.println("het me tao roi");
            } else {
                System.out.println("Ban muon Adam hay Eva an mieng tao nay.");
                String choAn = scanner.nextLine();
                switch (choAn) {
                    case "Eva":
                        Eva.an();
                        apple.decrease();
                        System.out.println("Sau khi an thi: ");
                        System.out.println(resultEva);
                        System.out.println("Can nang cua Eva luc nay la:");
                        Eva.tangCan();
                        break;
                    case "Adam":
                        Adam.an();
                        apple.decrease();
                        System.out.println("sau khi an thi: ");
                        System.out.println(resultAdam);
                        System.out.println("Can nang cua Adam luc nay la:");
                        Adam.tangCan();

                }

            }


        }
    }

}


