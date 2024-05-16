package congtacbongden;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Button button = new Button();
        Lamp lamp = new Lamp();
while (true){
    System.out.println("1. Kiem tra trang thai den.");
    System.out.println("2. Bat cong tac.");
    System.out.println("3. Tat cong tac.");

    int nhan = scanner.nextInt();

    switch (nhan){
        case 1:
            lamp.trangThaiBong();
            break;
        case 2:
            button.bongSang();
            lamp.sang();
            break;
        case 3:
            button.bongKhongSang();
            lamp.toi();

    }
}

    }
}
