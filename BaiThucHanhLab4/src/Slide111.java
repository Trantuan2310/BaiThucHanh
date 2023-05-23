import java.util.LinkedList;
import java.util.Scanner;

public class Slide111 {
    public static void main(String[] args) {
        LinkedList<Integer> linkedListInteger = new LinkedList<>();
        int n;
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao so phan tu cua LinkedList: ");
        n = sc.nextInt();
        for(int i = 0; i < n; i++){
            System.out.printf("Nhap vao phan tu thu %d: ", i+1);
            int number = sc.nextInt();          
            linkedListInteger.add(number);
        }
        for(int i = 0; i < linkedListInteger.size(); i++){
            if(linkedListInteger.get(i) %2 == 0){
                sum += linkedListInteger.get(i);
            }
        }
        System.out.println("Trung binh cong cua cac so chan la: "+ sum/n);
    }
}