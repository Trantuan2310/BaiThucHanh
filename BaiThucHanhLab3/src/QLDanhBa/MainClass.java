package QLDanhBa;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        Contact ct = new Contact("", "");
        ct.PhoneBook();
        System.out.println("Nhap 1 de AddContact");
        System.out.println("Nhap 2 de UpdateContact");
        System.out.println("Nhap 3 de DeleteContact");
        System.out.println("Nhap 4 de SearchContact");
        System.out.print("Nhap vao so tu 1 den 4: ");
        n = sc.nextInt();
        switch (n) {
            case 1:ct.AddContact();  
                break;
            case 2:ct.UpdateContact();
                break;
            case 3:ct.DeleteContact();
                break;
            case 4:ct.SearchContact();
                break;
            default:System.out.println("Nhap khong dung yeu cau");
                break;
        }
    }
}