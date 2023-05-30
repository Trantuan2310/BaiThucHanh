import java.util.Scanner;

public class Slide{
    public static void main(String[] args) {
        int n;
        int arr[];
        Scanner sc = new Scanner(System.in);
        do{
            System.out.print("Nhap vao kich thuoc cua mang: ");
            n = sc.nextInt();
        }while(n<=0);
        arr = new int [n];
        try {
            for(int i =0; i < arr.length; i++){
                System.out.printf("Nhap vao phan tu thu %d: ", i);
                arr[i] = sc.nextInt();
            }
        } catch (Exception e) {
            System.out.println("Nhap sai du lieu");
        }
        finally{
            System.out.println("Khong co loi");
        }
    }
}