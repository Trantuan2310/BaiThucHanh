import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        do{
        System.out.print("Nhap vao mot so nguyen duong bat ky tu ban phim: ");
        n = sc.nextInt();
        }while(n <= 0);
        int gt = 1;
        for(int i = 1; i <= n; i++)
        {
            gt *= i;
        }
        System.out.println("Giai thua cua "+ n +" la: " + gt);
    }
}
