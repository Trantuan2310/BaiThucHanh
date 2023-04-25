package GetVaSet;

public class HinhChuNhat extends HinhHoc {
    public float dai;
    public float rong;
    public HinhChuNhat(float dai, float rong){
        this.dai = dai;
        this.rong = rong;
    }
    public HinhChuNhat(){
        ten = "Hinh chu nhat";
    }
    public void tinhchuvi(){
        chuvi = 2 * (dai + rong);
    }
    public void tinhdientich(){
        dientich = dai * rong;
    }
    public float getDai(){
        return dai;
    }
    public void setDai(float dai){
        this.dai = dai;
    }
    public float getRong(){
        return rong;
    }
    public void setRong(float rong){
        this.rong = rong;
    }
}
