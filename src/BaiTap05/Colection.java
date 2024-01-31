package BaiTap05;

import java.util.ArrayList;

public class Colection {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        ;
        int index = 0; // Biến index để theo dõi vị trí trong mảng a

        for (int i = 0; i < 50; i = i + 2) {
            list.add(i);
            System.out.println(i);
            index++; // Tăng index lên 1 sau khi thêm giá trị vào mảng a

        }
        for (Integer integer : list) {
            System.out.println(integer);
        }
    }
}
