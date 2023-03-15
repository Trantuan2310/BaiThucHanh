import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        float n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao so bat ky: ");
        n = sc.nextInt();
        if(n % 2 == 0){
            System.out.println("So vua nhap la so chan");
        }
        else{
            System.out.println("So vua nhap la so le");
        }
    }
}
