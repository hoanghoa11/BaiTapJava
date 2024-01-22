package BaiTap01;

public class ThongTin {

    static String truongDaiHoc;
    static String nganhHoc;


    // sử dụng biến tuoi trong phương thức setTuoi
    public void setTruong(String truong) {
        truongDaiHoc = truong;
    }
    public void setNganh(String nganh) {
        nganhHoc = nganh;
    }

    public static void showThongTin() {
        System.out.println("Trường đại học: " + truongDaiHoc);
        System.out.println("Ngành học: " + nganhHoc);
    }
}
