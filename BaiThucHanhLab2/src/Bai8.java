import java.util.Scanner;

public class Bai8 {
    public static void main(String[] args) {
       int n, a, tong = 0;
       float trungbinh;
       Scanner sc = new Scanner(System.in);
        System.out.print("Nhap kich thuoc cua day so: ");
        n = sc.nextInt();
        for(int i = 1; i <= n; i++){
            System.out.printf("Nhap so thu %d: ", i);
            a = sc.nextInt();
            tong += a;
        }
        trungbinh = tong / n;
        System.out.println("Trung bing cong = " + trungbinh);
    }
}
