package Main;

import Shapes.HinhChuNhat;
import Shapes.HinhTron;
import Shapes.HinhTru;
import Shapes.HinhVuong;

public class MainClass {
    public static void main(String[] args) {
//Hình tròn
        HinhTron ht = new HinhTron();
        ht.xuatten();
        ht.nhapbankinh();
        ht.tinhchuvi();
        ht.tinhdientich();
        ht.inchuvi();
        ht.indientich();
//Hình trụ
        HinhTru htr = new HinhTru();
        htr.xuatten();
        htr.nhapchieucao();
        htr.tinhthetich();
        htr.inthetich();
//Hình chữ nhật
        HinhChuNhat htn = new HinhChuNhat();
        htn.xuatten();
        htn.nhapchieudai();
        htn.nhapchieurong();
        htn.tinhchuvi();
        htn.tinhdientich();
        htn.inchuvi();
        htn.indientich();
//Hình vuông
        HinhVuong hv = new HinhVuong();
        hv.xuatten();
        hv.nhapcanh();
        hv.tinhchuvi();
        hv.tinhdientich();
        hv.inchuvi();
        hv.indientich();
    }
}
