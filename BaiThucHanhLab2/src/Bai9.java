import java.util.Scanner;

public class Bai9 {
    public static void main(String[] args) {
        String chuoi;
        int so = 0, kytuthuong = 0, kytuhoa = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao chuoi bat ky: ");
        chuoi = sc.nextLine();
        for(int i = 0; i < chuoi.length(); i++){
            if(Character.isDigit(chuoi.charAt(i))){
                so++;
            }
            if(Character.isLowerCase(chuoi.charAt(i))){
                kytuthuong++;
            }
            if(Character.isUpperCase(chuoi.charAt(i))){
                kytuhoa++;
            }
        }
        System.out.println("co "+ so++ +" so trong chuoi");
        System.out.println("co "+ kytuthuong++ +" ky tu thuong trong chuoi");
        System.out.println("co "+ kytuhoa++ +" ky tu hoa trong chuoi");
    }
}
