import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao 2 so bat ky tu ban phim: ");
        a = sc.nextInt();
        b = sc.nextInt();
        int tong = a + b;
        System.out.println("Tong cua 2 so: " + tong);
        int hieu = a - b;
        System.out.println("Hieu cua 2 so la: " + hieu);
        int tich = a * b;
        System.out.println("Tich cua 2 so la: " + tich);
        int thuong = a / b;
        System.out.println("Thuong cua 2 so la: " + thuong);
        int phandu = a % b;
        System.out.println("Phan du cua 2 so la: " + phandu);
        System.out.println("Ket qua so sanh bang hai so "+ a +" va "+ b + " la: "+ (a == b));
        System.out.println("Ket qua so sanh lon hon hai so "+ a +" va "+ b + " la: "+ (a > b));
        System.out.println("Ket qua so sanh lon hon hoac bang hai so "+ a +" va "+ b + " la: "+ (a >= b));
        System.out.println("Ket qua so sanh nho hon hai so "+ a +" va "+ b + " la: "+ (a < b));
        System.out.println("Ket qua so sanh nho hon hoac bang hai so "+ a +" va "+ b + " la: "+ (a <= b));
        System.out.println("Ket qua so sanh khac hai so "+ a +" va "+ b + " la: "+ (a != b));
    }
}