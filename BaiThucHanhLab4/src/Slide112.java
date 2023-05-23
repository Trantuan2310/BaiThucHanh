import java.util.ArrayList;
import java.util.Scanner;

public class Slide112 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Slide112 sl = new Slide112();
        ArrayList<Slide112> arr = new ArrayList<>();
        sl.ListStudent(arr);
        System.out.println("Nhap 1 de AddStudent");
        System.out.println("Nhap 2 de RetestStudent");
        System.out.println("Nhap 3 de MaxPoinStudent");
        System.out.println("Nhap 4 de SearchStudent");
        System.out.print("Nhap so tu 1 den 4: ");
        int n = sc.nextInt();
        switch (n) {
            case 1:sl.AddStudent(arr);
                break;
            case 2:sl.RetestStudent(arr);
                break;
            case 3:sl.MaxPoinStudent(arr);
                break;
            case 4:sl.SearchStudent(arr);
            default:System.out.println("So khong hop le.");
                break;
        }
    }

    String Ten;
    float Diem;
    Scanner sc = new Scanner(System.in);
    ArrayList<Slide112> arr = new ArrayList<>(); 

    public void NhapThongTin(){
        System.out.print("\rNhap ten: ");
        Ten = sc.nextLine();
        System.out.print("\rNhap diem: ");
        Diem = sc.nextFloat();
    }

    public void ListStudent(ArrayList<Slide112> arr){
        System.out.print("Nhap vao so Student: ");
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            System.out.printf("Nhap vao phan tu thu %d\n ", i);
            Slide112 sl = new Slide112();
            sl.NhapThongTin();
            arr.add(sl); 
        }
    }

    public void AddStudent(ArrayList<Slide112> arr){
        Slide112 sl = new Slide112();
        sl.NhapThongTin();
        if(sl.Ten.equals("")){
            System.out.println("Khong duoc de trong ten.");
        }else{
            arr.add(sl);
            System.out.println("Them thanh cong.");
        }
    }

    public void RetestStudent(ArrayList<Slide112> arr){
        int dem = 0;
        for(int i = 0; i < arr.size(); i++){
            if(arr.get(i).Diem <= 5){
                System.out.println("Ten: "+ arr.get(i).Ten);
                System.out.println("Diem: "+ arr.get(i).Diem);
                dem++;
            }
        }
        System.out.printf("So Student phai thi lai: %d ", dem);
    }

    public void MaxPoinStudent(ArrayList<Slide112> arr){
        float max = arr.get(0).Diem;
        for(int i = 1; i < arr.size(); i++){
            if(arr.get(i).Diem >= max){
                max = arr.get(i).Diem;
            }
        }
        System.out.println("Cac Student co diem cao nhat");
        for(int i = 0; i < arr.size(); i++){
            if(arr.get(i).Diem == max){
                System.out.println("Ten: "+ arr.get(i).Ten);
                System.out.println("Diem: "+ arr.get(i).Diem);
            }
        }
    }
    
    public void SearchStudent(ArrayList<Slide112> arr){
        String name;
        sc.nextLine();
        System.out.print("Nhap ten: ");
        name = sc.nextLine();
        for(int i = 0; i < arr.size(); i++){
            if(arr.get(i).Ten.equals(name)){
                System.out.println("Ten: " + arr.get(i).Ten);
                System.out.println("Diem: " + arr.get(i).Diem);
                return;
            }
        }
        System.out.println("Student khong ton tai.");
    }
}