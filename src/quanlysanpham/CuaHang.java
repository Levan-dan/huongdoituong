package quanlysanpham;

import java.util.ArrayList;

public class CuaHang {

    public void themSanPham(ArrayList<String> mangLuu, String namePro) {
        if (!mangLuu.contains(namePro)) {
            mangLuu.add(namePro);

        } else {
            System.out.println("San pham da co trong danh sach.");
        }

    }

    public void showSanPham(ArrayList<String> mangShow) {
        for (String i : mangShow) {
            System.out.print("\"" + i + "\" ");
        }
    }

    public void deleteSanPham(ArrayList<String> mangLuu, String namePro) {
        if (mangLuu.contains(namePro)) {
            mangLuu.remove(namePro);
        } else {
            System.out.println("Khong tim thay ten san pham trong danh sach.");
        }
    }

    public void suaSanPham(ArrayList<String> mangLuu, int viTri, String newPro) {
        mangLuu.set(viTri - 1, newPro);
    }


}





