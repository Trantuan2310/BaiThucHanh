import java.util.Scanner;

public class Slide35 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap a = ");
        int a = scanner.nextInt();
        System.out.println("Nhap b = ");
        int b = scanner.nextInt();

        int min;
        if(a<b){
            min = a;
        }else{
            min = b;
        }
        System.out.println("So nho nhat la: "+min);
    }
}