import java.io.IOException;

public class Slide15 {
    void m() throws IOException{
        throw new IOException("Loi thiet bi");
    }
    void n() throws IOException{
        m();
    }
    void p(){
        try {
            n();
        } catch (Exception e) {
            System.out.println("ngoai le duoc xu ly");
        }
    }
    public static void main(String[] args) {
        Slide15 sl = new Slide15();
        sl.p();
        System.out.println("luong binh thuong");
    }
}
