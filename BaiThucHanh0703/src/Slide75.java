import java.util.Scanner;

public class Slide75{
    public static void main(String[] args) {
        int sodong, socot, tong = 0;
        Scanner sc = new Scanner(System.in);
        do{
        System.out.print("Nhap so dong cho mang: ");
        sodong = sc.nextInt();
        }while(sodong <= 0);
        do{
        System.out.print("Nhap so cot cho mang: ");
        socot = sc.nextInt();
        }while(socot <= 0);
        int arr[][] = new int [sodong][socot];
        for(int i = 0; i < sodong; i++){
            for(int j = 0; j < socot; j++){
                System.out.printf("Nhap vao phan tu thu [%d][%d]: ", i, j);
                arr[i][j] = sc.nextInt();
            }
        }
        for(int i = 0; i < sodong; i++){
            for(int j = 0; j < socot; j++){
                if(arr[i][j]%2==0)
                tong += arr[i][j];
            }
        }
        System.out.println("Tong phan tu chan cua mang la: "+tong);
    }
}