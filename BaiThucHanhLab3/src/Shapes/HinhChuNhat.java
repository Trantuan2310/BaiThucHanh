package Shapes;

import java.util.Scanner;

public class HinhChuNhat extends HinhHoc {
    public float dai;
    public float rong;
    Scanner sc = new Scanner(System.in);
    public HinhChuNhat(){
        ten = "Hinh chu nhat";
    }
    public void nhapchieudai(){
        System.out.print("Chieu dai = ");
        dai = sc.nextFloat();
    }
    public void nhapchieurong(){
        System.out.print("Chieu rong = ");
        rong = sc.nextFloat();
    }
    public void tinhchuvi(){
        chuvi = 2 * (dai + rong);
    }
    public void tinhdientich(){
        dientich = dai * rong;
    }
}
