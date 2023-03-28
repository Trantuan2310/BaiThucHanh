import java.util.Scanner;

public class Slide30 {
    public static void main(String[] args) {
        int n;
        int tong = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n = ");
        n = sc.nextInt();
        System.out.print("tong = ");
        int m = n;
        while(n>0){
            System.out.print(n%10+" + ");
            tong+= n%10;
            n/= 10;
        }
        System.out.println("\nTong cac chu so cua "+m+" = "+tong);
    }
}
