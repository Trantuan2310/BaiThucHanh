package Lists;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Student> arrListStudent = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        Student std = new Student();
        std.ListStudent();
        int n;
        System.out.println("Chon 1 de AddStudnet");
        System.out.println("Chon 2 de EditStudnet");
        System.out.println("Chon 3 de DeleteStudnet");
        System.out.print("Nhap so: ");
        n = sc.nextInt();
        switch (n) {
            case 1:std.AddStudent(arrListStudent);
                break;
            case 2:std.EditStudent(arrListStudent);
                break;
            case 3:std.DeleteStudent(arrListStudent);
                break;
            default:System.out.println("So khong hop le");
                break;
        }
    }
}
