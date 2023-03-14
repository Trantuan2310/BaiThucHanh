import java.util.Scanner;

public class Bai11{
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        do{
        System.out.print("Nhap vao kich thuoc cho mang: ");
        n = sc.nextInt();
        }while(n <= 0);
        int A[] = new int [n];
        for(int i = 0; i < A.length; i++){
            do{
                System.out.printf("Nhap vao phan tu thu %d: ", i);
                A[i] = sc.nextInt();
            }
            while(n <= 0);
        }
        for(int i = 0; i < A.length; i++){
            for(int j = i + 1; j < A.length; j++){
                if(A[i] > A[j]){
                    int a = A[i];
                    A[i] = A[j];
                    A[j] = a;
                }
            }
    }
    for(int i = 0; i < A.length; i++){
        System.out.println(A[i] + " ");
  }
}
}