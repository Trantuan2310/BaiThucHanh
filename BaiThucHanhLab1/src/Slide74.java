import java.util.Scanner;

public class Slide74{
    public static void main(String[] args) {
       int n, tong = 0;
       Scanner sc = new Scanner(System.in);
       do{
       System.out.print("Nhap kich thuoc cho mang: ");
        n = sc.nextInt();
       }while(n<=0);
        int arr[] = new int [n];
        for(int i = 0; i < arr.length; i++)
        {
            do{
                System.out.printf("Nhap vao phan tu thu %d: ",i);
                arr[i] = sc.nextInt();
            }while(n<=0);
        }
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i]%2==0)
            tong += arr[i];
        }
        System.out.println("Tong phan tu chan cua mang la: "+tong);
    }
}