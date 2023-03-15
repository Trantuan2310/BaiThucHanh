import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        String ten; 
        int namsinh;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao ten: ");
        ten = sc.nextLine();
        System.out.print("Nhap vao nam sinh: ");
        namsinh = sc.nextInt();
        int tuoi = 2023 - namsinh;
        if(tuoi < 16){
            System.out.println(""+ ten +" o do tuoi vi thanh nien");
        }
        else if(tuoi >= 16 && tuoi < 18){
            System.out.println(""+ ten +" o do tuoi truong thanh");
        }
        else{
            System.out.println(""+ ten +" da gia");
        }
    }
}
