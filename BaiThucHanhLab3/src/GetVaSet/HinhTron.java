package GetVaSet;

public class HinhTron extends HinhHoc{
    public float bankinh;
    public HinhTron(float bankinh){
        this.bankinh = bankinh;
    }
    public HinhTron(){
        ten = "Hinh Tron";
    }
    public void tinhchuvi(){
        chuvi = 2 * PI * bankinh;
    }
    public void tinhdientich(){
        dientich = PI * bankinh * bankinh;
    }
    public float getBankinh(){
        return bankinh;
    }
    public void setBankinh(float bankinh){
        this.bankinh = bankinh;
    }
}
