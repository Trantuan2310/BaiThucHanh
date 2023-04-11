package Shapes;

import java.util.Scanner;

public class HinhTru extends HinhTron {
    public float chieucao;
    Scanner sc = new Scanner(System.in);
    public HinhTru(){
        ten = "Hinh Tru";
    }
    public void nhapchieucao(){
        nhapbankinh();
        System.out.print("Chieu cao = ");
        chieucao = sc.nextFloat();
    }
    public void tinhthetich(){
        tinhdientich();
        thetich = dientich * chieucao;
    }
}