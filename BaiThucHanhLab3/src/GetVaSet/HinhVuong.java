package GetVaSet;

public class HinhVuong extends HinhChuNhat{
    float canh;
    public HinhVuong(float canh){
        this.canh = canh;
    }
    public HinhVuong(){
        ten = "Hinh vuong";
    }
    public float getCanh(){
        return dai;
    }
    public void setCanh(float canh){
        this.dai = canh;
        this.rong = canh;
    }
}
