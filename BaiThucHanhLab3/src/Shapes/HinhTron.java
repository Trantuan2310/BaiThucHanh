package Shapes;

import java.util.Scanner;

public class HinhTron extends HinhHoc {
    public float bankinh;
    Scanner sc = new Scanner(System.in);
    public HinhTron(){
        ten = "Hinh Tron";
    }
    public void nhapbankinh(){
        System.out.print("Ban kinh = ");
        bankinh = sc.nextFloat();
    }
    public void tinhchuvi(){
        chuvi = 2 * PI * bankinh;
    }
    public void tinhdientich(){
        dientich = PI * bankinh * bankinh;
    }
}
