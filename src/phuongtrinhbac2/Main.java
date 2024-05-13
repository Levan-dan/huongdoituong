package phuongtrinhbac2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap he so cua A");
        double x = scanner.nextDouble();
        System.out.println("Nhap he so cua B");
        double y = scanner.nextDouble();
        System.out.println("Nhap he so cua C");
        double z = scanner.nextDouble();
        System.out.println("Ta co phuong trinh bac 2 la: ");


        PhuongTrinh phuongTrinhMoi = new PhuongTrinh(x, y, z);
        String phuongTrinhBac2 = phuongTrinhMoi.phuongTrinh();
        System.out.println(phuongTrinhBac2);
        System.out.println("Phuong trinh co ket qua la: ");
        if (phuongTrinhMoi.delta() > 0){
            System.out.println(phuongTrinhMoi.twoDistinctSolutions());
        }else if(phuongTrinhMoi.delta() == 0){
            System.out.println(phuongTrinhMoi.aSingleSolution());
        }else {
            System.out.println(phuongTrinhMoi.noSolution());
        }
    }
}
