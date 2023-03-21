import java.util.Scanner;

public class nhanvien {
    String hoten;
    int namsinh;
    float hesoluong;
    float luong;
    Scanner sc = new Scanner(System.in);
    public void nhaphoten(){
        System.out.print("Nhap vao ho ten nhan vien: ");
        hoten = sc.nextLine();
    }
    public void nhapnamsinh(){
        System.out.print("Nhap nam sinh cua nhan vien: ");
        namsinh = sc.nextInt();
    }
    public void nhaphesoluong(){
        System.out.print("Nhap he so luong cua nhan vien: ");
        hesoluong = sc.nextFloat();
    }
    public void tinhluong(){
        luong = hesoluong * 1490000;
        System.out.println("Luong cua nhan vien la: "+ luong);
    }
    public void inrathongtinnhanvien(){
        System.out.printf("Nhan vien %s - nam sinh %d - luong %f",hoten, namsinh, luong);
    }
}
