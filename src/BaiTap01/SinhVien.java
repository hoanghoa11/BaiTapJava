package BaiTap01;

import static BaiTap01.ThongTin.showThongTin;

public class SinhVien {

        // biến instane(cục bộ) "name" kiểu Integer, có giá trị mặc định là 0
        public int nam ;

        // biến static "tuoi" kiểu Integer
        public static int tuoi = 21;
    public SinhVien(int nam) {
        this.nam = nam;
    }
    public void showNam() {
        System.out.println( nam);
    }
    public static void main(String[] args) {

        // biến local(nội bộ) "ten" kiểu string sử dụng trong hàm main
         String ten = "Hoang Thi Hoa";

        // Sử dụng biến local bằng cách gọi trực tiếp
        System.out.println("Tên: " + ten);

        // Sử dụng biến toàn cục bằng cách tạo hàm và gọi nó
        SinhVien sv = new SinhVien(2002);
        System.out.print("Năm sinh: " );
        sv.showNam();

        // Sử dụng biến static bằng cách gọi thông qua tên class
        System.out.println("Tuổi: " + tuoi);
        ThongTin tt = new ThongTin();
        tt.setTruong(" UIT ");
        tt.setNganh("HTTT");
        showThongTin();
    }
}
