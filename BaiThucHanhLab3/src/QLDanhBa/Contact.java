package QLDanhBa;

import java.util.Scanner;

public class Contact{
    public String ten;
    public String phone;
    public Contact A[];
    public String newPhone;
    Scanner sc = new Scanner(System.in);
    public Contact(String ten, String phone){
        this.ten = ten;
        this.phone = phone;
    }
    public void PhoneBook(){
        int n;
        do{
            System.out.print("Nhap vao so Contact: ");
            n = sc.nextInt();
        }while(n<=0);
        A = new Contact [n];
        sc.nextLine();
        for(int i = 0; i < A.length; i++){
            System.out.printf("Nhap vao Contact thu %d: ", i+1);
            String ten = sc.nextLine();
            String phone = sc.nextLine();
            A[i] = new Contact(ten,phone);
        }
    }
    public void AddContact(){
        System.out.print("Nhap ten: ");
        ten = sc.nextLine();
        System.out.print("Nhap sdt: ");
        phone = sc.nextLine();
        for(int i = 0; i < A.length; i++){
            if(A[i].ten.equals(ten)){
                System.out.print("Contact da ton tai.");
                return;
            }
        }
        System.out.print("Da them Contact moi: "+ ten +" "+ phone +" ");
    }
    public void UpdateContact(){
        System.out.print("Nhap ten: ");
        ten = sc.nextLine();
        System.out.print("Nhap sdt: ");
        phone = sc.nextLine();
        for(int i = 0; i < A.length; i++){
            if(A[i].ten.equals(ten)){
                A[i].phone = newPhone;
                System.out.println("\nCap nhat sdt thanh cong.");
                return;
            }
        }
        System.out.println("\nKhong tim thay Contact.");
    }
    public void DeleteContact(){
        System.out.print("Nhap ten: ");
        ten = sc.nextLine();
        for(int i = 0; i < A.length; i++){
            if(A[i].ten.equals(ten)){
                A[i] = null;
                System.out.println("Xoa contact thanh cong.");
                return;
            }
        }
        System.out.println("Khong tim thay Contact.");
    }
    public void SearchContact(){
        System.out.print("Nhap ten: ");
        ten = sc.nextLine();
        for(int i = 0; i < A.length; i++){
            if(A[i].ten.equals(ten)){
                System.out.println("Sdt cua " + ten + " là: " + A[i].phone);
                return;
            }
        }
        System.out.println("Khong tim thay Contact.");
    }
}