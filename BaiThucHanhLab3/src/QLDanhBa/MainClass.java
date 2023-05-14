package QLDanhBa;

public class MainClass {
    public static void main(String[] args) {
        Contact ct = new Contact("", "");
        ct.PhoneBook();
        ct.AddContact("Nguyen Van A", "0123456789");
        ct.UpdateContact("Nguyen Van B", "0987654321");
        ct.DeleteContact("Nguyen Van C");
        ct.SearchContact("Nguyen Van D");
    }
}