package Lists;

import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<Student> ArrListStudent = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        Student std = new Student();
        std.ListStudent();
        int n;
        System.out.println("Chon 1 de AddStudent");
        System.out.println("Chon 2 de EditStudent");
        System.out.println("Chon 3 de DeleteStudent");
        System.out.print("Nhap so: ");
        n = sc.nextInt();
        switch (n) {
            case 1:std.AddStudent1(ArrListStudent);
                break;
            case 2:std.EditStudent1(ArrListStudent);
                break;
            case 3:std.DeleteStudent1(ArrListStudent);
                break;
            default:System.out.println("So khong hop le");
                break;
        }
    }
}
