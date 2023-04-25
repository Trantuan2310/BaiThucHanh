package GetVaSet;

public class HinhTru extends HinhTron {
    public float chieucao;
    public HinhTru(float chieucao){
        this.chieucao = chieucao;
    }
    public HinhTru(){
        ten = "Hinh Tru";
    }
    public void tinhthetich(){
        tinhdientich();
        thetich = dientich * chieucao;
    }
    public float getChieucao(){
        return chieucao;
    }
    public void setChieucao(float chieucao){
        setBankinh(chieucao);
        this.chieucao = chieucao;
    }
}