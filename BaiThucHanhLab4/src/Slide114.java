import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Slide114 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        HashMap <String, Slide114> dssv = new HashMap<String, Slide114>();
        Slide114 sl = new Slide114();
        sl.DanhSach(dssv);
        System.out.println("Nhap 1 de hien thi danh sach sinh vien theo lop.");
        System.out.println("Nhap 2 de hien thi sinh vien theo Masv. ");
        System.out.print("Nhap so: ");
        n = sc.nextInt();
        switch (n) {
            case 1:sl.TimLop(dssv);
                break;
            case 2:sl.TimMasv(dssv);
                break;
            default:System.out.println("So khong hop le.");
                break;
        }
    }

    String Masv, HoTen, Lop;
    Scanner sc = new Scanner(System.in);
    HashMap <String, Slide114> dssv = new HashMap<String, Slide114>();

    public void NhapThongTin(){
        System.out.print("\rNhap msv: ");
        Masv = sc.nextLine();
        System.out.print("\rNhap ten: ");
        HoTen = sc.nextLine();
        System.out.print("\rNhap lop: ");
        Lop = sc.nextLine();
    }

    public void DanhSach(HashMap <String, Slide114> dssv){
        System.out.print("Nhap so luong sinh vien: ");
        int n = sc.nextInt();
        sc.nextLine();
        for(int i = 0; i < n; i++){
            System.out.printf("Nhap vao sinh vien thu %d\n ", i);
            Slide114 sl = new Slide114();
            sl.NhapThongTin();
            dssv.put(Masv, sl);
        }
    }

    public void TimLop(HashMap <String, Slide114> dssv){
        System.out.print("Nhap lop can tim: ");
        String lop = sc.nextLine();
        for(Map.Entry<String, Slide114> entry:dssv.entrySet()){
            Slide114 sl = entry.getValue();
            if(sl.Lop.equals(lop)){
                System.out.println("Ten: " + sl.HoTen);
                System.out.println("Msv: " + sl.Masv);
            }
        }
    }

    public void TimMasv(HashMap <String, Slide114> dssv){
        System.out.print("Nhap msv can tim: ");
        String msv = sc.nextLine();
        for(Map.Entry<String, Slide114> entry:dssv.entrySet()){
            Slide114 sl = entry.getValue();
            if(sl.Masv.equals(msv)){
                System.out.println("Ten: " + sl.HoTen);
                System.out.println("Msv: " + sl.Masv);
            }
        }
   }
}