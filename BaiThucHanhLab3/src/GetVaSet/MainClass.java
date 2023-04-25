package GetVaSet;

public class MainClass{
    public static void main(String[] args) {
//Hình tròn
        HinhTron ht = new HinhTron();
        ht.xuatten();
        ht.setBankinh(10);
        ht.tinhchuvi();
        ht.tinhdientich();
        ht.inchuvi();
        ht.indientich();
//Hình trụ
        HinhTru htr = new HinhTru();
        htr.xuatten();
        htr.setChieucao(10);
        htr.tinhthetich();
        htr.inthetich();
//Hình chữ nhật
        HinhChuNhat hcn = new HinhChuNhat();
        hcn.xuatten();
        hcn.setDai(10);
        hcn.setRong(10);
        hcn.tinhchuvi();
        hcn.tinhdientich();
        hcn.inchuvi();
        hcn.indientich();
//Hình Vuông
        HinhVuong hv = new HinhVuong();
        hv.xuatten();
        hv.setCanh(10);
        hv.tinhchuvi();
        hv.tinhdientich();
        hv.inchuvi();
        hv.indientich();
    }
}