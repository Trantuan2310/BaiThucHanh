import java.util.Scanner;

public class Slide35 {
    public static void main(String[] args) {
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap a = ");
        a = sc.nextInt();
        System.out.print("Nhap b = ");
        b = sc.nextInt();
        int min;
        if(a<b){
            min = a;
        }else{
            min = b;
        }
        System.out.println("So nho nhat la: "+min);
    }
}