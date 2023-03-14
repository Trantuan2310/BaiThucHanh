import java.util.Scanner;

public class Bai5{
    public static void main(String[] args) {
        int n, tong = 0;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Nhap vao cac so: ");
            n = sc.nextInt();
            tong += n;
            if(tong > 100)
            break;
        }while(n>0);
        System.out.println("Tong = " + tong);
    }
}