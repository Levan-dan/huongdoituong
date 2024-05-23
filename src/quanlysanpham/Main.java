package quanlysanpham;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        ArrayList<String> luuTru = new ArrayList<>();
        CuaHang cuaHang = new CuaHang();
        while (true) {

            System.out.println("1. Thêm sản phẩm mới vào cửa hàng." + "\n" +
                    "2. Sửa sản phẩm trong menu." + "\n" +
                    "3. Xóa sản phẩm khỏi menu." + "\n"
            );
            System.out.println(" ==> Nhập thao tác cần thực hiện.");
            int quanLyCuaHang = scanner1.nextInt();


            switch (quanLyCuaHang) {
                case 1:
                    System.out.println("---> Mời nhập sản phẩm cần thêm vào cửa hàng.");
                    String sanPhamMoi = scanner.nextLine();
                    if(sanPhamMoi.isEmpty()){
                        System.out.println("Bạn chưa nhập sản phẩm.");
                    }else{
                        cuaHang.themSanPham(luuTru, sanPhamMoi);

                        System.out.println();
                        System.out.println(">>>Cửa hàng đang có các sản phẩm sau: ");
                        cuaHang.showSanPham(luuTru);
                        System.out.println();
                    }
                    break;
                case 2:
                    System.out.println("---> Bạn muốn sửa sản phẩm ở vị trí nào.");
                    int index = scanner1.nextInt();
                    System.out.println("---> Nhập sản phẩm mới.");
                    String sanPhamThay = scanner.nextLine();
                    cuaHang.suaSanPham(luuTru, index, sanPhamThay);

                    System.out.println();
                    System.out.println(">>>Cửa hàng đang có các sản phẩm sau: ");
                    cuaHang.showSanPham(luuTru);
                    System.out.println();
                    break;
                case 3:
                    System.out.println("---> Bạn muốn xóa sản phẩm nào.");
                    String sanPhamXoa = scanner.nextLine();
                    if (luuTru.contains(sanPhamXoa)) {
                        System.out.println("---> Bạn co chắc muốn xóa không." + "\n" +
                                "1. Đồng ý" + "\n" +
                                "2. Thoát" + "\n");
                        int chonlua = scanner1.nextInt();
                        switch (chonlua) {
                            case 1:
                                cuaHang.deleteSanPham(luuTru, sanPhamXoa);
                                System.out.println();
                                System.out.println(">>>Cửa hàng đang có các sản phẩm sau: ");
                                cuaHang.showSanPham(luuTru);
                                System.out.println();
                                break;
                            case 2:
                                System.out.println("---> Thao tác đã bị hủy.");

                                System.out.println();
                                System.out.println(">>>Cửa hàng đang có các sản phẩm sau: ");
                                cuaHang.showSanPham(luuTru);
                                System.out.println();
                                break;
                        }

                    } else {
                        System.out.println("xxx Sản phẩm bạn muốn xóa không có trong cửa hàng.");
                    }
            }


        }
    }
}
