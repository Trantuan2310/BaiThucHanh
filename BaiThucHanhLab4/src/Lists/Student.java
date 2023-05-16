package Lists;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Student {
    public String Fullname;
    public int Age;
    Scanner sc = new Scanner(System.in);

    public void NhapThongTin(){
        System.out.print("Nhap ten: ");
        Fullname = sc.nextLine();
        System.out.print("Nhap tuoi: ");
        Age = sc.nextInt();
    }

    public void ListStudent(){
        int n;
        ArrayList<Student> arrListStudent = new ArrayList<>();
        System.out.print("Nhap vao so Student: ");
        n = sc.nextInt();
        for(int i = 0; i < n; i++){
            System.out.printf("Nhap vao Student thu %d\n", i+1);
            Student std = new Student();
            std.NhapThongTin();
            arrListStudent.add(std);
        }
    }

    public void AddStudent(ArrayList<Student> arrListStudent){
        Student std = new Student();
        std.NhapThongTin();
        arrListStudent.add(std);
        System.out.println("Them student thanh cong");
    }

    public void EditStudent(ArrayList<Student> arrListStudent) {
        System.out.print("Nhap chi so cua student muon edit ");
        int index = sc.nextInt();
        if (index >= 0 && index < arrListStudent.size()) {
            Student std = new Student();
            std.NhapThongTin();
            arrListStudent.set(index, std);
            System.out.println("Sua thanh cong");
        } else {
            System.out.println("Chi so khong ton tai");
        }
    }

    public void DeleteStudent(ArrayList<Student> arrListStudent) {
        System.out.print("Nhap vao chi so cua Student muon xoa: ");
        int index = sc.nextInt();
        if (index >= 0 && index < arrListStudent.size()) {
            arrListStudent.remove(index);
            System.out.println("Xoa Student thanh cong.");
        } else {
            System.out.println("Chi so khong ton tai");
        }
    }
    public void ListStudent1(){
        int n;
        LinkedList<Student> ArrListStudent = new LinkedList<>(null);
        System.out.print("Nhap vao so Student: ");
        n = sc.nextInt();
        for(int i = 0; i < n; i++){
            System.out.printf("Nhap vao Student thu %d\n", i+1);
            Student std = new Student();
            std.NhapThongTin();
            ArrListStudent.add(std);
        }
    }

    public void AddStudent1(LinkedList<Student> ArrListStudent){
        Student std = new Student();
        std.NhapThongTin();
        ArrListStudent.add(std);
        System.out.println("Them student thanh cong");
    }

    public void EditStudent1(LinkedList<Student> ArrListStudent) {
        System.out.print("Nhap chi so cua student muon edit ");
        int index = sc.nextInt();
        if (index >= 0 && index < ArrListStudent.size()) {
            Student std = new Student();
            std.NhapThongTin();
            ArrListStudent.set(index, std);
            System.out.println("Sua thanh cong");
        } else {
            System.out.println("Chi so khong ton tai");
        }
    }

    public void DeleteStudent1(LinkedList<Student> ArrListStudent) {
        System.out.print("Nhap vao chi so cua Student muon xoa: ");
        int index = sc.nextInt();
        if (index >= 0 && index < ArrListStudent.size()) {
            ArrListStudent.remove(index);
            System.out.println("Xoa Student thanh cong.");
        } else {
            System.out.println("Chi so khong ton tai");
        }
    }
}