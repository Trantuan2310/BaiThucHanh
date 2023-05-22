package Lists;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.HashSet;

public class Student {
    public String Fullname;
    public int Age;
    Scanner sc = new Scanner(System.in);
    ArrayList<Student> arrListStudent = new ArrayList<>();
    LinkedList<Student> linkListStudent = new LinkedList<>();
    HashSet<Student> hashLisStudents = new HashSet<>();
    public void NhapThongTin(){
        System.out.print("Nhap ten: ");
        Fullname = sc.nextLine();
        System.out.print("Nhap tuoi: ");
        Age = sc.nextInt();
    }
    //ArrayList--------------------------------------------------------------------------------------------------------
    public void ListStudent(ArrayList<Student> arrListStudent){
        int n;
        System.out.print("Nhap vao so Student: ");
        n = sc.nextInt();
        for(int i = 0; i < n; i++){
            System.out.printf("Nhap vao Student thu %d\n", i);
            Student std = new Student();
            std.NhapThongTin();
            arrListStudent.add(std);
        }
    }

    public void AddStudent(ArrayList<Student> arrListStudent){
        Student std = new Student();
        std.NhapThongTin();
        for(int i = 0; i < arrListStudent.size(); i++){
            if(arrListStudent.get(i).Fullname.equals(std.Fullname)){
                System.out.println("Student da ton tai");
                return;
            }
        }
        arrListStudent.add(std);
        System.out.println("Them student thanh cong"); 
    }

    public void EditStudent(ArrayList<Student> arrListStudent) {
        System.out.print("Nhap chi so cua student muon edit: ");
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
    public void DisplayStudent(ArrayList<Student> arrListStudent){
        for(int i = 0; i < arrListStudent.size(); i++){
            System.out.printf("Student thu %d\n",i);
            System.out.println("Ten: " + arrListStudent.get(i).Fullname);
            System.out.println("Tuoi: " + arrListStudent.get(i).Age);
        }
    }
    //LinkedList-------------------------------------------------------------------------------------------------------
    public void ListStudent( LinkedList<Student> linkListStudent){
        int n;
        System.out.print("Nhap vao so Student: ");
        n = sc.nextInt();
        for(int i = 0; i < n; i++){
            System.out.printf("Nhap vao Student thu %d\n", i);
            Student std = new Student();
            std.NhapThongTin();
            linkListStudent.add(std);
        }
    }

    public void AddStudent( LinkedList<Student> linkListStudent){
        Student std = new Student();
        std.NhapThongTin();
        for(int i = 0; i < linkListStudent.size(); i++){
            if(linkListStudent.get(i).Fullname.equals(std.Fullname)){
                System.out.println("Student da ton tai");
                return;
            }
        }
        arrListStudent.add(std);
        System.out.println("Them student thanh cong"); 
    }

    public void EditStudent( LinkedList<Student> linkListStudent) {
        System.out.print("Nhap chi so cua student muon edit: ");
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

    public void DeleteStudent( LinkedList<Student> linkListStudent) {
        System.out.print("Nhap vao chi so cua Student muon xoa: ");
        int index = sc.nextInt();
        if (index >= 0 && index < linkListStudent.size()) {
            linkListStudent.remove(index);
            System.out.println("Xoa Student thanh cong.");
        } else {
            System.out.println("Chi so khong ton tai");
        }
    }
    public void DisplayStudent( LinkedList<Student> linkListStudent){
        for(int i = 0; i < linkListStudent.size(); i++){
            System.out.printf("Student thu %d\n",i);
            System.out.println("Ten: " + linkListStudent.get(i).Fullname);
            System.out.println("Tuoi: " + linkListStudent.get(i).Age);
        }
    }

    //HandSet----------------------------------------------------------------------------------------------------------
    public void ListStudent( HashSet<Student> hashLisStudents){
        int n;
        System.out.print("Nhap vao so Student: ");
        n = sc.nextInt();
        for(int i = 0; i < n; i++){
            System.out.printf("Nhap vao Student thu %d\n", i);
            Student std = new Student();
            std.NhapThongTin();
            hashLisStudents.add(std);
        }
    }

    public void AddStudent( HashSet<Student> hashLisStudents){
        Student std = new Student();
        std.NhapThongTin();
        for(Student s : hashLisStudents){
            if(s.Fullname.equals(std.Fullname)){
                System.out.println("Student da ton tai");
                return;
            }
        }
        hashLisStudents.add(std);
        System.out.println("Them student thanh cong");        
    }

    public void EditStudent( HashSet<Student> hashLisStudents) {
        System.out.print("Nhap chi so cua student muon edit: ");
        int index = sc.nextInt();
        if (index >= 0 && index < hashLisStudents.size()) {
            Student std = new Student();
            std.NhapThongTin();
            int i = 0;
            for(Student s : hashLisStudents){
                if(i == index){
                    hashLisStudents.remove(s);
                    hashLisStudents.add(std);
                    System.out.println("Sua thanh cong");
                    return;
                }
                i++;
            }
            }else {
            System.out.println("Chi so khong ton tai");
        }
    }

    public void DeleteStudent(HashSet<Student> hashLisStudents) {
        System.out.print("Nhap vao chi so cua Student muon xoa: ");
        int index = sc.nextInt();
        if (index >= 0 && index < hashLisStudents.size()) {
            hashLisStudents.remove(index);
            System.out.println("Xoa Student thanh cong.");
        } else {
            System.out.println("Chi so khong ton tai");
        }
    }
    public void DisplayStudent( HashSet<Student> hashLisStudents){
        int i = 0;
        for(Student s : hashLisStudents){
            System.out.printf("Student thu %d\n",i);
            System.out.println("Ten: " + s.Fullname);
            System.out.println("Tuoi: " + s.Age);
        }
    }
}   