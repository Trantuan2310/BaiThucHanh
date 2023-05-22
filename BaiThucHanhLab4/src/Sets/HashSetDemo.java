package Sets;

import java.util.HashSet;
import java.util.Scanner;

import Lists.Student;

public class HashSetDemo {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        Student std = new Student();
        HashSet<Student> hashLisStudents = new HashSet<>();
        std.ListStudent(hashLisStudents);
        System.out.println("Nhap 1 de AddStudent");
        System.out.println("Nhap 2 de Editstudent");
        System.out.println("Nhap 3 de DeleteStudent");
        System.out.println("Nhap 4 de DisplayStudent");
        System.out.print("Nhap so tu 1 den 4: ");
        n = sc.nextInt();
        switch (n) {
            case 1:std.AddStudent(hashLisStudents);
                break;
            case 2:std.EditStudent(hashLisStudents);
                break;
            case 3:std.DeleteStudent(hashLisStudents);
                break;
            case 4:std.DisplayStudent(hashLisStudents);
                break;
            default:System.out.println("So khong hop le.");
                break;
        }
    }
}