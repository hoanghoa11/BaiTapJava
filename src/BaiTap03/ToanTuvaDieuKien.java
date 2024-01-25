package BaiTap03;

public class ToanTuvaDieuKien {
    static int number1=100;

    public static void setNumber(int n) {
       if (n==number1)
       {
           System.out.println("n bằng 100");
       } else if (n<number1) {
           System.out.println("n nhỏ hơn 100");
       }else
           System.out.println("n lớn hơn 100");
    }
    public static void setn(int n) {
        if (n==number1||n==100)
        {
            System.out.println("n bằng 100");
        } else if (n<number1 && n==0 ) {
            System.out.println("n nhỏ hơn 100 và bằng 0");
        }else
            System.out.println("n lớn hơn 100");
    }

    public static void main(String[] args) {

        setNumber(112);
        setNumber(99);
        setNumber(100);
        setn(100);
        setn(150);
        setn(99);

    }
}
