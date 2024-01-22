package BaiTap02;

public class Caculator {
     static int Tong(int a, int b){
        return a+b;
    }
    static double Tich(float a, float b){
        return a*b;
    }

    public static void main(String[] args) {
        int a;
        double b;
        a=Tong(111,222);
        System.out.println("Tổng của 2 số nguyên là:"+ a);
        b=Tich(11.5F,22.2F);
        System.out.println("Tích của 2 số thực là:"+b);


    }
}
