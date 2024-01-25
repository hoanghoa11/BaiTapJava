package BaiTap04;

public class VongLapVaMang {
    public static void main(String[] args) {
        int[] a= new int[25];
        int index = 0; // Biến index để theo dõi vị trí trong mảng a

        for (int i = 0; i < 50; i = i + 2) {
            a[index] = i;
            System.out.println(i);
            index++; // Tăng index lên 1 sau khi thêm giá trị vào mảng a

        }
        System.out.println("\nMảng số chẵn:\n");
        for( int i=0;i<a.length;i++){

            System.out.println(a[i]);
        }
    }
}
