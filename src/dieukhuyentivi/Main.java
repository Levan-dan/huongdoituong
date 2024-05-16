package dieukhuyentivi;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Tivi tivi = new Tivi();
        Remote remote = new Remote();

        System.out.println("0. kiem tra trang thai tivi" + "\n"+ "1. bat tivi" + "\n" + "2. tat tivi" +"\n" + "3. chuyen kenh" + "\n" + "4. giam am luong" + "\n" + "5. tang am luong" + "\n" + "6. Kiem tra am luong");

        System.out.println("Moi ban chon chuc nang");
        int chuNang = scanner.nextInt();

        switch (chuNang){
            case 0:
                if(tivi.bat()){
                    System.out.println("Tivi dang bat.");
                }else if(tivi.tat()){
                    System.out.println("Tivi dang tat");
                }else{
                    System.out.println("tivi hong");
                }
                break;
            case 1:
                tivi.bat();
                System.out.println("tivi da dc bat");
                break;
            case 2:
                tivi.tat();
                System.out.println("tivi da dc tat");
                break;
            case 3:
                System.out.println(remote.chuyenKenh(7));
                System.out.println(tivi.chuDe());
                break;
            case 4:
                tivi.giamAmLuong();
                break;
            case 5:
                tivi.tangAmLuong();
                break;
            case 6:
                System.out.println(tivi.amLuongHienTai());
        }
    }
}
