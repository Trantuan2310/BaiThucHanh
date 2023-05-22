package Lists;

import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListDemo {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        Student std = new Student();
        LinkedList<Student> linkListStudent = new LinkedList<>();
        std.ListStudent(linkListStudent);
        System.out.println("Nhap 1 de AddStudent");
        System.out.println("Nhap 2 de Editstudent");
        System.out.println("Nhap 3 de DeleteStudent");
        System.out.println("Nhap 4 de DisplayStudent");
        System.out.print("Nhap so tu 1 den 4: ");
        n = sc.nextInt();
        switch (n) {
            case 1:std.AddStudent(linkListStudent);
                break;
            case 2:std.EditStudent(linkListStudent);
                break;
            case 3:std.DeleteStudent(linkListStudent);
                break;
            case 4:std.DisplayStudent(linkListStudent);
                break;
            default:System.out.println("So khong hop le.");
                break;
        }
    }
}
