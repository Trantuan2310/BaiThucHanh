import java.util.Scanner;

public class Slide30 {
    public static void main(String[] args) {
        int n;
        int tong = 0;
        System.out.println("Nhap n = ");

        n = new Scanner(System.in).nextInt();
        int m = n;
        System.out.print("tong = ");
        while(n>0){
            System.out.print(n%10+" + ");
            tong+= n%10;
            n/= 10;
        }
        System.out.println("Tong cac chu so cua "+m+" = "+tong);
    }
}
