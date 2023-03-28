import java.util.Scanner;

public class Slide47 {
    public static void main(String[] args) {
        int sum = 0, n;
        Scanner sc = new Scanner(System.in); 
        do {
            System.out.print("Nhap vao cac so:");
            n = sc.nextInt();
            sum += n;
            if (sum > 100)
                break;
        } while (n > 0);
        System.out.println("Tong = " + sum);
    }
}