import java.util.ArrayList;
import java.util.Scanner;

public class Slide110 {
    public static void main(String[] args) {
        ArrayList<Integer> arrListInteger = new ArrayList<>();
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao so phan tu cua ArrayList: ");
        n = sc.nextInt();
        for(int i = 0; i < n; i++){
            System.out.printf("Nhap vao phan tu thu %d: ", i);
            int number = sc.nextInt();
            arrListInteger.add(number);
        }
        System.out.println(arrListInteger);
        int max = arrListInteger.get(0);
        for(int i = 1; i < arrListInteger.size(); i++){
            if(arrListInteger.get(i) > max){
                max = arrListInteger.get(i);
            }
        }
        System.out.println("Phan tu lon nhat trong ArrayList = "+ max);

        System.out.print("Nhap vao phan tu muon xoa: ");
        int x = sc.nextInt();
        for(int i = 0; i < arrListInteger.size(); i++){
            if(arrListInteger.get(i) == x){
                arrListInteger.remove(i);
                i--;
            }
        }
        System.out.println("Day so sau khi xoa "+ x +" : " + arrListInteger);

        System.out.println("Cac phan tu sau khi sap xep: ");
        for(int i = 0; i < arrListInteger.size()-1; i++){
            for(int j = i+1; j < arrListInteger.size(); j ++){            
                if(arrListInteger.get(i) > arrListInteger.get(j)){
                    int temp = arrListInteger.get(i);
                    arrListInteger.set(i, arrListInteger.get(j));
                    arrListInteger.set(j, temp);
                }
            }
        }
        System.out.println(arrListInteger);
    } 
}