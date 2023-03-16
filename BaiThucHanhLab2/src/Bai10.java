import java.util.Scanner;

public class Bai10 {
    public static void main(String[] args){
        String chuoi;
        char kytu;
        int dem = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao chuoi bat ky: ");
        chuoi = sc.nextLine();
        System.out.print("Nhap vao ky tu bat ky: ");
        kytu = sc.next().charAt(0);
        for (int i = 0; i < chuoi.length(); i++) {
        if (chuoi.charAt(i) == kytu)
        {
            dem++;
        }
    } 
    System.out.println("So lan xuat hien ky tu " + kytu +" trong chuoi " + chuoi + " = " + dem);
    }
}