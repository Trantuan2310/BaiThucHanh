import java.util.*;

public class Slide113 {
    public static void main(String[] args) {
        Set<String> fruits = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ten cac loai trai cay (cach nhau boi dau phay): ");
        String traicay = sc.nextLine();
        String[] fruitNames = traicay.split(",");
        for (String fruitName : fruitNames) {
            fruits.add(fruitName.trim());
        }
        System.out.println("So phan tu trong HashSet: " + fruits.size());

        System.out.print("Nhap ten 1 loai trai cay: ");
        String fruitName = sc.nextLine();
        if (fruits.contains(fruitName)) {
            System.out.println("Tim thay loai trai cay" + fruitName);
        } else {
            System.out.println("Khong tim thay loai trai cay" + fruitName);
        }

        System.out.print("Nhap ten loai trai cay muon xoa: ");
        fruitName = sc.nextLine();
        if (fruits.remove(fruitName)) {
            System.out.println("Da xoa loai trai cay " + fruitName);
        } else {
            System.out.println("Khong tim thay loai trai cay " + fruitName + " de xoa");
        }
        System.out.println("Cac phan tu con lai trong HasgSet:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        List<String> fruitList = new ArrayList<>();
        fruitList.add("Cam");
        fruitList.add("Dua hau");
        fruitList.add("Chuoi");
        fruitList.add("Tao");
        fruitList.add("Dau tay");
        fruits.addAll(fruitList);

        System.out.println("Cac phan tu trong HashSet sau khi them List:");
        Iterator<String> iterator = fruits.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        fruits.removeAll(fruitList);
        System.out.println("Cac phan tu trong HashSet sau khi xoa List:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}