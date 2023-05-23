import java.util.HashMap;
import java.util.Scanner;

public class Slide114 {
    public static void main(String[] args) {
        HashMap <String, Slide114> dssv = new HashMap<String, Slide114>();
        Slide114 sl = new Slide114();
        sl.DanhSach(dssv);
        sl.TimLop(dssv);
        sl.TimMasv(dssv);
    }

    String Masv, HoTen, Lop;
    Scanner sc = new Scanner(System.in);
    HashMap <String, Slide114> dssv = new HashMap<String, Slide114>();

    public void NhapThongTin(){
        System.out.print("Nhap msv: ");
        Masv = sc.nextLine();
        System.out.print("Nhap ten: ");
        HoTen = sc.nextLine();
        System.out.print("Nhap lop: ");
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
        for(String key : dssv.keySet()){
            Slide114 sv = dssv.get(key);
            if(sv.Lop.equals(lop)){
                System.out.println("Msv: " + sv.Masv);
                System.out.println("Ten: " + sv.HoTen);
                System.out.println("Lop: " + sv.Lop);
            }
        }
    }

    public void TimMasv(HashMap <String, Slide114> dssv){
        System.out.print("Nhap msv can tim: ");
        String msv = sc.nextLine();
        if(dssv.containsKey(msv)){
            System.out.println("Ten: " + dssv.get(msv).HoTen);
            System.out.println("Lop: " + dssv.get(msv).Lop);
        }else{
            System.out.println("Khong tim thay.");
        }
   }
}