package Shapes;

import java.util.Scanner;

public class HinhVuong extends HinhChuNhat {
    Scanner sc = new Scanner(System.in);
    public HinhVuong(){
        ten = "Hinh vuong";
    }
    public void nhapcanh(){
        System.out.print("Canh = ");
        dai = rong = sc.nextFloat();
    }
}