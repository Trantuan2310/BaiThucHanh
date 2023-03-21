import java.util.Scanner;

public class hinhtron{
    final float PI = 3.14f;
    float r;
    float cv;
    float dt;
    Scanner sc = new Scanner(System.in);
    public void nhapbankinh(){
        System.out.print("Nhap vao ban kinh hinh tron: ");
        r = sc.nextFloat();
    }
    public void tinhchuvihinhtron(){
        cv = 2*PI*r;
        System.out.println("Chu vi hinh tron la: "+ cv);
    }
    public void tinhdientichhinhtron(){
        dt = 2*PI*r*r;
        System.out.println("Dien tich hinh tron: "+ dt);
    }
}